package com.ks94.colourtester;

import android.app.Activity;
import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.view.ViewGroup.LayoutParams;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResultsActivity extends Activity
{

    public static final String EXTRA_IMAGE = "EXTRA_IMAGE";
    public static final String EXTRA_BASIC_BOOL = "EXTRA_BASIC_BOOL";

    ProgressDialog progressBar;
    private int progressBarStatus = 0;

    List<ColourCounter> orderedList = null;

    TextView txtColourname1, txtColourname2, txtColourname3;
    TextView txtPercentage1, txtPercentage2, txtPercentage3;
    ImageView imgColour1, imgColour2, imgColour3;

    boolean isBasicMode;

    ColourUtil colourUtil;

    int totalPixelsTemp;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        isBasicMode = getIntent().getBooleanExtra(EXTRA_BASIC_BOOL, false);

        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);
        assignControls();
        setControlVisibility(savedInstanceState != null);

        ImageView imgView = (ImageView) findViewById(R.id.edit_imgview);

        if(savedInstanceState == null)
        {
            Bitmap bitmap = (Bitmap) getIntent().getParcelableExtra(EXTRA_IMAGE);
            imgView.setImageBitmap(bitmap);

            calculateResults(bitmap);
        }
        else
        {
            Bitmap bitmap = (Bitmap)savedInstanceState.getParcelable("img");
            imgView.setImageBitmap(bitmap);

            totalPixelsTemp = savedInstanceState.getInt("totalPixelsTemp");

            Parcelable[] parcelableArray =
                    savedInstanceState.getParcelableArray("orderedList");
            ColourCounter[] resultArray = null;
            if (parcelableArray != null) {
                resultArray = Arrays.copyOf(parcelableArray, parcelableArray.length, ColourCounter[].class);
            }
            orderedList = Arrays.asList(resultArray);
            displayResults(totalPixelsTemp);
        }
    }

    @Override
    protected void onStop()
    {
        super.onStop();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        ImageView imgView = (ImageView) findViewById(R.id.edit_imgview);
        outState.putParcelable("img", ((BitmapDrawable)imgView.getDrawable()).getBitmap());

        outState.putInt("totalPixelsTemp", totalPixelsTemp);

        outState.putParcelableArray("orderedList", orderedList.toArray(new ColourCounter[0]));
    }

    private void assignControls()
    {
        txtColourname1 = (TextView) findViewById(R.id.colour_name_txt_1);
        txtColourname2 = (TextView) findViewById(R.id.colour_name_txt_2);
        txtColourname3 = (TextView) findViewById(R.id.colour_name_txt_3);

        txtPercentage1 = (TextView) findViewById(R.id.colour_percentage_txt_1);
        txtPercentage2 = (TextView) findViewById(R.id.colour_percentage_txt_2);
        txtPercentage3 = (TextView) findViewById(R.id.colour_percentage_txt_3);

        imgColour1 = (ImageView) findViewById(R.id.colour_img_1);
        imgColour2 = (ImageView) findViewById(R.id.colour_img_2);
        imgColour3 = (ImageView) findViewById(R.id.colour_img_3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void calculateResults(Bitmap bitmap)
    {
        progressBar = new ProgressDialog(ResultsActivity.this);
        progressBar.setCancelable(true);
        progressBar.setMessage("Analysing pixels ...");
        progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressBar.setProgress(0);
        progressBar.setMax(100);
        progressBar.show();

        new CalculateResultsTask().execute(bitmap);

    }


    private void setControlVisibility(boolean visible)
    {
        int visibility = visible ? View.VISIBLE : View.INVISIBLE;
        txtColourname1.setVisibility(visibility);
        txtColourname2.setVisibility(visibility);
        txtColourname3.setVisibility(visibility);
        txtPercentage1.setVisibility(visibility);
        txtPercentage2.setVisibility(visibility);
        txtPercentage3.setVisibility(visibility);
        imgColour1.setVisibility(visibility);
        imgColour2.setVisibility(visibility);
        imgColour3.setVisibility(visibility);
    }

    private void displayResults(int totalPixels)
    {
        TextView txtColourname1 = (TextView) findViewById(R.id.colour_name_txt_1);
        TextView txtColourname2 = (TextView) findViewById(R.id.colour_name_txt_2);
        TextView txtColourname3 = (TextView) findViewById(R.id.colour_name_txt_3);

        TextView txtPercentage1 = (TextView) findViewById(R.id.colour_percentage_txt_1);
        TextView txtPercentage2 = (TextView) findViewById(R.id.colour_percentage_txt_2);
        TextView txtPercentage3 = (TextView) findViewById(R.id.colour_percentage_txt_3);

        ImageView imgColour1 = (ImageView) findViewById(R.id.colour_img_1);
        ImageView imgColour2 = (ImageView) findViewById(R.id.colour_img_2);
        ImageView imgColour3 = (ImageView) findViewById(R.id.colour_img_3);

        if (orderedList.size() > 0)
        {
            setResult(orderedList.get(0), txtColourname1, txtPercentage1, imgColour1, totalPixels);
        }
        if (orderedList.size() > 1)
        {
            setResult(orderedList.get(1), txtColourname2, txtPercentage2, imgColour2, totalPixels);
        }
        if (orderedList.size() > 2)
        {
            setResult(orderedList.get(2), txtColourname3, txtPercentage3, imgColour3, totalPixels);
        }
    }

    private class CalculateResultsTask extends AsyncTask<Bitmap, Integer, Boolean>
    {
        int totalPixels = 0;

        @Override
        protected void onPreExecute()
        {

        }

        @Override
        protected Boolean doInBackground(Bitmap... bitmaps)
        {
            StopWatch sw = new StopWatch();
            Bitmap bitmap = bitmaps[0];
            sw.start();
            Log.v("STOPWATCHABC start", "" + sw.getElapsedTime());


            Log.v("STOPWATCHABC controls", "" + sw.getElapsedTime());

            int[] pixelsArray;
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();

            pixelsArray = new int[height * width];

            totalPixels = pixelsArray.length;

            bitmap.getPixels(pixelsArray, 0, width, 1, 1, width - 1, height - 1);

            Log.v("STOPWATCHABC getpixels", "" + sw.getElapsedTime());

            colourUtil = new ColourUtil(isBasicMode);

            String tempColourName;
            Map<String, Integer> colourMap = new HashMap<String, Integer>();

            for (int i = 0; i < pixelsArray.length; i++)
            {
                tempColourName = colourUtil.getColorNameFromHex(pixelsArray[i]);
                if (colourMap.containsKey(tempColourName))
                {
                    int count = colourMap.get(tempColourName) + 1;
                    colourMap.put(tempColourName, count);
                } else colourMap.put(tempColourName, 1);

                if (i % 500 == 0)
                {
                    publishProgress(i);
                }
            }
            Log.v("ABCnumber of pixels", "" + pixelsArray.length);

            Log.v("STOPWATCHABC iterpixels", "" + sw.getElapsedTime());

            orderedList = new ArrayList<>();

            for (Map.Entry<String, Integer> entry : colourMap.entrySet())
            {
                orderedList.add(new ColourCounter(entry.getKey(), entry.getValue(), totalPixels,
                        colourUtil.getColorFromName(entry.getKey()).getColorValue()));
            }

            Collections.sort(orderedList, Collections.reverseOrder());

            return true;
        }

        @Override
        protected void onPostExecute(Boolean success)
        {
            if (success)
            {
                displayResults(totalPixels);
                setControlVisibility(true);
                totalPixelsTemp = totalPixels;
                progressBar.dismiss();
            } else
            {
                Toast.makeText(ResultsActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        }

        @Override
        protected void onProgressUpdate(Integer... values)
        {
            //super.onProgressUpdate(values);
            int count = values[0];

            //DecimalFormat df2 = new DecimalFormat("#0.#");
            int percentage = (count * 100) / totalPixels;

            progressBar.setProgress(percentage);
        }


    }

    private void setResult(ColourCounter colourCounter, TextView tvName, TextView tvPercentage, ImageView imgColour, int totalLength)
    {
        tvName.setText(colourCounter.getName());
        tvPercentage.setText(colourCounter.getPercentageStr());

        ColourUtil.ColorName color = colourUtil.getColorFromName(colourCounter.getName());
        imgColour.setBackgroundColor(color.getColorValue());
    }


    public void viewAllResults_onClick(View view)
    {
//        LayoutInflater layoutInflater
//                = (LayoutInflater) getBaseContext()
//                .getSystemService(LAYOUT_INFLATER_SERVICE);
//        View popupView = layoutInflater.inflate(R.layout.results_popup, null);
//
//        final PopupWindow popupWindow = new PopupWindow(
//                popupView,
//                LayoutParams.WRAP_CONTENT,
//                LayoutParams.WRAP_CONTENT);
//
//        Button btnDismiss = (Button) popupView.findViewById(R.id.dismiss);
//        btnDismiss.setOnClickListener(new Button.OnClickListener()
//        {
//
//            @Override
//            public void onClick(View v)
//            {
//                // TODO Auto-generated method stub
//                popupWindow.dismiss();
//            }
//        });
//
//        popupWindow.setBackgroundDrawable(new ColorDrawable(
//                Color.DKGRAY));
//
//        //will need to set the list view here
//
//
//        Button btn = (Button) findViewById(R.id.btnExpandResults);
//        popupWindow.showAtLocation(findViewById(R.id.edit_imgview), Gravity.CENTER, 0, 0);
//
//        ListView listView = (ListView) popupView.findViewById(R.id.results_list_view);
//
//        ResultAdapter listAdapter = new ResultAdapter(this, orderedList.toArray(new ColourCounter[0]));
//
//        listView.setAdapter(listAdapter);

        //changed so shows in new activity rather than a popup

        Intent intent = new Intent(this, AdvancedResultsActivity.class);
        intent.putExtra(AdvancedResultsActivity.EXTRA_RESULTS_ARRAY,  orderedList.toArray(new ColourCounter[0]));

        startActivity(intent);

    }




}





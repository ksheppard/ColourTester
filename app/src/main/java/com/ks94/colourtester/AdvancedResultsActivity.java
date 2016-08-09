package com.ks94.colourtester;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.Arrays;

public class AdvancedResultsActivity extends Activity
{
    public static final String EXTRA_RESULTS_ARRAY = "EXTRA_RESULTS_ARRAY";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results_popup); //decided to use activity instead of popup

//        Button btnDismiss = (Button) findViewById(R.id.dismiss);
//        btnDismiss.setOnClickListener(new Button.OnClickListener()
//        {
//
//            @Override
//            public void onClick(View v)
//            {
//                // TODO Auto-generated method stub
//                //popupWindow.dismiss();
//            }
//        });

        ListView listView = (ListView) findViewById(R.id.results_list_view);

        Parcelable[] parcelableArray =
                getIntent().getParcelableArrayExtra(EXTRA_RESULTS_ARRAY);
        ColourCounter[] resultArray = null;
        if (parcelableArray != null) {
            resultArray = Arrays.copyOf(parcelableArray, parcelableArray.length, ColourCounter[].class);
        }

        ResultAdapter listAdapter = new ResultAdapter(this, resultArray);

        listView.setAdapter(listAdapter);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()== android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

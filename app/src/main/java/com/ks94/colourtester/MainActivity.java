package com.ks94.colourtester;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends Activity
{
    static final int REQUEST_IMAGE_CAPTURE = 1;
    private final boolean BASIC_MODE_ENABLED = false;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private void checkBasicModeEnabled()
    {
        Switch switchAdv = (Switch) findViewById(R.id.switchAdv);
        switchAdv.setVisibility(BASIC_MODE_ENABLED ? View.VISIBLE : View.INVISIBLE);
    }

    public void uploadOnClick(View view)
    {
        galleryIntent();
    }

    public void cameraOnClick(View view)
    {
        cameraIntent();
    }

    private void cameraIntent()
    {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 0);
    }

    private void galleryIntent()
    {
        Intent intent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//        intent.setType("image");
//        intent.setAction();//
        startActivityForResult(Intent.createChooser(intent, "Select File"), 1);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK)
        {
            if (requestCode == 0)
                onCaptureImageResult(data);
            else if (requestCode == 1)
                onSelectFromGalleryResult(data);
            else if (requestCode == 2)
                goToEditImgActivity((Bitmap) data.getExtras().get("data"));
        }
    }

    @SuppressWarnings("deprecation")
    private void onSelectFromGalleryResult(Intent data)
    {
        Bitmap bm = null;
        if (data != null)
        {
//            try
//            {
                Uri selectedImage = data.getData();
                performCrop(selectedImage);
                //bm = MediaStore.Images.Media.getBitmap(getApplicationContext().getContentResolver(), data.getData());
//            } catch (IOException e)
//            {
//                e.printStackTrace();
//            }
        }
    }

    private void onCaptureImageResult(Intent data)
    {
        Bitmap thumbnail = (Bitmap) data.getExtras().get("data");
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        thumbnail.compress(Bitmap.CompressFormat.JPEG, 90, bytes);
        File destination = new File(Environment.getExternalStorageDirectory(),
                System.currentTimeMillis() + ".jpg");
        FileOutputStream fo;
        try
        {
            destination.createNewFile();
            fo = new FileOutputStream(destination);
            fo.write(bytes.toByteArray());
            fo.close();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        Uri uri = data.getData();
        performCrop(uri);

        //goToEditImgActivity(thumbnail);
        //ivImage.setImageBitmap(thumbnail);
    }

    private void goToEditImgActivity(Bitmap bitmap)
    {
        Intent intent = new Intent(this, ResultsActivity.class);
        intent.putExtra(ResultsActivity.EXTRA_IMAGE, bitmap);

        Switch switchAdv = (Switch) findViewById(R.id.switchAdv);
        intent.putExtra(ResultsActivity.EXTRA_BASIC_BOOL, switchAdv.isChecked());

        startActivity(intent);
    }


    private void performCrop(Uri uri)
    {
        try
        {
            Intent cropIntent = new Intent("com.android.camera.action.CROP");
            //indicate image type and Uri
            cropIntent.setDataAndType(uri, "image/*");
            //set crop properties
            cropIntent.putExtra("crop", "true");
            //indicate aspect of desired crop
            cropIntent.putExtra("aspectX", 1);
            cropIntent.putExtra("aspectY", 1);
            //indicate output X and Y
            //cropIntent.putExtra("outputX", 128);
            //cropIntent.putExtra("outputY", 128);
            cropIntent.putExtra("outputX", 32);
            cropIntent.putExtra("outputY", 32);
            //retrieve data on return
            cropIntent.putExtra("return-data", true);
            //start the activity - we handle returning in onActivityResult
            startActivityForResult(cropIntent, 2);
        } catch (ActivityNotFoundException anfe)
        {
            //display an error message
            String errorMessage = "Whoops - your device doesn't support the crop action!";
            Toast toast = Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT);
            toast.show();
        }
    }

}

package com.ks94.colourtester;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Kyran on 07/08/2016.
 */
public class ResultAdapter extends BaseAdapter
{

    Context context;
    ColourCounter[] data;
    private static LayoutInflater inflater = null;

    public ResultAdapter(Context context, ColourCounter[] data) {
        // TODO Auto-generated constructor stub
        this.context = context;
        this.data = data;
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View vi = convertView;
        if (vi == null)
            vi = inflater.inflate(R.layout.popup_row, null);


        TextView txtColName = (TextView) vi.findViewById(R.id.colour_name_txt);
        txtColName.setText(data[position].getName());
        TextView txtPercentage = (TextView) vi.findViewById(R.id.colour_percentage_txt);
        txtPercentage.setText(data[position].getPercentageStr());

        ImageView imgColour = (ImageView) vi.findViewById(R.id.colour_img);

        imgColour.setBackgroundColor(data[position].getColorVal());

        return vi;
    }
}


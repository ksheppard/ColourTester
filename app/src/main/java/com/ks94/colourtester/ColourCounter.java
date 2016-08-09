package com.ks94.colourtester;

import android.os.Parcel;
import android.os.Parcelable;

import java.text.DecimalFormat;

/**
 * Created by Kyran on 09/08/2016.
 */
public class ColourCounter implements Comparable<ColourCounter>, Parcelable
{
    private String name;
    private int count;
    private String percentageStr = "";
    private int colorVal;

    public ColourCounter(String name)
    {
        this.name = name;
        count = 1;
    }

    public ColourCounter(String name, int count, int totalCount, int colorVal)
    {
        this.name = name;
        this.count = count;

        setPercentage(totalCount);

        this.colorVal = colorVal;
    }

    public void incrementCount()
    {
        count++;
    }

    public String getName()
    {
        return name;
    }

    public int getCount()
    {
        return count;
    }

    public int getColorVal()
    {
        return colorVal;
    }

    public String getPercentageStr(){ return percentageStr; }

    @Override
    public int compareTo(ColourCounter another)
    {

        return this.count < another.count ? -1 : this.count == another.count ? 0 : 1;
    }

    public void setPercentage(int total)
    {
        DecimalFormat df2 = new DecimalFormat("#0.##");

        float percentage = (count * 100.0f) / total;

        percentageStr = df2.format(percentage) + "%";
    }




    protected ColourCounter(Parcel in) {
        name = in.readString();
        count = in.readInt();
        percentageStr = in.readString();
        colorVal = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(count);
        dest.writeString(percentageStr);
        dest.writeInt(colorVal);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<ColourCounter> CREATOR = new Parcelable.Creator<ColourCounter>() {
        @Override
        public ColourCounter createFromParcel(Parcel in) {
            return new ColourCounter(in);
        }

        @Override
        public ColourCounter[] newArray(int size) {
            return new ColourCounter[size];
        }
    };
}

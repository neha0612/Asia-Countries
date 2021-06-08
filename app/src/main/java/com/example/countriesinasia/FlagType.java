package com.example.countriesinasia;

public class FlagType
{
    int mImg;
    String mCountryName;
    String mCapitalName;
    String mRegionsName;
    int mPopulation;
    String mBorders;
    String mLanguages;

    public FlagType(int mImg, String mCountryName, String mCapitalName, String mRegionsName,
                    int mPopulation, String mBorders, String mLanguages)
    {
        this.mImg = mImg;
        this.mCountryName = mCountryName;
        this.mCapitalName = mCapitalName;
        this.mRegionsName = mRegionsName;
        this.mPopulation = mPopulation;
        this.mBorders = mBorders;
        this.mLanguages = mLanguages;
    }

    public int getmImg()
    {
        return mImg;
    }
    public void setmImg(int mImg)
    {
        this.mImg = mImg;
    }

    public String getmCountryName()
    {
        return mCountryName;
    }
    public void setmCountryName(String mCountryName)
    {
        this.mCountryName = mCountryName;
    }

    public String getmCapitalName()
    {
        return mCapitalName;
    }
    public void setmCapitalName(String mCapitalName)
    {
        this.mCapitalName = mCapitalName;
    }

    public String getmRegionsName()
    {
        return mRegionsName;
    }
    public void setmRegionsName(String mRegionsName)
    {
        this.mRegionsName = mRegionsName;
    }

    public int getmPopulation() {
        return mPopulation;
    }

    public void setmPopulation(int mPopulation) {
        this.mPopulation = mPopulation;
    }

    public String getmBorders() {
        return mBorders;
    }

    public void setmBorders(String mBorders) {
        this.mBorders = mBorders;
    }

    public String getmLanguages() {
        return mLanguages;
    }

    public void setmLanguages(String mLanguages) {
        this.mLanguages = mLanguages;
    }
}


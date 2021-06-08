package com.example.countriesinasia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.countriesinasia.MainActivity.dataList;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        int position = getIntent().getExtras().getInt("key");

        ImageView flagImage = (ImageView)findViewById(R.id.iv_activity_details_img);
        TextView tvCountry = (TextView)findViewById(R.id.tv_activity_details_country);
        TextView tvCapital = (TextView)findViewById(R.id.tv_activity_details_country_capital);
        TextView tvRegion = (TextView)findViewById(R.id.tv_activity_details_country_region);
        TextView tvPopulation =(TextView)findViewById(R.id.tv_activity_details_country_population);
        TextView tvBorder = (TextView)findViewById(R.id.tv_activity_details_country_borders);
        TextView tvLanguages = (TextView)findViewById(R.id.tv_activity_details_country_languages);

        flagImage.setImageResource(dataList.get(position).getmImg());
        tvCountry.setText(dataList.get(position).getmCountryName());
        tvCapital.setText(dataList.get(position).getmCapitalName());
        tvRegion.setText(dataList.get(position).getmRegionsName());
        tvPopulation.setText(dataList.get(position).getmPopulation());
        tvBorder.setText(dataList.get(position).getmBorders());
        tvLanguages.setText(dataList.get(position).getmLanguages());

    }
}
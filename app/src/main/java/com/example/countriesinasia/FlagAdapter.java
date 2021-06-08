package com.example.countriesinasia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class FlagAdapter extends ArrayAdapter {

    List<FlagType> userDataInfo = new ArrayList<FlagType>();
    
    public FlagAdapter(@NonNull Context context, List<FlagType> userDataInfo) {
        super(context, R.layout.item_flag, userDataInfo);
        this.userDataInfo = userDataInfo;

    }
    
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        
        LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.item_flag,parent,false);

        ImageView flagImage = row.findViewById(R.id.iv_item_flag_img);
        TextView tvCountry = row.findViewById(R.id.tv_item_flag);
        TextView tvCapital = row.findViewById(R.id.tv_activity_details_country_capital);
        TextView tvRegion = row.findViewById(R.id.tv_activity_details_country_region);
        TextView tvPopulation = row.findViewById(R.id.tv_activity_details_country_population);
        TextView tvBorder = row.findViewById(R.id.tv_activity_details_country_borders);
        TextView tvLanguages = row.findViewById(R.id.tv_activity_details_country_languages);

        flagImage.setImageResource(userDataInfo.get(position).getmImg());
        tvCountry.setText(userDataInfo.get(position).getmCountryName());
        tvCapital.setText(userDataInfo.get(position).getmCapitalName());
        tvRegion.setText(userDataInfo.get(position).getmRegionsName());
        tvPopulation.setText(userDataInfo.get(position).getmPopulation());
        tvBorder.setText(userDataInfo.get(position).getmBorders());
        tvLanguages.setText(userDataInfo.get(position).getmLanguages());

        return row;
        
    }


}

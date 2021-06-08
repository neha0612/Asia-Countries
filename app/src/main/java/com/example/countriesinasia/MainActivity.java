package com.example.countriesinasia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    static List<FlagType> dataList;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
try {
    ListView lvFlagList = (ListView) findViewById(R.id.lv_activity_main_list);
    dataList = new ArrayList<FlagType>();
    dataList.add(new FlagType(R.drawable.afghanistan, "Afghanistan", "Kabul", "South-Eastern Asia",
            38928346, "Durand Line", "Pashto, Dari"));

    dataList.add(new FlagType(R.drawable.armenia, "Armenia", "Yerevan", "Western Asia",
            2968398, "Turkey", "Armenian"));

    dataList.add(new FlagType(R.drawable.azerbaijan, "Azerbaijan", "Baku", "Western Asia",
            10139177, "Iran", "Azerbaijani"));


    dataList.add(new FlagType(R.drawable.bahrain, "Bahrain", "Manama", "Western Asia",
            1701575, "Iran, Qatar,Saudi Arebia", "Arabic"));

    dataList.add(new FlagType(R.drawable.bangladesh, "Bangladesh", "Dhaka", "Southern Asia",
            166208691, "India", "Bengali"));

    dataList.add(new FlagType(R.drawable.bhutan, "Bhutan", "Thimphu", "Southern Asia",
            771608, "India", "Dzongkha"));

    dataList.add(new FlagType(R.drawable.brunei, "Brunei", "Bandar Seri Begawan", "South-Eastern Asia",
            437479, "South China, Malaysia", "Malay"));


    dataList.add(new FlagType(R.drawable.combodia, "Cambodia", "Phnom Penh", "South-Eastern Asia",
            16933607, "Laos, Thailand, Vietnam", "Khmer"));

    dataList.add(new FlagType(R.drawable.china, "China", "Beijing", "Eastern asia",
            1439323776, "Bhutan, Myanmar, Pakistan", "Mandarin"));


    dataList.add(new FlagType(R.drawable.east_timor, "East Timor", "Dili", "South-eastern asia",
            183643, "Indonesia", "Portuguese"));


    dataList.add(new FlagType(R.drawable.georgia, "Georgia", "Tbillisi", "Western Asia",
            3989167, "Russia, Turkey, Armenia, Azerbaijian", "Georgian"));


    dataList.add(new FlagType(R.drawable.india, "India", "New Delhi", "Southern Asia",
            1392605249, "China, Bhutan, Pakistan, Bangladesh, Myanmar", "Hindi, Bengali, Tamil"));

    dataList.add(new FlagType(R.drawable.indonesia, "Indonesia", "Jakarta", "South-Eastern Asia",
            273523615, "East Timor, Malaysia", "Indonesian"));

    dataList.add(new FlagType(R.drawable.iran, "Iran", "Tehran", "Southern Asia",
            83992949, "Armenia, Turkmenistan", "Dari, old Persian"));

    dataList.add(new FlagType(R.drawable.iraq, "Iraq", "Baghdad", "Western Asia",
            40222493, "Turkey,Iran", "Arabic"));

    dataList.add(new FlagType(R.drawable.israel, "Israel", "Jerusalem", "Western Asia",
            9291000, "Lebanon,Syria, Egypt", "Hebrew"));


    dataList.add(new FlagType(R.drawable.japan, "Japan", "Tokyo", "Eastern Asia",
            126115684, "Russia", "Japanese"));

    dataList.add(new FlagType(R.drawable.jordan, "Jordan", "Amman", "Western Asia",
            10203134, "Syria, Iraq", "Arabic"));


    dataList.add(new FlagType(R.drawable.kazakhstan, "Kazakhstan", "Nur-Sultan", "Central Asia",
            18985170, "Russia, China, Kyrgyzstan", "Russian"));

    dataList.add(new FlagType(R.drawable.korea_north, "Korea North", "Pyongyang", "Eastern Asia",
            25778816, "China, Russia", "Korean"));

    dataList.add(new FlagType(R.drawable.korea_south, "Korea South", "Seoul", "Eastern Asia",
            51269185, "North Corea", "Korean"));

    dataList.add(new FlagType(R.drawable.kuwait, "Kuwait", "Kuwait City", "Western Asia",
            4270571, "Iraq, Persian Gulf", "Arabic"));

    dataList.add(new FlagType(R.drawable.kyrgyzstan, "Kyrgyzstan", "Bishkek", "Central Asia",
            6524195, "Kazakhstan, China", "Russian"));


    dataList.add(new FlagType(R.drawable.laos, "Laos", "Vientiane", "South-Eastern Asia",
            7275560, "China, Vietnam", "Lao"));

    dataList.add(new FlagType(R.drawable.lebanon, "Lebanon", "Beirut", "Western Asia",
            6796955, "Syria,Israel", "Arebic"));


    dataList.add(new FlagType(R.drawable.malaysia, "Malaysia", "Kuala Lumpur", "South-Eastern Asia",
            32776194, "Thailand, Indonesia, Brunei", "Malay"));

    dataList.add(new FlagType(R.drawable.maldives, "Maldives", "Male", "Southern Asia",
            540544, "India, Sri-Lanka", "Dhivehi"));

    dataList.add(new FlagType(R.drawable.mongolia, "Mongolia", "Ulaanbaatar", "Eastern Asia",
            3278290, "Russia, China", "Mongolian"));

    dataList.add(new FlagType(R.drawable.myanmar, "Myanmar", "Naypyidaw", "South-Eastern Asia",
            54409800, "China, Laos, Thailand", "Burmese"));

    dataList.add(new FlagType(R.drawable.nepal, "Nepal", "Kathmandu", "Southern Asia",
            29674920, "India", "Nepali"));

    dataList.add(new FlagType(R.drawable.oman, "Oman", "Muscat", "Western Asia",
            5106626, "Yemen", "Arabic"));

    dataList.add(new FlagType(R.drawable.pakistan, "Pakistan", "Islamabad", "Southern Asia",
            225199937, "India, China, Iran", "Urdu, English"));

    dataList.add(new FlagType(R.drawable.palestine, "Palestine", "Ramallah", "Western Asia",
            5101414, "Syria, Lebanon", "Arabic"));

    dataList.add(new FlagType(R.drawable.philippines, "Philippines", "Manila", "South-Eastern Asia",
            111046913, "China, Indonesia", "Filipino, English"));

    dataList.add(new FlagType(R.drawable.qatar, "Qatar", "Doha", "Western Asia",
            2881053, "Saudi Arabia", "Arabic"));

    dataList.add(new FlagType(R.drawable.saudi_arabia, "Saudi Arabia", "Riyadh", "Western Asia",
            34813871, "Jordan, iraq, Kuwait", "Arabic"));

    dataList.add(new FlagType(R.drawable.singapore, "Singapore", "Singapore", "South-Eastern Asia",
            5896686, "Thailand, Bangkok", "English, Malay, Tamil"));

    dataList.add(new FlagType(R.drawable.sri_lanka, "Sri Lanka", "Colombo", "Southern Asia",
            21495539, "India", "Sinhala, Tamil"));

    dataList.add(new FlagType(R.drawable.syria, "Syria", "Damascus", "Western Asia",
            17500658, "Turkey,Iraq", "Arabic"));


    dataList.add(new FlagType(R.drawable.taiwan, "Taiwan", "Taipei", "Eastern Asia",
            23856896, "China", "Mandarin chinese"));

    dataList.add(new FlagType(R.drawable.tajikistan, "Tajikistan", "Dushanbe", "Central Asia",
            9735833, "Kyrgyzstan, Uzbekistan, China", "Tajiki"));

    dataList.add(new FlagType(R.drawable.thailand, "Thailand", "Bangkok", "South-Eastern Asia",
            69799978, "Myanmar, Malaysia, Laos", "Thai"));

    dataList.add(new FlagType(R.drawable.turkey, "Turkey", "Ankara", "Western Asia",
            84339067, "Georgia, Aemenia, Iran, Iraq", "Turkish"));

    dataList.add(new FlagType(R.drawable.turkmenistan, "Turkmenistan", "Ashgabat", "Central Asia",
            6031200, "Kazakhstan", "Turkmen"));


    dataList.add(new FlagType(R.drawable.united_arab_emirates, "United Arab Emirates", "Abu Dhabi", "Western Asia",
            10000986, "Saudi Arebia, Oman", "Arabic"));

    dataList.add(new FlagType(R.drawable.uzbekistan, "Uzbekistan", "Tashkent", "Central Asia",
            33469203, "Kazakhstan, Kyrgyzstan", "Uzbek"));

    dataList.add(new FlagType(R.drawable.vietnam, "Vietnam", "Hanoi", "South-Eastern Asia",
            97338579, "Thailand, Tonkin", "Vietnamese"));

    dataList.add(new FlagType(R.drawable.yemen, "Yemen", "Sana'a", "Southern Asia",
            29825964, "Oman, Saudi Arebia", "Arabic"));

    FlagAdapter adapter = new FlagAdapter(getApplicationContext(), dataList);
    lvFlagList.setAdapter(adapter);

    lvFlagList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent = new Intent(getApplicationContext(), DetailsActivity.class);
            intent.putExtra("key", position);
            startActivity(intent);
        }
    });
} catch (Exception e) {
    e.printStackTrace();
}

    }
}
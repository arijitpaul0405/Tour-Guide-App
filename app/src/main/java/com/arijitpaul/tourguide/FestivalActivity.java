package com.arijitpaul.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import com.arijitpaul.tourguide.Adapters.CustomAdapter;
import com.arijitpaul.tourguide.CustomClass.WordClass;

import java.util.ArrayList;

public class FestivalActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ArrayList<WordClass> list = new ArrayList<>();
        list.add(new WordClass(R.drawable.saraswati_puja, "Saraswati Puja", getString(R.string.saraswati_puja), true));
        list.add(new WordClass(R.drawable.basanta_durga_puja, "Basanti Durga Puja", getString(R.string.basanti_durga_puja), true));
        list.add(new WordClass(R.drawable.poila_boishakh, "Poila Boishakh", getString(R.string.poila_boishakh), true));
        list.add(new WordClass(R.drawable.jamai_sasthi, "Jamai Shoshti", getString(R.string.jamai_shosti), true));
        list.add(new WordClass(R.drawable.durga_puja, "Durga Puja", getString(R.string.durga_puja), true));
        list.add(new WordClass(R.drawable.lakshmi_puja, "Lakshmi Puja", getString(R.string.lakshmi_puja), true));
        list.add(new WordClass(R.drawable.kali_puja, "Kali Puja", getString(R.string.kali_puja), true));
        list.add(new WordClass(R.drawable.bhai_phota, "Bhai Phota", getString(R.string.bhai_phota), true));
        list.add(new WordClass(R.drawable.dover_lane_music, "Dover Lane Music Festival", getString(R.string.dover_lane_music_festival), true));
        list.add(new WordClass(R.drawable.calcutta_book_fair, "Calcutta Book Fair", getString(R.string.calcutta_book_fair), true));
        list.add(new WordClass(R.drawable.kolkata_international_cinema_festival, "Kolkata International Cinema Festival", getString(R.string.kolkata_international_cinema_festival), true));
        list.add(new WordClass(R.drawable.national_theatre_festival, "National Theatre Festival", getString(R.string.national_theatre_festival), true));
        list.add(new WordClass(R.drawable.internal_history_and_heritage_exhibition, "International History & Heritage Exhibition", getString(R.string.international_history_heritage_exhibition), true));

        listView = findViewById(R.id.listView);

        CustomAdapter adapter = new CustomAdapter(this, list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            WordClass currentItem = adapter.getItem(position);

            Intent intent = new Intent(FestivalActivity.this, InfoShowActivity.class);
            intent.putExtra("pic", currentItem.getImage());
            intent.putExtra("title", currentItem.getTitle());
            intent.putExtra("info", currentItem.getInfo());
            intent.putExtra("actionbar_heading", "Festival");
            startActivity(intent);
        });

    }
}
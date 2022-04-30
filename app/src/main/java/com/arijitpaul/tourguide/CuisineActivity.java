package com.arijitpaul.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import com.arijitpaul.tourguide.Adapters.CustomAdapter;
import com.arijitpaul.tourguide.CustomClass.WordClass;

import java.util.ArrayList;

public class CuisineActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ArrayList<WordClass> list = new ArrayList<>();
        list.add(new WordClass(R.drawable.macher_jhol, "Macher Jhol\n(Exclusive Fish Curry)", getString(R.string.macher_jhol), true));
        list.add(new WordClass(R.drawable.kolkata_biryani, "Kolkata Biryani\n(Finely Flavoured Rice)", getString(R.string.kolkata_biryani), true));
        list.add(new WordClass(R.drawable.kosha_mangsho, "Kosha Mangsho\n(Special Mutton Curry)", getString(R.string.kosa_mangsho), true));
        list.add(new WordClass(R.drawable.alur_torkari_luchi, "Alur Torkari with Luchi\n(Kolkata Style Aloo Poori)", getString(R.string.alor_tarkari_luchi), true));
        list.add(new WordClass(R.drawable.shukto, "Shukto\n(Bowl of Veggis)", getString(R.string.shukto), true));
        list.add(new WordClass(R.drawable.chelo_kebab, "Chelo Kebab\n(Unique Platter)", getString(R.string.chelo_kebab), true));
        list.add(new WordClass(R.drawable.mochar_ghonto, "Mochar Ghonto\n(Flavorsome Bites)", getString(R.string.mochar_ghonto), true));
        list.add(new WordClass(R.drawable.katla_kalia, "Katla Kalia\n(Traditional Delicacy)", getString(R.string.katla_kalia), true));
        list.add(new WordClass(R.drawable.macher_muri_ghonto, "Macher Muri Ghonto\n(Bowl for Health)", getString(R.string.macher_murir_ghonto), true));
        list.add(new WordClass(R.drawable.aloo_posto, "Aloo Posto\n(For Potato Lovers)", getString(R.string.aloo_posto), true));
        list.add(new WordClass(R.drawable.phuchka, "Phuchka\n(Cute Paani Puri)", getString(R.string.puchka), true));
        list.add(new WordClass(R.drawable.telebhaja, "Telebhaja\n(Perfect Snack)", getString(R.string.telebhaja), true));
        list.add(new WordClass(R.drawable.jhalmuri, "Jhalmuri\n(Healthy Munchings)", getString(R.string.jhalmuri), true));
        list.add(new WordClass(R.drawable.chop, "Chop\n(Spicy Cutlets)", getString(R.string.chop), true));
        list.add(new WordClass(R.drawable.kathi_roll, "Kathi Rolls\n(World Famous Wraps)", getString(R.string.kathi_rolls), true));
        list.add(new WordClass(R.drawable.roshogolla, "Roshogullas\n(Sweet Tooth Love)", getString(R.string.roshogola), true));
        list.add(new WordClass(R.drawable.sondesh, "Sandesh\n(Mandatory Bites)", getString(R.string.sondesh), true));
        list.add(new WordClass(R.drawable.chom_chom, "Chom Chom\n(Delicious Amalgamation)", getString(R.string.chom_chom), true));
        list.add(new WordClass(R.drawable.misti_doi, "Mishti Doi\n(Fermented Sweet Yogurt)", getString(R.string.misti_doi), true));
        list.add(new WordClass(R.drawable.patisapta, "Patisapta\n(Festive Delights)", getString(R.string.patisapta), true));

        listView = findViewById(R.id.listView);

        CustomAdapter adapter = new CustomAdapter(this, list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            WordClass currentItem = adapter.getItem(position);

            Intent intent = new Intent(CuisineActivity.this, InfoShowActivity.class);
            intent.putExtra("pic", currentItem.getImage());
            intent.putExtra("title", currentItem.getTitle());
            intent.putExtra("info", currentItem.getInfo());
            intent.putExtra("actionbar_heading", "Cuisine");
            startActivity(intent);
        });

    }
}
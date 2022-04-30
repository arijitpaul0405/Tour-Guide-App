package com.arijitpaul.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import com.arijitpaul.tourguide.Adapters.CustomAdapter;
import com.arijitpaul.tourguide.CustomClass.WordClass;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ArrayList<WordClass> list = new ArrayList<>();
        list.add(new WordClass(R.drawable.barbeque_nation, "Barbeque Nation", getString(R.string.barbeque_nation), true));
        list.add(new WordClass(R.drawable.reloaded_pied_pipers, "Reloaded Pied Pipers", getString(R.string.reloaded_pied_pipers), true));
        list.add(new WordClass(R.drawable.vintage_asia, "Vintage Asia", getString(R.string.vintage_asia), true));
        list.add(new WordClass(R.drawable.six_ballygunge_place, "6 Ballygunge Place", getString(R.string.six_ballygunge_place), true));
        list.add(new WordClass(R.drawable.rendezvous, "Rendezvous", getString(R.string.rendezvous), true));
        list.add(new WordClass(R.drawable.alfresco, "Alfresco", getString(R.string.alfresco), true));
        list.add(new WordClass(R.drawable.zen, "Zen", getString(R.string.zen), true));
        list.add(new WordClass(R.drawable.the_bridge, "The Bridge", getString(R.string.the_bridge), true));
        list.add(new WordClass(R.drawable.mirage, "Mirage", getString(R.string.mirage), true));
        list.add(new WordClass(R.drawable.orkos_restaurant, "Orkos Restaurant - Regenta Orkos Hotel", getString(R.string.orkos_restaurant), true));
        list.add(new WordClass(R.drawable.fatty_bao, "The Fatty Bao", getString(R.string.fatty_bao), true));
        list.add(new WordClass(R.drawable.square_novotel, "The Square", getString(R.string.the_square), true));
        list.add(new WordClass(R.drawable.the_bakery, "The Bakery", getString(R.string.the_bakery), true));
        list.add(new WordClass(R.drawable.chilis_grill, "Chili's Grill & Bar", getString(R.string.chili_grill_and_bar), true));
        list.add(new WordClass(R.drawable.asia_kitchen, "Asia Kitchen By MainLand China", getString(R.string.asia_kitchen), true));
        list.add(new WordClass(R.drawable.oh_calcutta, "Oh! Calcutta", getString(R.string.oh_calcutta), true));
        list.add(new WordClass(R.drawable.jw_kitchen, "JW Kitchen", getString(R.string.jw_kitchen), true));
        list.add(new WordClass(R.drawable.fly_kouzina, "Fly Kouzina", getString(R.string.fly_kouzina), true));
        list.add(new WordClass(R.drawable.mainland_china, "Mainland China", getString(R.string.mainland_china), true));
        list.add(new WordClass(R.drawable.cafe_mezzuna, "Cafe Mezzuna", getString(R.string.cafe_mezzuna), true));

        listView = findViewById(R.id.listView);

        CustomAdapter adapter = new CustomAdapter(this, list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            WordClass currentItem = adapter.getItem(position);

            Intent intent = new Intent(RestaurantActivity.this, InfoShowActivity.class);
            intent.putExtra("pic", currentItem.getImage());
            intent.putExtra("title", currentItem.getTitle());
            intent.putExtra("info", currentItem.getInfo());
            intent.putExtra("actionbar_heading", "Restaurant");
            startActivity(intent);
        });

    }
}
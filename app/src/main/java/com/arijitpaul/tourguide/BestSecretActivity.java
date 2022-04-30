package com.arijitpaul.tourguide;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.arijitpaul.tourguide.Adapters.CustomAdapter;
import com.arijitpaul.tourguide.CustomClass.WordClass;

import java.util.ArrayList;

public class BestSecretActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ArrayList<WordClass> list = new ArrayList<>();
        list.add(new WordClass(getString(R.string.s1), false));
        list.add(new WordClass(getString(R.string.s2), false));
        list.add(new WordClass(getString(R.string.s3), false));
        list.add(new WordClass(getString(R.string.s4), false));
        list.add(new WordClass(getString(R.string.s5), false));
        list.add(new WordClass(getString(R.string.s6), false));
        list.add(new WordClass(getString(R.string.s7), false));
        list.add(new WordClass(getString(R.string.s8), false));
        list.add(new WordClass(getString(R.string.s9), false));
        list.add(new WordClass(getString(R.string.s10), false));
        list.add(new WordClass(getString(R.string.s11), false));
        list.add(new WordClass(getString(R.string.s12), false));
        list.add(new WordClass(getString(R.string.s13), false));
        list.add(new WordClass(getString(R.string.s14), false));
        list.add(new WordClass(getString(R.string.s15), false));
        list.add(new WordClass(getString(R.string.s16), false));
        list.add(new WordClass(getString(R.string.s17), false));
        list.add(new WordClass(getString(R.string.s18), false));
        list.add(new WordClass(getString(R.string.s19), false));
        list.add(new WordClass(getString(R.string.s20), false));
        list.add(new WordClass(getString(R.string.s21), false));
        list.add(new WordClass(getString(R.string.s22), false));

        listView = findViewById(R.id.listView);

        CustomAdapter adapter = new CustomAdapter(this, list);
        listView.setAdapter(adapter);

    }
}
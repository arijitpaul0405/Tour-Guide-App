package com.arijitpaul.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class InfoShowActivity extends AppCompatActivity {

    ImageView pic;
    TextView title, info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_show);

        pic = findViewById(R.id.imageView);
        title = findViewById(R.id.textView1);
        info = findViewById(R.id.textView2);

        Intent intent = getIntent();
        int image = intent.getIntExtra("pic", 0);
        String heading = intent.getStringExtra("title");
        String information = intent.getStringExtra("info");
        String actionbar_heading = intent.getStringExtra("actionbar_heading");

        pic.setImageResource(image);
        title.setText(heading);
        info.setText(information);

        Objects.requireNonNull(getSupportActionBar()).setTitle(actionbar_heading);

    }
}
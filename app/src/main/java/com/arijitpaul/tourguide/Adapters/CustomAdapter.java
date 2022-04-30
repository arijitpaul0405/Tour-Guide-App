package com.arijitpaul.tourguide.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.arijitpaul.tourguide.CustomClass.WordClass;
import com.arijitpaul.tourguide.R;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<WordClass> {

    public CustomAdapter(@NonNull Context context, @NonNull List<WordClass> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item_sample, parent, false);
        }

        WordClass currentData = getItem(position);

        ImageView image = listItemView.findViewById(R.id.pic);
        if(currentData.isDisplay())
            image.setImageResource(currentData.getImage());
        else
            image.setVisibility(View.GONE);

        TextView title = listItemView.findViewById(R.id.title);
        title.setText(currentData.getTitle());

        return listItemView;
    }
}

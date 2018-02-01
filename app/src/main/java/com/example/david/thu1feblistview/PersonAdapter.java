package com.example.david.thu1feblistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by david on 2018-02-01.
 */

public class PersonAdapter extends ArrayAdapter<String> {

    private Context context;
    private String[] values;
    private LayoutInflater inflater;

    public PersonAdapter(Context context, String[] values){
        super(context, -1, values);
        this.context = context;
        this.values = values;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItem = inflater.inflate(R.layout.list_item_layout, parent, false);
        ImageView imageView = listItem.findViewById(R.id.picture);
        TextView titel = listItem.findViewById(R.id.title);
        TextView subtitel = listItem.findViewById(R.id.subtitle);

        titel.setText(values[position]);
        subtitel.setText("Familjemedlem");

        String s = values[position];
        if (s.equals("David")){
            imageView.setImageResource(R.drawable.image);
        } else {
            imageView.setImageResource(R.drawable.image2);
        }

        return listItem;
    }
}

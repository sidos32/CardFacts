package com.sidos32.cardfacts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class arrayAdapter extends ArrayAdapter<cards> {
    Context context;

    public arrayAdapter(Context context, int resourceId, List<cards>items){
        super(context,resourceId,items);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        cards card_item = getItem(position);
        if(convertView == null){

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item,parent,false);
        }

        TextView text = (TextView)convertView.findViewById(R.id.text);
        ImageView image = (ImageView) convertView.findViewById(R.id.image);

        text.setText(card_item.getText());
        image.setImageResource(R.mipmap.ic_launcher);

        return convertView;

    }

}

package com.alobot.dummycustomlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<ListObject> {
    private Context mContext;

    public ListAdapter(Context context, ArrayList<ListObject> listObjects) {
        super(context, 0, listObjects);
        mContext = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ListObject listObject = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        ImageView imageViewThumbnail_1 = (ImageView) convertView.findViewById(R.id.thumbnail_1);
        TextView textViewItemNumber = (TextView) convertView.findViewById(R.id.item_number);
        TextView textViewDescription = (TextView) convertView.findViewById(R.id.description);
        TextView textViewPrice = (TextView) convertView.findViewById(R.id.price);
        TextView textViewQuantity = (TextView) convertView.findViewById(R.id.quantity);
        ImageView imageViewThumbnail_2 = (ImageView) convertView.findViewById(R.id.thumbnail_2);

        // imageViewThumbnail_1.setImageResource(R.mipmap.ic_launcher);
        textViewItemNumber.setText(listObject.getItemNumber());
        textViewDescription.setText(listObject.getDescription());
        textViewPrice.setText(listObject.getPrice());
        textViewQuantity.setText(listObject.getQuantity());
        // imageViewThumbnail_2.setImageResource(R.mipmap.ic_launcher);

        imageViewThumbnail_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Thumbnail 2 Pushed", Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }
}

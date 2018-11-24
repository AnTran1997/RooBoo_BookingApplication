package com.meu.an.rooboo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import static android.support.v7.widget.RecyclerView.*;

/**
 * Created by Admin on 11/23/2018.
 */

public class Adapter extends ArrayAdapter {
    private  Context context;
    private int resource;
    private List<Room> arrRoom;
    public Adapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.arrRoom=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(context).inflate(R.layout.cardview,parent,false);

        Room room = arrRoom.get(position);

        ImageView imgHotel= listItem.findViewById(R.id.imgHotel);
        imgHotel.setImageResource(room.getImageHotel());

        TextView txtAddress= listItem.findViewById(R.id.txtAddress);
        txtAddress.setText(room.getAddress());

        TextView txtNameHotel= listItem.findViewById(R.id.txtNameHotel);
        txtNameHotel.setText(room.getNameHotel());

        TextView txtPrice= listItem.findViewById(R.id.txtPrice);
        txtPrice.setText(room.getPrice());

        TextView txtComment= listItem.findViewById(R.id.txtComment);
        txtComment.setText(room.getComment());

        TextView txtBath= listItem.findViewById(R.id.txtBath);
        txtBath.setText(room.getBath());

        TextView txtBed= listItem.findViewById(R.id.txtBed);
        txtBed.setText(room.getBed());;

//        ImageView image = (ImageView)listItem.findViewById(R.id.imageView_poster);
//        image.setImageResource(currentMovie.getImageHotel());


        return listItem;
    }
}

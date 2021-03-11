package com.example.teste;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    public final Context context;
    public final List<DataItem> lsData;


    public CustomAdapter(Context context, List<DataItem> lsData){
        this.context = context;
        this.lsData = lsData;
    }

    @Override
    public int getCount() {
        return lsData != null? lsData.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return lsData.get( position );
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        @SuppressLint("ViewHolder") View view = LayoutInflater.from( context ).inflate( R.layout.itemrow, parent, false);
        ImageView img = view.findViewById( R.id.imagemIndividual );
        DataItem dataItem = lsData.get( position );
        img.setImageResource(dataItem.resIdThumbnail);
        return view;
    }
}

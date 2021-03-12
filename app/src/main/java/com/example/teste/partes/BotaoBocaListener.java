package com.example.teste.partes;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.teste.CustomAdapter;
import com.example.teste.DataItem;
import com.example.teste.R;

public class BotaoBocaListener implements View.OnClickListener {

    private final Activity context;

    public BotaoBocaListener(Activity context){
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
        LayoutInflater inflater = context.getLayoutInflater();
        View convertView = inflater.inflate( R.layout.custompopup_mouth,null );
        alertDialog.setView(convertView);
        final ListView lv = convertView.findViewById( R.id.listaImagens );
        lv.setAdapter( new CustomAdapter( context, DataItem.getBocaIcones() ) );
        final AlertDialog show = alertDialog.show();
        lv.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ImageView image = context.findViewById(R.id.imgBoca);
                switch (position){
                    case 0:
                        image.setImageResource( R.drawable.boca_1 );
                        break;
                    case 1:
                        image.setImageResource( R.drawable.boca_2 );
                        break;
                    case 2:
                        image.setImageResource( R.drawable.boca_3 );
                        break;
                    case 3:
                        image.setImageResource( R.drawable.boca_4 );
                        break;
                    case 4:
                        image.setImageResource( R.drawable.boca_5 );
                         break;
                    case 5:
                        image.setImageResource( R.drawable.boca_6 );
                        break;
                }

                show.dismiss();
            }
        } );
    }
}

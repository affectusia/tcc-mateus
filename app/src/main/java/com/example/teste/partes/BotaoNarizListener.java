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

public class BotaoNarizListener implements View.OnClickListener{

    private final Activity context;

    public BotaoNarizListener(Activity context){
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder alertDialogPincipal = new AlertDialog.Builder(context);
        LayoutInflater inflaterPrincipal = context.getLayoutInflater();
        View convertView = inflaterPrincipal.inflate( R.layout.custompopup_mouth,null );
        alertDialogPincipal.setView( convertView );
        ListView lvPrincipal = convertView.findViewById( R.id.listaImagens );
        lvPrincipal.setAdapter( new CustomAdapter(context, DataItem.getNarizPIcones() ) );
        final AlertDialog showPrincipal = alertDialogPincipal.show();
        lvPrincipal.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ImageView imageN = context.findViewById(R.id.imgNeriz);
                switch (position){
                    case 0:
                        imageN.setImageResource( R.drawable.nariz_1 );
                        showPrincipal.dismiss();
                        break;
                    case 1:
                        imageN.setImageResource( R.drawable.nariz_2 );
                        showPrincipal.dismiss();
                        break;
                    case 2:
                        imageN.setImageResource( R.drawable.nariz_3 );
                        showPrincipal.dismiss();
                        break;
                }
            }
        } );
    }
}

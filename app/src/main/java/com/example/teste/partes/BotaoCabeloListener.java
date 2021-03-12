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

import java.util.List;

public class BotaoCabeloListener implements View.OnClickListener{

    private final Activity context;

    public BotaoCabeloListener(Activity context){
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder alertDialogPincipal = new AlertDialog.Builder(context);
        LayoutInflater inflaterPrincipal = context.getLayoutInflater();
        View convertView = inflaterPrincipal.inflate(R.layout.custompopup_mouth, null);
        alertDialogPincipal.setView( convertView );
        ListView lvPrincipal = convertView.findViewById( R.id.listaImagens );
        lvPrincipal.setAdapter( new CustomAdapter( context, DataItem.getCabeloPIcones() ) );
        final AlertDialog showPrincipal = alertDialogPincipal.show();
        lvPrincipal.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        mostrarSubOpcoes(DataItem.getCabelo1Icones());
                        break;
                    case 1:
                        mostrarSubOpcoes(DataItem.getCabelo2Icones());
                        break;
                    case 2:
                        mostrarSubOpcoes(DataItem.getCabelo3Icones());
                        break;
                    case 3:
                        mostrarSubOpcoes(DataItem.getCabelo4Icones());
                        break;
                    case 4:
                        mostrarSubOpcoes(DataItem.getCabelo5Icones());
                        break;
                }

                showPrincipal.dismiss();
            }
        });
    }

    private void mostrarSubOpcoes(List<DataItem> opcoes){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.custompopup_mouth, null);
        alertDialogBuilder.setView(view);
        ListView layoutOpcoes = view.findViewById(R.id.listaImagens );
        layoutOpcoes.setAdapter(new CustomAdapter(context, opcoes));
        final AlertDialog alertDialog = alertDialogBuilder.show();
        final ImageView imageViewCabelo = context.findViewById(R.id.imgCabelo);
        layoutOpcoes.setOnItemClickListener( new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DataItem dataItem = (DataItem) parent.getItemAtPosition(position);
                imageViewCabelo.setImageResource(dataItem.getResourceId());
                alertDialog.dismiss();
            }
        } );
    }
}

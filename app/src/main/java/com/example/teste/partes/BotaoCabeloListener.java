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

public class BotaoCabeloListener implements View.OnClickListener{

    private final Activity context;

    public BotaoCabeloListener(Activity context){
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder alertDialogPincipal = new AlertDialog.Builder(context);
        LayoutInflater inflaterPrincipal = context.getLayoutInflater();
        View convertView = inflaterPrincipal.inflate( R.layout.custompopup_mouth,null );
        alertDialogPincipal.setView( convertView );
        ListView lvPrincipal = convertView.findViewById( R.id.listaImagens );
        lvPrincipal.setAdapter( new CustomAdapter( context, DataItem.getCabeloPIcones() ) );
        final AlertDialog showPrincipal = alertDialogPincipal.show();
        lvPrincipal.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        AlertDialog.Builder alertDialogComprido = new AlertDialog.Builder(context);
                        LayoutInflater inflaterComprido = context.getLayoutInflater();
                        View convertViewComprido = inflaterComprido.inflate( R.layout.custompopup_mouth,null );
                        alertDialogComprido.setView( convertViewComprido );
                        ListView lvComprido = convertViewComprido.findViewById( R.id.listaImagens );
                        lvComprido.setAdapter( new CustomAdapter( context, DataItem.getCabelo1Icones()));
                        final AlertDialog showComprido = alertDialogComprido.show();
                        final ImageView imageCabelo1 = context.findViewById(R.id.imgCabelo);
                        lvComprido.setOnItemClickListener( new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                switch (position){
                                    case 0:
                                        imageCabelo1.setImageResource( R.drawable.cabelo_1_amarelo );
                                        showComprido.dismiss();
                                        break;
                                    case 1:
                                        imageCabelo1.setImageResource( R.drawable.cabelo_1_laranja );
                                        showComprido.dismiss();
                                        break;
                                    case 2:
                                        imageCabelo1.setImageResource( R.drawable.cabelo_1_marrom );
                                        showComprido.dismiss();
                                        break;
                                    case 3:
                                        imageCabelo1.setImageResource( R.drawable.cabelo_1_preto );
                                        showComprido.dismiss();
                                        break;
                                }
                            }
                        } );
                        showPrincipal.dismiss();
                        break;
                    case 1:
                        AlertDialog.Builder alertDialogCompridoO = new AlertDialog.Builder(context);
                        LayoutInflater inflaterCompridoO = context.getLayoutInflater();
                        View convertViewCompridoO = inflaterCompridoO.inflate(R.layout.custompopup_mouth,null);
                        alertDialogCompridoO.setView( convertViewCompridoO );
                        ListView lvCompridoO = convertViewCompridoO.findViewById( R.id.listaImagens );
                        lvCompridoO.setAdapter( new CustomAdapter( context, DataItem.getCabelo2Icones()));
                        final AlertDialog showCompridoO = alertDialogCompridoO.show();
                        final ImageView imageCabelo2 = context.findViewById(R.id.imgCabelo);
                        lvCompridoO.setOnItemClickListener( new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                switch (position){
                                    case 0:
                                        imageCabelo2.setImageResource( R.drawable.cabelo_2_amarelo );
                                        showCompridoO.dismiss();
                                        break;
                                    case 1:
                                        imageCabelo2.setImageResource( R.drawable.cabelo_2_laranja );
                                        showCompridoO.dismiss();
                                        break;
                                    case 2:
                                        imageCabelo2.setImageResource( R.drawable.cabelo_2_marrom );
                                        showCompridoO.dismiss();
                                        break;
                                    case 3:
                                        imageCabelo2.setImageResource( R.drawable.cabelo_2_preto );
                                        showCompridoO.dismiss();
                                        break;
                                }
                            }
                        } );
                        showPrincipal.dismiss();
                        break;
                    case 2:
                        AlertDialog.Builder alertDialogFranjinha = new AlertDialog.Builder( context );
                        LayoutInflater inflaterFranjinha = context.getLayoutInflater();
                        View convertViewFranjinha = inflaterFranjinha.inflate( R.layout.custompopup_mouth,null );
                        alertDialogFranjinha.setView( convertViewFranjinha );
                        ListView lvFranjinha = convertViewFranjinha.findViewById( R.id.listaImagens );
                        lvFranjinha.setAdapter( new CustomAdapter( context, DataItem.getCabelo3Icones()));
                        final AlertDialog showFranjinha = alertDialogFranjinha.show();
                        final ImageView imageCabelo3 = context.findViewById(R.id.imgCabelo);
                        lvFranjinha.setOnItemClickListener( new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                switch (position){
                                    case 0:
                                        imageCabelo3.setImageResource( R.drawable.cabelo_3_marrom );
                                        showFranjinha.dismiss();
                                        break;
                                    case 1:
                                        imageCabelo3.setImageResource( R.drawable.cabelo_3_amarelo );
                                        showFranjinha.dismiss();
                                        break;
                                    case 2:
                                        imageCabelo3.setImageResource( R.drawable.cabelo_3_laranja );
                                        showFranjinha.dismiss();
                                        break;
                                    case 3:
                                        imageCabelo3.setImageResource( R.drawable.cabelo_3_preto );
                                        showFranjinha.dismiss();
                                        break;
                                }
                            }
                        } );
                        showPrincipal.dismiss();
                        break;
                    case 3:
                        AlertDialog.Builder alertDialogOndulado = new AlertDialog.Builder( context );
                        LayoutInflater inflaterOndulado = context.getLayoutInflater();
                        View convertViewOndulado = inflaterOndulado.inflate( R.layout.custompopup_mouth,null );
                        alertDialogOndulado.setView( convertViewOndulado );
                        ListView lvOndulado = convertViewOndulado.findViewById( R.id.listaImagens );
                        lvOndulado.setAdapter( new CustomAdapter( context, DataItem.getCabelo4Icones()));
                        final AlertDialog showOndulado = alertDialogOndulado.show();
                        final ImageView imageCabelo4 = context.findViewById(R.id.imgCabelo);
                        lvOndulado.setOnItemClickListener( new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                switch (position){
                                    case 0:
                                        imageCabelo4.setImageResource( R.drawable.cabelo_4_amarelo );
                                        showOndulado.dismiss();
                                        break;
                                    case 1:
                                        imageCabelo4.setImageResource( R.drawable.cabelo_4_laranja );
                                        showOndulado.dismiss();
                                        break;
                                    case 2:
                                        imageCabelo4.setImageResource( R.drawable.cabelo_4_marrom );
                                        showOndulado.dismiss();
                                        break;
                                    case 3:
                                        imageCabelo4.setImageResource( R.drawable.cabelo_4_preto );
                                        showOndulado.dismiss();
                                        break;
                                }
                            }
                        } );
                        showPrincipal.dismiss();
                        break;
                    case 4:
                        AlertDialog.Builder alertDialogEspetado = new AlertDialog.Builder( context );
                        LayoutInflater inflaterEspetado = context.getLayoutInflater();
                        View convertViewEspetado = inflaterEspetado.inflate( R.layout.custompopup_mouth,null );
                        alertDialogEspetado.setView( convertViewEspetado );
                        ListView lvEspetado = convertViewEspetado.findViewById( R.id.listaImagens );
                        lvEspetado.setAdapter( new CustomAdapter( context, DataItem.getCabelo5Icones()));
                        final AlertDialog showEspetado = alertDialogEspetado.show();
                        final ImageView imageCabelo5= context.findViewById(R.id.imgCabelo);
                        lvEspetado.setOnItemClickListener( new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                switch (position){
                                    case 0:
                                        imageCabelo5.setImageResource( R.drawable.cabelo_5_amarelo );
                                        showEspetado.dismiss();
                                        break;
                                    case 1:
                                        imageCabelo5.setImageResource( R.drawable.cabelo_5_laranja );
                                        showEspetado.dismiss();
                                        break;
                                    case 2:
                                        imageCabelo5.setImageResource( R.drawable.cabelo_5_marrom );
                                        showEspetado.dismiss();
                                        break;
                                    case 3:
                                        imageCabelo5.setImageResource( R.drawable.cabelo_5_preto );
                                        showEspetado.dismiss();
                                        break;
                                }
                            }
                        } );
                        showPrincipal.dismiss();
                        break;
                }
            }
        } );
    }
}

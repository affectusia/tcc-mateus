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

public class BotaoOlhosListener implements View.OnClickListener{

    private final Activity context;

    public BotaoOlhosListener(Activity context){
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder alertDialogPincipal = new AlertDialog.Builder(context);
        LayoutInflater inflaterPrincipal = context.getLayoutInflater();
        View convertView = inflaterPrincipal.inflate( R.layout.custompopup_mouth,null );
        alertDialogPincipal.setView( convertView );
        ListView lvPrincipal = convertView.findViewById( R.id.listaImagens );
        lvPrincipal.setAdapter( new CustomAdapter(context, DataItem.getOlhosPIcones() ) );
        final AlertDialog showPrincipal = alertDialogPincipal.show();
        lvPrincipal.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ImageView imagePrincipal = context.findViewById(R.id.imgOlhos);
                switch (position){
                    case 0:
                        AlertDialog.Builder alertDialogAlegre = new AlertDialog.Builder(context);
                        LayoutInflater inflaterAlegre = context.getLayoutInflater();
                        View convertViewAlegre = inflaterAlegre.inflate( R.layout.custompopup_mouth,null );
                        alertDialogAlegre.setView( convertViewAlegre );
                        ListView lvAlegre = convertViewAlegre.findViewById( R.id.listaImagens );
                        lvAlegre.setAdapter( new CustomAdapter(context, DataItem.getOlhos1Icones()));
                        final AlertDialog showAlegre = alertDialogAlegre.show();
                        final ImageView olhos1 = context.findViewById(R.id.imgOlhos);
                        lvAlegre.setOnItemClickListener( new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                switch (position){
                                    case 0:
                                        olhos1.setImageResource( R.drawable.olhos_1_azul );
                                        showAlegre.dismiss();
                                        break;
                                    case 1:
                                        olhos1.setImageResource( R.drawable.olhos_1_marrom );
                                        showAlegre.dismiss();
                                        break;
                                    case 2:
                                        olhos1.setImageResource( R.drawable.olhos_1_verde );
                                        showAlegre.dismiss();
                                        break;
                                }
                            }
                        } );
                        showPrincipal.dismiss();
                        break;
                    case 1:
                        imagePrincipal.setImageResource( R.drawable.olhos_2 );
                        showPrincipal.dismiss();
                        break;
                    case 2:
                        AlertDialog.Builder alertDialogNormal = new AlertDialog.Builder(context);
                        LayoutInflater inflaterNormal = context.getLayoutInflater();
                        View convertViewNormal = inflaterNormal.inflate( R.layout.custompopup_mouth,null );
                        alertDialogNormal.setView( convertViewNormal );
                        ListView lvNormal = convertViewNormal.findViewById( R.id.listaImagens );
                        lvNormal.setAdapter( new CustomAdapter(context, DataItem.getOlhos3Icones()));
                        final AlertDialog showNormal = alertDialogNormal.show();
                        final ImageView imageNormal = context.findViewById(R.id.imgOlhos);
                        lvNormal.setOnItemClickListener( new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                switch (position){
                                    case 0:
                                        imageNormal.setImageResource( R.drawable.olhos_3_azul );
                                        showNormal.dismiss();
                                        break;
                                    case 1:
                                        imageNormal.setImageResource( R.drawable.olhos_3_marrom );
                                        showNormal.dismiss();
                                        break;
                                    case 2:
                                        imageNormal.setImageResource( R.drawable.olhos_3_verde );
                                        showNormal.dismiss();
                                        break;
                                }
                            }
                        } );
                        showPrincipal.dismiss();
                        break;
                    case 3:
                        AlertDialog.Builder alertDialogRaiva = new AlertDialog.Builder(context);
                        LayoutInflater inflaterRaiva = context.getLayoutInflater();
                        View convertViewRaiva = inflaterRaiva.inflate( R.layout.custompopup_mouth,null );
                        alertDialogRaiva.setView( convertViewRaiva);
                        ListView lvRaiva = convertViewRaiva.findViewById( R.id.listaImagens );
                        lvRaiva.setAdapter( new CustomAdapter(context, DataItem.getOlhos4Icones()));
                        final AlertDialog showRaiva = alertDialogRaiva.show();
                        final ImageView imageRaiva = context.findViewById(R.id.imgOlhos);
                        lvRaiva.setOnItemClickListener( new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                switch (position){
                                    case 0:
                                        imageRaiva.setImageResource( R.drawable.olhos_4_azul );
                                        showRaiva.dismiss();
                                        break;
                                    case 1:
                                        imageRaiva.setImageResource( R.drawable.olhos_4_marrom );
                                        showRaiva.dismiss();
                                        break;
                                    case 2:
                                        imageRaiva.setImageResource( R.drawable.olhos_4_verde );
                                        showRaiva.dismiss();
                                        break;
                                }
                            }
                        } );
                        showPrincipal.dismiss();
                        break;
                    case 4:
                        AlertDialog.Builder alertDialogSurpreso = new AlertDialog.Builder(context);
                        LayoutInflater inflaterSurpreso = context.getLayoutInflater();
                        View convertViewSurpreso = inflaterSurpreso.inflate( R.layout.custompopup_mouth,null );
                        alertDialogSurpreso.setView( convertViewSurpreso);
                        ListView lvSurpreso = convertViewSurpreso.findViewById( R.id.listaImagens );
                        lvSurpreso.setAdapter( new CustomAdapter(context, DataItem.getOlhos5Icones()));
                        final AlertDialog showSurpreso = alertDialogSurpreso.show();
                        final ImageView imageSurpreso = context.findViewById(R.id.imgOlhos);
                        lvSurpreso.setOnItemClickListener( new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                switch (position){
                                    case 0:
                                        imageSurpreso.setImageResource( R.drawable.olhos_5_azul );
                                        showSurpreso.dismiss();
                                        break;
                                    case 1:
                                        imageSurpreso.setImageResource( R.drawable.olhos_5_marrom );
                                        showSurpreso.dismiss();
                                        break;
                                    case 2:
                                        imageSurpreso.setImageResource( R.drawable.olhos_5_verde );
                                        showSurpreso.dismiss();
                                        break;
                                }
                            }
                        } );
                        showPrincipal.dismiss();
                        break;
                    case 5:
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        LayoutInflater inflaterMedo = context.getLayoutInflater();
                        View convertViewMedo = inflaterMedo.inflate( R.layout.custompopup_mouth,null );
                        alertDialogBuilder.setView( convertViewMedo );
                        ListView lvMedo = convertViewMedo.findViewById( R.id.listaImagens );
                        lvMedo.setAdapter( new CustomAdapter(context, DataItem.getOlhos6Icones()));
                        final AlertDialog showMedo = alertDialogBuilder.show();
                        final ImageView imageMedo = context.findViewById(R.id.imgOlhos);
                        lvMedo.setOnItemClickListener( new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                switch (position){
                                    case 0:
                                        imageMedo.setImageResource( R.drawable.olhos_6_azul );
                                        break;
                                    case 1:
                                        imageMedo.setImageResource( R.drawable.olhos_6_marrom );
                                        break;
                                    case 2:
                                        imageMedo.setImageResource( R.drawable.olhos_6_verde );
                                        break;
                                }

                                showMedo.dismiss();
                            }
                        } );
                        showPrincipal.dismiss();
                        break;
                }
            }
        } );
    }
}

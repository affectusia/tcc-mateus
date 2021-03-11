package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.teste.compartilhar.EnviarActivity;
import com.example.teste.professor.MainActivityProfessor;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<DataItem> lstData;
    Context context = this;
    private ListView listView;

    private ImageView imageView;
    private Bitmap btmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this.setRequestedOrientation( ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE );

        imageView = (ImageView) findViewById( R.id.screenShot );
        /*
        Button btReceber = (Button) findViewById( R.id.botaoReceber );
        btReceber.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View]
             view) {
                Bitmap b = Screenshot.takescreenshotOfRootView( imageView );
                imageView.setImageBitmap( b );
            }
        } );*/

        Button btEnviar = findViewById( R.id.botaoEnviar );
        btEnviar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bitmap b = Screenshot.takescreenshotOfRootView( imageView );
                btmap = scaleDownBitmap( b, 100, MainActivity.this );
                imageView.setImageBitmap( btmap );

                Intent intentEnviar = new Intent( MainActivity.this, EnviarActivity.class );
                intentEnviar.putExtra( "BitmapImage", btmap );
                startActivity( intentEnviar );
            }
        } );

        Button btReceber  = findViewById( R.id.botaoReceber );
        btReceber.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Bitmap b = Screenshot.takescreenshotOfRootView( imageView );
                btmap = scaleDownBitmap( b, 100, MainActivity.this );
                imageView.setImageBitmap( btmap );*/

                Intent intentReceber = new Intent( MainActivity.this, MainActivityProfessor.class );
                //intentReceber.putExtra( "BitmapImage", btmap );
                startActivity( intentReceber );
            }
        } );

        //Escolher o avatar inicial
        final AlertDialog.Builder alert = new AlertDialog.Builder( MainActivity.this );
        LayoutInflater inflater = getLayoutInflater();
        View convertView = (View) inflater.inflate( R.layout.custompopup_mouth,null );
        alert.setView( convertView );
        final ListView lv = (ListView) convertView.findViewById( R.id.listaImagens );
        lv.setAdapter( new CustomAdapter( MainActivity.this, DataItem.getAvatarIcones() ) );
        final AlertDialog show = alert.show();
        lv.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ImageView image = findViewById(R.id.avatar);
                switch (position){
                    case 0:
                        image.setImageResource( R.drawable.cabeca_1 );
                        show.dismiss();
                        break;
                    case 1:
                        image.setImageResource( R.drawable.cabeca_2 );
                        show.dismiss();
                        break;
                    case 2:
                        image.setImageResource( R.drawable.cabeca_3 );
                        show.dismiss();
                        break;
                }
            }
        } );

        //Botão Boca
        Button btBoca = findViewById( R.id.botaoBoca );
        btBoca.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder( MainActivity.this );
                LayoutInflater inflater = getLayoutInflater();
                View convertView = (View) inflater.inflate( R.layout.custompopup_mouth,null );
                alertDialog.setView( convertView );
                final ListView lv = (ListView) convertView.findViewById( R.id.listaImagens );
                lv.setAdapter( new CustomAdapter( MainActivity.this, DataItem.getBocaIcones() ) );
                final AlertDialog show = alertDialog.show();
                lv.setOnItemClickListener( new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        ImageView image = findViewById(R.id.imgBoca);
                        switch (position){
                            case 0:
                                image.setImageResource( R.drawable.boca_1 );
                                show.dismiss();
                                break;
                            case 1:
                                image.setImageResource( R.drawable.boca_2 );
                                show.dismiss();
                                break;
                            case 2:
                                image.setImageResource( R.drawable.boca_3 );
                                show.dismiss();
                                break;
                            case 3:
                                image.setImageResource( R.drawable.boca_4 );
                                show.dismiss();
                                break;
                            case 4:
                                image.setImageResource( R.drawable.boca_5 );
                                show.dismiss();
                                break;
                            case 5:
                                image.setImageResource( R.drawable.boca_6 );
                                show.dismiss();
                                break;
                        }
                    }
                } );
            }
        } );

        //Botão Cabelo
        Button btCabelo = findViewById( R.id.botaoCabelo );
        btCabelo.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogPincipal = new AlertDialog.Builder( MainActivity.this );
                LayoutInflater inflaterPrincipal = getLayoutInflater();
                View convertView = (View) inflaterPrincipal.inflate( R.layout.custompopup_mouth,null );
                alertDialogPincipal.setView( convertView );
                ListView lvPrincipal = (ListView) convertView.findViewById( R.id.listaImagens );
                lvPrincipal.setAdapter( new CustomAdapter( MainActivity.this, DataItem.getCabeloPIcones() ) );
                final AlertDialog showPrincipal = alertDialogPincipal.show();
                lvPrincipal.setOnItemClickListener( new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch (position){
                            case 0:
                                AlertDialog.Builder alertDialogComprido = new AlertDialog.Builder( MainActivity.this );
                                LayoutInflater inflaterComprido = getLayoutInflater();
                                View convertViewComprido = (View) inflaterComprido.inflate( R.layout.custompopup_mouth,null );
                                alertDialogComprido.setView( convertViewComprido );
                                ListView lvComprido = (ListView) convertViewComprido.findViewById( R.id.listaImagens );
                                lvComprido.setAdapter( new CustomAdapter( MainActivity.this, DataItem.getCabelo1Icones()));
                                final AlertDialog showComprido = alertDialogComprido.show();
                                final ImageView imageCabelo1 = findViewById(R.id.imgCabelo);
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
                                AlertDialog.Builder alertDialogCompridoO = new AlertDialog.Builder( MainActivity.this );
                                LayoutInflater inflaterCompridoO = getLayoutInflater();
                                View convertViewCompridoO = (View) inflaterCompridoO.inflate( R.layout.custompopup_mouth,null );
                                alertDialogCompridoO.setView( convertViewCompridoO );
                                ListView lvCompridoO = (ListView) convertViewCompridoO.findViewById( R.id.listaImagens );
                                lvCompridoO.setAdapter( new CustomAdapter( MainActivity.this, DataItem.getCabelo2Icones()));
                                final AlertDialog showCompridoO = alertDialogCompridoO.show();
                                final ImageView imageCabelo2 = findViewById(R.id.imgCabelo);
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
                                AlertDialog.Builder alertDialogFranjinha = new AlertDialog.Builder( MainActivity.this );
                                LayoutInflater inflaterFranjinha = getLayoutInflater();
                                View convertViewFranjinha = (View) inflaterFranjinha.inflate( R.layout.custompopup_mouth,null );
                                alertDialogFranjinha.setView( convertViewFranjinha );
                                ListView lvFranjinha = (ListView) convertViewFranjinha.findViewById( R.id.listaImagens );
                                lvFranjinha.setAdapter( new CustomAdapter( MainActivity.this, DataItem.getCabelo3Icones()));
                                final AlertDialog showFranjinha = alertDialogFranjinha.show();
                                final ImageView imageCabelo3 = findViewById(R.id.imgCabelo);
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
                                AlertDialog.Builder alertDialogOndulado = new AlertDialog.Builder( MainActivity.this );
                                LayoutInflater inflaterOndulado = getLayoutInflater();
                                View convertViewOndulado = (View) inflaterOndulado.inflate( R.layout.custompopup_mouth,null );
                                alertDialogOndulado.setView( convertViewOndulado );
                                ListView lvOndulado = (ListView) convertViewOndulado.findViewById( R.id.listaImagens );
                                lvOndulado.setAdapter( new CustomAdapter( MainActivity.this, DataItem.getCabelo4Icones()));
                                final AlertDialog showOndulado = alertDialogOndulado.show();
                                final ImageView imageCabelo4 = findViewById(R.id.imgCabelo);
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
                                AlertDialog.Builder alertDialogEspetado = new AlertDialog.Builder( MainActivity.this );
                                LayoutInflater inflaterEspetado = getLayoutInflater();
                                View convertViewEspetado = (View) inflaterEspetado.inflate( R.layout.custompopup_mouth,null );
                                alertDialogEspetado.setView( convertViewEspetado );
                                ListView lvEspetado = (ListView) convertViewEspetado.findViewById( R.id.listaImagens );
                                lvEspetado.setAdapter( new CustomAdapter( MainActivity.this, DataItem.getCabelo5Icones()));
                                final AlertDialog showEspetado = alertDialogEspetado.show();
                                final ImageView imageCabelo5= findViewById(R.id.imgCabelo);
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
        } );

        //Botão Olhos
        final Button btOlhos = findViewById( R.id.botaoOlhos );
        btOlhos.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogPincipal = new AlertDialog.Builder( MainActivity.this );
                LayoutInflater inflaterPrincipal = getLayoutInflater();
                View convertView = (View) inflaterPrincipal.inflate( R.layout.custompopup_mouth,null );
                alertDialogPincipal.setView( convertView );
                ListView lvPrincipal = (ListView) convertView.findViewById( R.id.listaImagens );
                lvPrincipal.setAdapter( new CustomAdapter( MainActivity.this, DataItem.getOlhosPIcones() ) );
                final AlertDialog showPrincipal = alertDialogPincipal.show();
                lvPrincipal.setOnItemClickListener( new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        ImageView imagePrincipal = findViewById(R.id.imgOlhos);
                        switch (position){
                            case 0:
                                AlertDialog.Builder alertDialogAlegre = new AlertDialog.Builder( MainActivity.this );
                                LayoutInflater inflaterAlegre = getLayoutInflater();
                                View convertViewAlegre = (View) inflaterAlegre.inflate( R.layout.custompopup_mouth,null );
                                alertDialogAlegre.setView( convertViewAlegre );
                                ListView lvAlegre = (ListView) convertViewAlegre.findViewById( R.id.listaImagens );
                                lvAlegre.setAdapter( new CustomAdapter( MainActivity.this, DataItem.getOlhos1Icones()));
                                final AlertDialog showAlegre = alertDialogAlegre.show();
                                final ImageView olhos1 = findViewById(R.id.imgOlhos);
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
                                AlertDialog.Builder alertDialogNormal = new AlertDialog.Builder( MainActivity.this );
                                LayoutInflater inflaterNormal = getLayoutInflater();
                                View convertViewNormal = (View) inflaterNormal.inflate( R.layout.custompopup_mouth,null );
                                alertDialogNormal.setView( convertViewNormal );
                                ListView lvNormal = (ListView) convertViewNormal.findViewById( R.id.listaImagens );
                                lvNormal.setAdapter( new CustomAdapter( MainActivity.this, DataItem.getOlhos3Icones()));
                                final AlertDialog showNormal = alertDialogNormal.show();
                                final ImageView imageNormal = findViewById(R.id.imgOlhos);
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
                                AlertDialog.Builder alertDialogRaiva = new AlertDialog.Builder( MainActivity.this );
                                LayoutInflater inflaterRaiva = getLayoutInflater();
                                View convertViewRaiva = (View) inflaterRaiva.inflate( R.layout.custompopup_mouth,null );
                                alertDialogRaiva.setView( convertViewRaiva);
                                ListView lvRaiva = (ListView) convertViewRaiva.findViewById( R.id.listaImagens );
                                lvRaiva.setAdapter( new CustomAdapter( MainActivity.this, DataItem.getOlhos4Icones()));
                                final AlertDialog showRaiva = alertDialogRaiva.show();
                                final ImageView imageRaiva = findViewById(R.id.imgOlhos);
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
                                AlertDialog.Builder alertDialogSurpreso = new AlertDialog.Builder( MainActivity.this );
                                LayoutInflater inflaterSurpreso = getLayoutInflater();
                                View convertViewSurpreso = (View) inflaterSurpreso.inflate( R.layout.custompopup_mouth,null );
                                alertDialogSurpreso.setView( convertViewSurpreso);
                                ListView lvSurpreso = (ListView) convertViewSurpreso.findViewById( R.id.listaImagens );
                                lvSurpreso.setAdapter( new CustomAdapter( MainActivity.this, DataItem.getOlhos5Icones()));
                                final AlertDialog showSurpreso = alertDialogSurpreso.show();
                                final ImageView imageSurpreso = findViewById(R.id.imgOlhos);
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
                                AlertDialog.Builder alertDialogMedo = new AlertDialog.Builder( MainActivity.this );
                                LayoutInflater inflaterMedo = getLayoutInflater();
                                View convertViewMedo = (View) inflaterMedo.inflate( R.layout.custompopup_mouth,null );
                                alertDialogMedo.setView( convertViewMedo );
                                ListView lvMedo = (ListView) convertViewMedo.findViewById( R.id.listaImagens );
                                lvMedo.setAdapter( new CustomAdapter( MainActivity.this, DataItem.getOlhos6Icones()));
                                final AlertDialog showMedo = alertDialogMedo.show();
                                final ImageView imageMedo = findViewById(R.id.imgOlhos);
                                lvMedo.setOnItemClickListener( new AdapterView.OnItemClickListener() {
                                    @Override
                                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                        switch (position){
                                            case 0:
                                                imageMedo.setImageResource( R.drawable.olhos_6_azul );
                                                showMedo.dismiss();
                                                break;
                                            case 1:
                                                imageMedo.setImageResource( R.drawable.olhos_6_marrom );
                                                showMedo.dismiss();
                                                break;
                                            case 2:
                                                imageMedo.setImageResource( R.drawable.olhos_6_verde );
                                                showMedo.dismiss();
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
        } );

        //Botão Nariz
        Button btNariz = findViewById( R.id.botaoNariz );
        btNariz.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogPincipal = new AlertDialog.Builder( MainActivity.this );
                LayoutInflater inflaterPrincipal = getLayoutInflater();
                View convertView = (View) inflaterPrincipal.inflate( R.layout.custompopup_mouth,null );
                alertDialogPincipal.setView( convertView );
                ListView lvPrincipal = (ListView) convertView.findViewById( R.id.listaImagens );
                lvPrincipal.setAdapter( new CustomAdapter( MainActivity.this, DataItem.getNarizPIcones() ) );
                final AlertDialog showPrincipal = alertDialogPincipal.show();
                lvPrincipal.setOnItemClickListener( new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        ImageView imageN = findViewById(R.id.imgNeriz);
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
        } );
    }

    public static class Screenshot {
        public static Bitmap takescreenshot (View v){
            v.setDrawingCacheEnabled( true );
            v.buildDrawingCache(true);
            Bitmap b = Bitmap.createBitmap( v.getDrawingCache() );
            v.setDrawingCacheEnabled( false );
            return b;
        }
        public static Bitmap takescreenshotOfRootView(View v){
            return takescreenshot( v.getRootView() );
        }
    }

    public static Bitmap scaleDownBitmap(Bitmap photo, int newHeight, Context context) {
        final float densityMultiplier = context.getResources().getDisplayMetrics().density;
        int h= (int) (newHeight*densityMultiplier);
        int w= (int) (h * photo.getWidth()/((double) photo.getHeight()));
        photo=Bitmap.createScaledBitmap(photo, w, h, true);
        return photo;
    }



}
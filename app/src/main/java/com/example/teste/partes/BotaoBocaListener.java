package com.example.teste.partes;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.teste.ParteAvatarAdapter;
import com.example.teste.ParteAvatar;
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
        lv.setAdapter( new ParteAvatarAdapter( context, ParteAvatar.getBocaIcones() ) );
        final AlertDialog show = alertDialog.show();
        lv.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ParteAvatar parteAvatar = (ParteAvatar) parent.getItemAtPosition(position);
                ImageView image = context.findViewById(R.id.imgBoca);
                image.setImageResource(parteAvatar.getImagem());
                show.dismiss();
            }
        } );
    }
}

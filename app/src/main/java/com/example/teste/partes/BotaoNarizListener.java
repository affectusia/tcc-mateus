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
        lvPrincipal.setAdapter( new ParteAvatarAdapter(context, ParteAvatar.getNarizPIcones() ) );
        final AlertDialog showPrincipal = alertDialogPincipal.show();
        lvPrincipal.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ParteAvatar parteAvatar = (ParteAvatar) parent.getItemAtPosition(position);
                ImageView imageN = context.findViewById(R.id.imgNeriz);
                imageN.setImageResource(parteAvatar.getImagem());
                showPrincipal.dismiss();
            }
        });
    }
}

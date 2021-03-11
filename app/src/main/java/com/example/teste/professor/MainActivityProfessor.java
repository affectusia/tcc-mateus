package com.example.teste.professor;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.util.Base64;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.teste.MainActivity;
import com.example.teste.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;


public class MainActivityProfessor extends AppCompatActivity implements View.OnClickListener {
    private Button UploadBn, ChooseBn;
    private EditText NAME;
    private ImageView imgView;
    private final int IMG_REQUEST = 1;

    private Bitmap bitmap;
    Bitmap bitmap2;

    private String UploarUrl = "http://10.0.2.2/imageuploadapp/updateinfo.php";
    //private String UploarUrl = "http://localhost/imageuploadapp/updateinfo.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_professor);

        Intent intent = getIntent();
        Parcelable bitmap2 = intent.getParcelableExtra("BitmapImage");

        UploadBn = (Button) findViewById(R.id.uploadBn);
        ChooseBn = (Button) findViewById(R.id.chooseBn);
        NAME = (EditText) findViewById(R.id.name);
        imgView = (ImageView) findViewById(R.id.imageView);

        UploadBn.setOnClickListener(MainActivityProfessor.this);
        ChooseBn.setOnClickListener(MainActivityProfessor.this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.chooseBn:
                selectImage();
                break;

            case R.id.uploadBn:
                uploadImage();
                break;

        }

    }

    private void selectImage(){
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, IMG_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
            Uri path = data.getData();
            try {
                bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(),path);
                imgView.setImageBitmap(bitmap);
                imgView.setVisibility(View.VISIBLE);
                NAME.setVisibility(View.VISIBLE);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    private  void uploadImage(){
        StringRequest stringRequest = new StringRequest(Request.Method.POST, UploarUrl,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            String Response = jsonObject.getString("response");
                            Toast.makeText(MainActivityProfessor.this, Response, Toast.LENGTH_LONG).show();
                            imgView.setImageResource(0);
                            imgView.setVisibility(View.GONE);
                            NAME.setText("");
                            NAME.setVisibility(View.GONE);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("name", NAME.getText().toString().trim());
                params.put("image", imageToString(bitmap));
                return params;
            }
        };
        MySingleton.getInstance(MainActivityProfessor.this).addToRequestQue(stringRequest);
    }

    private String imageToString (Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream);
        byte[] imgBytes = byteArrayOutputStream.toByteArray();
        return Base64.encodeToString(imgBytes, Base64.DEFAULT);
    }

}
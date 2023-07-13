package com.example.retoprcts.ui.intro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.retoprcts.ui.login.LoginActivity;
import com.example.retoprcts.R;

public class IntroActivity extends AppCompatActivity {
    private CardView crv;
    private EditText edt;
    /*  ImageView img;
      TextView txt;

      CardView crv;
      TextView txt_subtitulo;
  */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        crv = findViewById(R.id.crv_btn);
        edt = findViewById(R.id.edt_nombre);

        crv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle enviarDatos = new Bundle();
                enviarDatos.putString("KeyName", edt.getText().toString());

                Intent intent = new Intent(IntroActivity.this, LoginActivity.class);
                intent.putExtras(enviarDatos);
                startActivity(intent);
            }
        });

    /*    img = findViewById(R.id.img_intro);
        txt = findViewById(R.id.txt_btn);
        crv = findViewById(R.id.crv_btn);
        txt_subtitulo= findViewById(R.id.txt_subtitulo);

        txt.setOnClickListener(view -> {
            img.setVisibility(View.GONE);
        });

        crv.setOnClickListener(view -> {
            img.setVisibility(View.VISIBLE);
        });*/
    }
}
package com.example.retoprcts.ui.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.retoprcts.ui.home.HomeActivity;
import com.example.retoprcts.R;

public class LoginActivity extends AppCompatActivity {

    private TextView txt_view;
    private CardView card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txt_view = findViewById(R.id.txt_name);
        card = findViewById(R.id.crv_boton);

        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, HomeActivity.class));

            }
        });

        Bundle recibeName = getIntent().getExtras();
        String info = recibeName.getString("KeyName");

        txt_view.setText(info);
    }
}
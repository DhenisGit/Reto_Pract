package com.example.retoprcts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.PatternsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.util.Patterns;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button btnLoginn = findViewById(R.id.btnregister);
        btnLoginn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    validarEmail();
            }
        });



    }
    private boolean validarEmail() {
        EditText editTextEmail = findViewById(R.id.email2);
        String email = editTextEmail.getText().toString().trim();
        boolean emailValido = Patterns.EMAIL_ADDRESS.matcher(email).matches();

        if (emailValido) {
            Toast.makeText(this, "El correo electrónico es válido", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "El correo electrónico no es válido", Toast.LENGTH_SHORT).show();
        }

        return emailValido;
    }
}
package com.example.retoprcts.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.retoprcts.R;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        EditText editTextcalcu = findViewById(R.id.calcu);
        EditText editTextcal = findViewById(R.id.cal);
        EditText editTextnot = findViewById(R.id.not);
        EditText editTextset = findViewById(R.id.set);
        Button button = findViewById(R.id.btn_sub);
        TextView textView = findViewById(R.id.txt_resul);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float calcu = Float.parseFloat(String.valueOf(editTextcalcu.getText()));
                float cal = Float.parseFloat(String.valueOf(editTextcal.getText()));
                float not = Float.parseFloat(String.valueOf(editTextnot.getText()));
                float set = Float.parseFloat(String.valueOf(editTextset.getText()));
                float bmi = (calcu + cal + not + set) / 4;
                textView.setText(String.valueOf(bmi));

            }
        });
    }
}
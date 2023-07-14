package com.example.retoprcts;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumber1, editTextNumber2, editTextNumber3, editTextNumber4, editTextNumber5;
    private Button buttonCalculate, buttonLimpiar;
    private TextView textViewResult, textViewPromedio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber1 = findViewById(R.id.pro1);
        editTextNumber2 = findViewById(R.id.pro2);
        editTextNumber3 = findViewById(R.id.pro3);
        editTextNumber4 = findViewById(R.id.pro4);
        editTextNumber5 = findViewById(R.id.pro5);
        buttonCalculate = findViewById(R.id.calcularprom);
        buttonLimpiar = findViewById(R.id.btnLimpiar);
        textViewResult = findViewById(R.id.resultado);
        textViewPromedio = findViewById(R.id.pdf);

        buttonLimpiar.setVisibility(View.GONE);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateFields()) {
                    double number1 = Double.parseDouble(editTextNumber1.getText().toString());
                    double number2 = Double.parseDouble(editTextNumber2.getText().toString());
                    double number3 = Double.parseDouble(editTextNumber3.getText().toString());
                    double number4 = Double.parseDouble(editTextNumber4.getText().toString());
                    double number5 = Double.parseDouble(editTextNumber5.getText().toString());

                    double average = (number1 + number2 + number3 + number4 + number5) / 5;

                    DecimalFormat decimalFormat = new DecimalFormat("0.0");
                    String formattedAverage = decimalFormat.format(average);

                    if (average >= 11 && average <= 20) {
                        textViewResult.setText(formattedAverage);
                        textViewPromedio.setText("Aprobado");
                        textViewPromedio.setTextColor(Color.GREEN);
                        textViewResult.setTextColor(Color.BLACK);
                    } else {
                        textViewResult.setText(formattedAverage);
                        textViewPromedio.setText("Desaprobado");
                        textViewPromedio.setTextColor(Color.RED);
                        textViewResult.setTextColor(Color.BLACK);
                    }

                    buttonLimpiar.setVisibility(View.VISIBLE);
                }
            }
        });

        buttonLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearFields();
                textViewResult.setTextColor(Color.BLACK);
                buttonLimpiar.setVisibility(View.GONE);
            }
        });
    }

    private boolean validateFields() {
        boolean isValid = true;

        if (editTextNumber1.getText().toString().isEmpty()) {
            editTextNumber1.setError("Este campo es obligatorio");
            isValid = false;
        } else {
            double number1 = Double.parseDouble(editTextNumber1.getText().toString());
            if (number1 < 0 || number1 > 20) {
                editTextNumber1.setError("Ingrese un número entre 0 y 20");
                isValid = false;
            }
        }

        if (editTextNumber2.getText().toString().isEmpty()) {
            editTextNumber2.setError("Este campo es obligatorio");
            isValid = false;
        } else {
            double number2 = Double.parseDouble(editTextNumber2.getText().toString());
            if (number2 < 0 || number2 > 20) {
                editTextNumber2.setError("Ingrese un número entre 0 y 20");
                isValid = false;
            }
        }

        if (editTextNumber3.getText().toString().isEmpty()) {
            editTextNumber3.setError("Este campo es obligatorio");
            isValid = false;
        } else {
            double number3 = Double.parseDouble(editTextNumber3.getText().toString());
            if (number3 < 0 || number3 > 20) {
                editTextNumber3.setError("Ingrese un número entre 0 y 20");
                isValid = false;
            }
        }

        if (editTextNumber4.getText().toString().isEmpty()) {
            editTextNumber4.setError("Este campo es obligatorio");
            isValid = false;
        } else {
            double number4 = Double.parseDouble(editTextNumber4.getText().toString());
            if (number4 < 0 || number4 > 20) {
                editTextNumber4.setError("Ingrese un número entre 0 y 20");
                isValid = false;
            }
        }

        if (editTextNumber5.getText().toString().isEmpty()) {
            editTextNumber5.setError("Este campo es obligatorio");
            isValid = false;
        } else {
            double number5 = Double.parseDouble(editTextNumber5.getText().toString());
            if (number5 < 0 || number5 > 20) {
                editTextNumber5.setError("Ingrese un número entre 0 y 20");
                isValid = false;
            }
        }

        return isValid;
    }

    private void clearFields() {
        editTextNumber1.setText("");
        editTextNumber2.setText("");
        editTextNumber3.setText("");
        editTextNumber4.setText("");
        editTextNumber5.setText("");
        textViewResult.setText("");
        textViewPromedio.setText("");
    }
}

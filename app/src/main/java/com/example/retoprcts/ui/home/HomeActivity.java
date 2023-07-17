package com.example.retoprcts.ui.home;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
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
       /* EditText editTextnot = findViewById(R.id.not);
        EditText editTextset = findViewById(R.id.set);*/
        Button button = findViewById(R.id.btn_sub);
        Button button_suma  = findViewById(R.id.btn_suma);
        Button button_div = findViewById(R.id.btn_divide);
        Button button_mul = findViewById(R.id.btn_multi);

        TextView textView = findViewById(R.id.txt_resul);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String resta1 = editTextcalcu.getText().toString();
                String resta2 = editTextcal.getText().toString();
                /*float not = Float.parseFloat(String.valueOf(editTextnot.getText()));
                float set = Float.parseFloat(String.valueOf(editTextset.getText()));
                double calcu = Double.parseDouble(String.valueOf(editTextcalcu.getText()));
                double cal = Double.parseDouble(String.valueOf(editTextcal.getText()));
                double bmi = (calcu - cal);
                textView.setText(String.valueOf(bmi));*/

                if (resta1.isEmpty()) {

                    Log.d(TAG,"============");
                    Log.d(TAG,"No hay datos:");
                    Log.d(TAG,"============");

                    editTextcalcu.setError("INGRESAR DATOS");
                    editTextcalcu.requestFocus();

                }else {
                    Log.d(TAG,"============");
                    Log.d(TAG,"Si hay datos: (" + resta1 + ")");
                    Log.d(TAG,"============");
                }

                if (resta2.isEmpty()) {

                    Log.d(TAG,"============");
                    Log.d(TAG,"No hay datos:");
                    Log.d(TAG,"============");

                    editTextcal.setError("INGRESAR DATOS");
                    editTextcal.requestFocus();

                }else {
                    Log.d(TAG,"============");
                    Log.d(TAG,"Si hay datos: (" + resta2 + ")");
                    Log.d(TAG,"============");

                    double restaTotal = Double.parseDouble(resta1);
                    double restaFinal = Double.parseDouble(resta2);

                    double resultadoFinal = (restaTotal - restaFinal);
                    textView.setText(String.format("%.2f", resultadoFinal));

                    Log.d(TAG, "TOTAL ES: (" + String.format("%.2f", resultadoFinal) + ")");
                }
            }
        });

        button_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String suma = editTextcalcu.getText().toString();
                String summa4 = editTextcal.getText().toString();

             /*   double suma1 = Double.parseDouble(String.valueOf(editTextcalcu.getText()));
                double suma2 = Double.parseDouble(String.valueOf(editTextcal.getText()));*/


                if (suma.isEmpty()) {
                    Log.d(TAG,"============");
                    Log.d(TAG,"No hay datos:");
                    Log.d(TAG,"============");

                    editTextcalcu.setError("INGRESAR DATOS");
                    editTextcalcu.requestFocus();

                }else {
                    Log.d(TAG,"============");
                    Log.d(TAG,"Si hay datos: (" + suma + ")");
                    Log.d(TAG,"============");
                }

                if (summa4.isEmpty()) {
                    Log.d(TAG,"============");
                    Log.d(TAG,"No hay datos:");
                    Log.d(TAG,"============");

                    editTextcal.setError("INGRESAR DATOS");
                    editTextcal.requestFocus();


                }else {
                    Log.d(TAG,"============");
                    Log.d(TAG,"Si hay datos: (" + summa4 + ")");
                    Log.d(TAG,"============");

                    double sumaprime = Double.parseDouble(suma);
                    double sumasecun = Double.parseDouble(summa4);

                    double resultado = (sumaprime + sumasecun);
                    textView.setText(String.format("%.2f", resultado));

                    Log.d(TAG, "TOTAL ES: (" + String.format("%.2f", resultado) + ")");

                }

//                Value en otro código
                /*Log.d(TAG, "==============");
                Log.d(TAG, "Total es :(" + resultado + ")");
                Log.d(TAG, "==============");
                */


            }
        });

        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String dividir1 = editTextcalcu.getText().toString();
                String dividir2 = editTextcal.getText().toString();
              /*  double div_1 = Double.parseDouble(String.valueOf(editTextcalcu.getText()));
                double div_2 = Double.parseDouble(String.valueOf(editTextcal.getText()));

                double divide = (div_1 / div_2);

                textView.setText(String.valueOf(divide));*/

                if (dividir1.isEmpty()) {

                    Log.d(TAG,"============");
                    Log.d(TAG,"No hay datos:");
                    Log.d(TAG,"============");

                    editTextcalcu.setError("INGRESAR DATOS");
                    editTextcalcu.requestFocus();

                }else {
                    Log.d(TAG,"============");
                    Log.d(TAG,"Si hay datos: (" + dividir1 + ")");
                    Log.d(TAG,"============");
                }

                if (dividir2.isEmpty()) {
                    Log.d(TAG,"============");
                    Log.d(TAG,"No hay datos:");
                    Log.d(TAG,"============");

                    editTextcal.setError("INGRESAR DATOS");
                    editTextcal.requestFocus();


                }else {
                    Log.d(TAG,"============");
                    Log.d(TAG,"Si hay datos: (" + dividir2 + ")");
                    Log.d(TAG,"============");

                    double dividirFin = Double.parseDouble(dividir1);
                    double dividirFinal = Double.parseDouble(dividir2);

                    double dividirResult = (dividirFin / dividirFinal);
                    textView.setText(String.format("%.2f", dividirResult));

                    Log.d(TAG, "TOTAL ES: (" + String.format("%.2f", dividirResult) + ")");
                }
            }
        });

        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String multi1 = editTextcalcu.getText().toString();
                String multi2 = editTextcal.getText().toString();
                /*double multi_1 = Double.parseDouble(String.valueOf(editTextcalcu.getText()));
                double multi_2 = Double.parseDouble(String.valueOf(editTextcal.getText()));

                double multiplicacion = (multi_1 * multi_2);

                textView.setText(String.valueOf(multiplicacion));*/

                if (multi1.isEmpty()) {

                    Log.d(TAG,"============");
                    Log.d(TAG,"No hay datos:");
                    Log.d(TAG,"============");

                    editTextcalcu.setError("INGRESAR DATOS");
                    editTextcalcu.requestFocus();

                }else {
                    Log.d(TAG,"============");
                    Log.d(TAG,"Si hay datos: (" + multi1 + ")");
                    Log.d(TAG,"============");
                }

                if (multi2.isEmpty()) {
                    Log.d(TAG,"============");
                    Log.d(TAG,"No hay datos:");
                    Log.d(TAG,"============");

                    editTextcal.setError("INGRESAR DATOS");
                    editTextcal.requestFocus();


                }else {
                    Log.d(TAG,"============");
                    Log.d(TAG,"Si hay datos: (" + multi2 + ")");
                    Log.d(TAG,"============");

                    double multiFin = Double.parseDouble(multi1);
                    double multiFinal = Double.parseDouble(multi2);

                    double multiResul = (multiFin * multiFinal);
                    textView.setText(String.format("%.2f", multiResul));

                    Log.d(TAG, "TOTAL ES: (" + String.format("%.2f", multiResul) + ")");
                }
            }
        });
    }
}
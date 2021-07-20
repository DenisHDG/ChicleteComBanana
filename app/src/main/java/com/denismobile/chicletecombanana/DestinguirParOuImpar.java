package com.denismobile.chicletecombanana;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DestinguirParOuImpar extends AppCompatActivity {

    private boolean resultado = false;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinguir_par_ou_impar);
        EditText editTextValor = findViewById(R.id.editTextValor);
        Button buttonClicar = findViewById(R.id.buttonClicar);
        TextView textViewResultado = findViewById(R.id.textViewResultado);


        buttonClicar.setOnClickListener(view -> {
            int valor_digitado = Integer.parseInt(editTextValor.getText().toString());
            calcularPar(valor_digitado);
            resultado = calcularPar(valor_digitado);
            if (resultado == true) {
                textViewResultado.setText("PAR");
                textViewResultado.setTextColor(Color.parseColor("#000099"));
            } else {
                textViewResultado.setText("IMPAR");
                textViewResultado.setTextColor(R.color.purple_500);
            }

        });
    }

    public boolean calcularPar(int valor) {
        if ((valor % 2) == 0) {
            return true;

        } else {

            return false;
        }

    }
}
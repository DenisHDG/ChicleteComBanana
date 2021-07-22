package com.denismobile.chicletecombanana;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.denismobile.chicletecombanana.R.layout.contasbasicas;


public class ContasBasicasECalculadora extends AppCompatActivity {

    int resultado = 0;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(contasbasicas);

        EditText textViewNumero1 = findViewById(R.id.textViewNumero1);
        EditText textViewNumero2 = findViewById(R.id.textViewNumero2);
        Button button_multiplicacao = findViewById(R.id.button_multiplicacao);
        TextView textViewResultadoMultiplicacao = findViewById(R.id.textViewResultadoMultiplicacao);

        button_multiplicacao.setOnClickListener(v -> {

             resultado = multiplicacao(textViewNumero1.getText().toString(), textViewNumero2.getText().toString());
            textViewResultadoMultiplicacao.setText(Integer.toString( resultado));
        });


    }
    // String esta virando um int,que faz a multiplicação entre o número um e o número dois.
    public int multiplicacao(String v1, String v2){
        int v = Integer.parseInt(v1);
        int z = Integer.parseInt(v2);
        int resultado =  v*z;
        return resultado;
    }
}
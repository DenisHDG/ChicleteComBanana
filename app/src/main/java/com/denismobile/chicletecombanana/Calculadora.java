package com.denismobile.chicletecombanana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Calculadora extends AppCompatActivity {

    //Declaração das variavei privadas para usar fora do contexto do oncreate
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button bMais;
    private Button bIgual;
    private EditText editTextTextPersonName;
    private String result1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        //CONEXÇAO DAS VARIAVEIS COM OS IDS DA TELA
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        bMais = findViewById(R.id.buttonMais);
        bIgual = findViewById(R.id.buttonIgual);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);

        //FUNCIONALIDADES DOS BOTOES
        b1.setOnClickListener( view -> {
            String conc = editTextTextPersonName.getText().toString();
            editTextTextPersonName.setText(conc.concat("1"));
        });
        b2.setOnClickListener( view -> {
            String conc = editTextTextPersonName.getText().toString();
            editTextTextPersonName.setText(conc.concat("2"));
        });
        b3.setOnClickListener( view -> {
            String conc = editTextTextPersonName.getText().toString();
            editTextTextPersonName.setText(conc.concat("3"));
        });

        b4.setOnClickListener( view -> {
            String conc = editTextTextPersonName.getText().toString();
            editTextTextPersonName.setText(conc.concat("4"));
        });
        bMais.setOnClickListener(view -> {
            String conc = editTextTextPersonName.getText().toString();
            result1 = conc;
            editTextTextPersonName.setText(conc.concat("+"));
        });
//        bIgual.setOnClickListener(view -> {
//
//            bIgual
//        });
//        dado = dado.replaceAll(".","");


    }
}


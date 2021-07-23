package com.denismobile.chicletecombanana;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_troca_de_chiclete = findViewById(R.id.button_troca_de_chiclete);
        button_troca_de_chiclete.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this,
                    TrocaDeChiclete.class);
            startActivity(i);
        });


        Button button_par_ou_impar = findViewById(R.id.button_par_ou_impar);
        button_par_ou_impar.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this,
                    DestinguirParOuImpar.class);
            startActivity(i);
        });


        Button button_idade_e_dias = findViewById(R.id.button_idade_e_dias);
        button_idade_e_dias.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this,
                    ActivityIdadeDiasMesesAnos.class);
            startActivity(i);
        });
        Button button_elicao = findViewById(R.id.button_elicao);
        button_elicao.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this,
                    Eleicao.class);
            startActivity(i);
        });
        Button button_calcular = findViewById(R.id.button_calcular);
        button_calcular.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this,
                    ContasBasicasECalculadora.class);
            startActivity(i);
        });

        Button buttoCalculadora = findViewById(R.id.buttoCalculadora);
        buttoCalculadora.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this,
                    Calculadora.class);
            startActivity(i);

        });

    }
}
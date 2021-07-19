package com.denismobile.chicletecombanana;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_troca_de_chiclete = findViewById(R.id.button_troca_de_chiclete);
        button_troca_de_chiclete.setOnClickListener(view ->{
            Intent i = new Intent(MainActivity.this,
                    TrocaDeChiclete.class);
            startActivity(i);
        });


        Button button_par_ou_impar= findViewById(R.id.button_par_ou_impar);
        button_par_ou_impar.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this,
                    DestinguirParOuImpar.class);
            startActivity(i);
        });
    }
}

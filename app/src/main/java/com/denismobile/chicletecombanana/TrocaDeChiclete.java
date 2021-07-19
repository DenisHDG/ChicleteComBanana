package com.denismobile.chicletecombanana;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TrocaDeChiclete extends AppCompatActivity {

    private boolean bannerStatus = true;

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_troca_de_chiclete);

        Button button_change_chiclete = findViewById(R.id.button_change_chiclete);
        ImageView imageView_chiclete = findViewById(R.id.imageView_chiclete);
        TextView textView_name_chiclete = findViewById(R.id.textView_name_chiclete);

        button_change_chiclete.setOnClickListener(view -> {
            if (bannerStatus) {
                imageView_chiclete.setImageDrawable(getDrawable(R.drawable.tridente));
                textView_name_chiclete.setText(R.string.name_tridente);
                bannerStatus = false;
            } else {
                imageView_chiclete.setImageDrawable(getDrawable(R.drawable.bigbig));
                textView_name_chiclete.setText(R.string.bibig);
                bannerStatus = true;
            }
        });
    }
}
package com.denismobile.chicletecombanana;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button_change_chiclete;
    private ImageView imageView_chiclete;
    private TextView textView_name_chiclete;
    private boolean bannerStatus = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_change_chiclete  = findViewById(R.id.button_change_chiclete);
        imageView_chiclete = findViewById(R.id.imageView_chiclete);
        textView_name_chiclete =  findViewById(R.id.textView_name_chiclete);

        button_change_chiclete.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View v) {

                if(bannerStatus == true ){
                    imageView_chiclete.setImageDrawable(getDrawable(R.drawable.tridente));
                    textView_name_chiclete.setText(R.string.name_tridente);
                    bannerStatus = false;
                }else{
                    imageView_chiclete.setImageDrawable(getDrawable(R.drawable.bigbig));
                    textView_name_chiclete.setText(R.string.bibig);
                    bannerStatus = true;
                }


            }
        });


    }
}
package com.denismobile.chicletecombanana;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class MostrandoIdaeEDias extends AppCompatActivity {

    private String dataNascimentoUsuario;
    private int idadeUsuário;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrando_idae_edias);
        @SuppressLint("SimpleDateFormat")


        EditText editTextData = findViewById(R.id.editTextData);
        Button buttonCliqueAqui = findViewById(R.id.buttonCliqueAqui);
        TextView textViewResultado1 = findViewById(R.id.textViewResultado1);
        TextView textViewRsesultado2 = findViewById(R.id.textViewRsesultado2);

        buttonCliqueAqui.setOnClickListener(view -> {
            dataNascimentoUsuario = editTextData.getText().toString();
            idadeUsuário = retornaIdade(dataNascimentoUsuario);

            textViewResultado1.setText(Integer.toString(idadeUsuário));
            textViewRsesultado2.setText(Integer.toString(idadeUsuário * 365));

            //COMANDO PARA FECHAR O TECLADO
            ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE))
                    .hideSoftInputFromWindow(editTextData.getWindowToken(), 0);
        });
    }

    private int retornaIdade(String dataNascimentoUsuario) {

        Date date = null;
        @SuppressLint("SimpleDateFormat")
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            date = sdf.parse(dataNascimentoUsuario);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (date == null) return 0;

        Calendar dob = Calendar.getInstance();
        Calendar today = Calendar.getInstance();

        dob.setTime(date);

        int year = dob.get(Calendar.YEAR);
        int month = dob.get(Calendar.MONTH);
        int day = dob.get(Calendar.DAY_OF_MONTH);

        dob.set(year, month + 1, day);

        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);

        if (today.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }


        return age;
    }
}
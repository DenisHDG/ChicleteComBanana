package com.denismobile.chicletecombanana;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.StringCharacterIterator;
import java.util.Calendar;
import java.util.Date;


public class ActivityIdadeDiasMesesAnos extends AppCompatActivity {

    private String dataNascimentoUsuario;
    private int idadeUsuarioEmMeses;
    private int idadeUsuarioEmDias;
    private int idadeUsuarioEmHoras;
    private int idadeUsuarioEmMinutos;
    private int idadeUsuarioEmSegundos;
    private int idadeUsuarioEmAnos;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrando_idae_edias);
        @SuppressLint("SimpleDateFormat")


        EditText editTextData = findViewById(R.id.editTextData);
        Button buttonCliqueAqui = findViewById(R.id.buttonCliqueAqui);
        TextView textViewResultadoIdade = findViewById(R.id.textViewResultadoIdade);
        TextView textViewRsesultadoDias = findViewById(R.id.textViewResultadoDias);
        TextView textViewResultadoM = findViewById(R.id.textViewResultadoM);
        TextView textViewResultadoH = findViewById(R.id.textViewResultadoH);
        TextView textViewResultadoMin = findViewById(R.id.textViewResultadoMin);
        TextView textViewResultadoS = findViewById(R.id.textViewResultadoS);


        buttonCliqueAqui.setOnClickListener(view -> {
            dataNascimentoUsuario = editTextData.getText().toString();

            idadeUsuarioEmAnos = retornaIdadeEmDias(dataNascimentoUsuario);
            idadeUsuarioEmMeses = retornaMesesVividos(idadeUsuarioEmAnos);
            idadeUsuarioEmHoras = retornaHorasVividas(idadeUsuarioEmAnos);
            idadeUsuarioEmMinutos = retornaMinutosVividos(idadeUsuarioEmAnos);
            idadeUsuarioEmSegundos = retornaSegundosVividos(idadeUsuarioEmAnos);


            textViewResultadoIdade.setText(Integer.toString(idadeUsuarioEmAnos));
            textViewRsesultadoDias.setText(Integer.toString((idadeUsuarioEmAnos * 365)));
            textViewResultadoM.setText(Integer.toString(idadeUsuarioEmMeses));
            textViewResultadoH.setText(Integer.toString(idadeUsuarioEmAnos));
            textViewResultadoMin.setText(Integer.toString(idadeUsuarioEmAnos));
            textViewResultadoS.setText(Integer.toString(idadeUsuarioEmAnos));

            //COMANDO PARA FECHAR O TECLADO
            ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE))
                    .hideSoftInputFromWindow(editTextData.getWindowToken(), 0);
        });
    }
    private int retornaIdadeEmDias(String dataNascimentoUsuario) {

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

    private int retornaHorasVividas(int idadeUsuarioEmDias){
        int retornoIdadeUsuarioEmHoras = idadeUsuarioEmDias * 24;
        return retornoIdadeUsuarioEmHoras;
    }
    private int retornaMesesVividos(int idadeUsuarioEmDias){
        int retornoIdadeUsuarioEmMeses = idadeUsuarioEmDias * 12;
        return retornoIdadeUsuarioEmMeses;
    }
    private int retornaMinutosVividos(int idadeUsuarioEmDias){
        int retornoIdadeUsuarioEmMinutos = idadeUsuarioEmDias * 1440;
        return retornoIdadeUsuarioEmMinutos;
    }
    private int retornaSegundosVividos(int idadeUsuarioEmDias){
        int retornoIdadeUsuarioEmSegundos = idadeUsuarioEmDias * 86400;
        return retornoIdadeUsuarioEmSegundos;
    }
}
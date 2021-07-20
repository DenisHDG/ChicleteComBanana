package com.denismobile.chicletecombanana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Eleicao extends AppCompatActivity {

    private int contadorBobEsponja = 0;
    private int contadorPatric = 0;
    private int contadorLulaMolusculo = 0;
    private int contadorSandy = 0;

    private ImageView imageView_bob_esponja;
    private ImageView imageView_patric;
    private ImageView imageView_lula_molusco;
    private ImageView imageView_sandy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleicao);

        imageView_bob_esponja = findViewById(R.id.imageView_bob_esponja);
        imageView_patric = findViewById(R.id.imageView_patric);
        imageView_lula_molusco = findViewById(R.id.imageView_lula_molusco);
        imageView_sandy = findViewById(R.id.imageView_sandy);

        Button button_resultado = findViewById(R.id.button_resultado);
        Button button_refazer = findViewById(R.id.button_refazer);

        button_refazer.setVisibility(View.GONE);

        TextView textViewResultado = findViewById(R.id.textViewResultado);

        imageView_bob_esponja.setOnClickListener(view -> {
            contadorBobEsponja++;
            Toast.makeText(this, "Você votou no Bob Esponja", Toast.LENGTH_LONG).show();
        });
        imageView_patric.setOnClickListener(view -> {
            contadorPatric++;
            Toast.makeText(this, "Você votou no Patric", Toast.LENGTH_LONG).show();
        });
        imageView_lula_molusco.setOnClickListener(view -> {
            contadorLulaMolusculo++;
            Toast.makeText(this, "Você votou no Lula Molusco", Toast.LENGTH_LONG).show();
        });
        imageView_sandy.setOnClickListener(view -> {
            contadorSandy++;
            Toast.makeText(this, "Você votou na Sandy", Toast.LENGTH_LONG).show();
        });

        button_resultado.setOnClickListener(view -> {
            if (contadorBobEsponja >= contadorPatric &&
                    contadorBobEsponja >= contadorLulaMolusculo &&
                    contadorBobEsponja >= contadorSandy) {
                EscondeTodos();
                imageView_bob_esponja.setVisibility(View.VISIBLE);
                textViewResultado.setText("Bob Esponja Venceu !!!");
            } else {
                if (contadorPatric >= contadorBobEsponja &&
                        contadorPatric >= contadorLulaMolusculo &&
                        contadorPatric >= contadorSandy) {
                    EscondeTodos();
                    imageView_patric.setVisibility(View.VISIBLE);
                    textViewResultado.setText("Patric Venceu !!!");
                } else {
                    if (contadorSandy >= contadorBobEsponja &&
                            contadorSandy >= contadorLulaMolusculo &&
                            contadorSandy >= contadorPatric) {
                        EscondeTodos();
                        imageView_sandy.setVisibility(View.VISIBLE);
                        textViewResultado.setText("Sandy Venceu !!!");

                    } else {
                        if (contadorLulaMolusculo >= contadorBobEsponja &&
                                contadorLulaMolusculo >= contadorSandy &&
                                contadorLulaMolusculo >= contadorPatric) {
                            EscondeTodos();
                            imageView_lula_molusco.setVisibility(View.VISIBLE);
                            textViewResultado.setText("Lula Molusco Venceu !!!");
                        }
                    }
                }
            }
            button_refazer.setVisibility(View.VISIBLE);

        });
        button_refazer.setOnClickListener(view -> {
            MostraTodos();
            ZerarContador();
        });
    }

    public void EscondeTodos() {
        imageView_bob_esponja.setVisibility(View.GONE);
        imageView_patric.setVisibility(View.GONE);
        imageView_sandy.setVisibility(View.GONE);
        imageView_lula_molusco.setVisibility(View.GONE);
    }

    public void MostraTodos() {
        imageView_bob_esponja.setVisibility(View.VISIBLE);
        imageView_patric.setVisibility(View.VISIBLE);
        imageView_sandy.setVisibility(View.VISIBLE);
        imageView_lula_molusco.setVisibility(View.VISIBLE);
    }

    public void ZerarContador() {
        contadorBobEsponja = 0;
        contadorPatric = 0;
        contadorLulaMolusculo = 0;
        contadorSandy = 0;
    }
}
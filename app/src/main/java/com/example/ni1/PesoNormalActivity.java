package com.example.ni1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PesoNormalActivity extends AppCompatActivity {

    TextView textoMostraPeso2, textoMostraAltura2, textoMostraIMC2, textoMostraClassificacao2;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso_normal); // Certifique-se que esse é o nome correto do layout XML

        textoMostraPeso2 = findViewById(R.id.textoMostraPeso2);
        textoMostraAltura2 = findViewById(R.id.textoMostraAltura2);
        textoMostraIMC2 = findViewById(R.id.textoMostraIMC2);
        textoMostraClassificacao2 = findViewById(R.id.textoMostraClassificacao2);
        btnVoltar = findViewById(R.id.btn1tela4);

        // Pegando os dados passados pela intent
        double peso = getIntent().getDoubleExtra("peso", 0.0);
        double altura = getIntent().getDoubleExtra("altura", 0.0);
        double imc = getIntent().getDoubleExtra("valor_imc", 0.0);

        // Setando os valores nos TextViews
        textoMostraPeso2.setText(String.format("%.2f kg", peso));
        textoMostraAltura2.setText(String.format("%.2f m", altura));
        textoMostraIMC2.setText(String.format("%.2f", imc));
        textoMostraClassificacao2.setText("Peso Normal"); // ou use uma string do strings.xml se preferir

        // Botão Voltar para tela anterior
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Fecha essa Activity
            }
        });
    }
}

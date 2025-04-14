package com.example.ni1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SobrepesoActivity extends AppCompatActivity {

    TextView textoMostraPeso3, textoMostraAltura3, textoMostraIMC3, textoMostraClassificacao3;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobrepeso); // certifique-se do nome correto do XML

        textoMostraPeso3 = findViewById(R.id.textoMostraPeso3);
        textoMostraAltura3 = findViewById(R.id.textoMostraAltura3);
        textoMostraIMC3 = findViewById(R.id.textoMostraIMC3);
        textoMostraClassificacao3 = findViewById(R.id.textoMostraClassificacao3);
        btnVoltar = findViewById(R.id.btn1tela5);

        // Recupera os dados da Intent
        double peso = getIntent().getDoubleExtra("peso", 0.0);
        double altura = getIntent().getDoubleExtra("altura", 0.0);
        double imc = getIntent().getDoubleExtra("valor_imc", 0.0);

        // Exibe os valores nos TextViews
        textoMostraPeso3.setText(String.format("%.2f kg", peso));
        textoMostraAltura3.setText(String.format("%.2f m", altura));
        textoMostraIMC3.setText(String.format("%.2f", imc));
        textoMostraClassificacao3.setText("Sobrepeso"); // ou use uma string do strings.xml

        // Ação do botão para voltar
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Fecha a activity e volta
            }
        });
    }
}

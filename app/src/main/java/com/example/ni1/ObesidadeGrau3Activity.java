package com.example.ni1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ObesidadeGrau3Activity extends AppCompatActivity {

    TextView textoMostraPeso6, textoMostraAltura6, textoMostraIMC6, textoMostraClassificacao6;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obesidade_grau3);

        textoMostraPeso6 = findViewById(R.id.textoMostraPeso6);
        textoMostraAltura6 = findViewById(R.id.textoMostraAltura6);
        textoMostraIMC6 = findViewById(R.id.textoMostraIMC6);
        textoMostraClassificacao6 = findViewById(R.id.textoMostraClassificacao6);
        btnVoltar = findViewById(R.id.btn1tela6);

        double peso = getIntent().getDoubleExtra("peso", 0.0);
        double altura = getIntent().getDoubleExtra("altura", 0.0);
        double imc = getIntent().getDoubleExtra("valor_imc", 0.0);

        textoMostraPeso6.setText(String.format("%.2f kg", peso));
        textoMostraAltura6.setText(String.format("%.2f m", altura));
        textoMostraIMC6.setText(String.format("%.2f", imc));
        textoMostraClassificacao6.setText("Obesidade Grau III");

        btnVoltar.setOnClickListener(v -> finish());
    }
}

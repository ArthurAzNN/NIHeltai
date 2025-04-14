package com.example.ni1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ObesidadeGrau1Activity extends AppCompatActivity {

    TextView textoMostraPeso4, textoMostraAltura4, textoMostraIMC4, textoMostraClassificacao4;
    Button btnVoltar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obesidade_grau1);

        textoMostraPeso4 = findViewById(R.id.textoMostraPeso4);
        textoMostraAltura4 = findViewById(R.id.textoMostraAltura4);
        textoMostraIMC4 = findViewById(R.id.textoMostraIMC4);
        textoMostraClassificacao4 = findViewById(R.id.textoMostraClassificacao4);
        btnVoltar = findViewById(R.id.btn1tela4);

        double peso = getIntent().getDoubleExtra("peso", 0.0);
        double altura = getIntent().getDoubleExtra("altura", 0.0);
        double imc = getIntent().getDoubleExtra("valor_imc", 0.0);

        textoMostraPeso4.setText(String.format("%.2f kg", peso));
        textoMostraAltura4.setText(String.format("%.2f m", altura));
        textoMostraIMC4.setText(String.format("%.2f", imc));
        textoMostraClassificacao4.setText("Obesidade Grau I");

        btnVoltar.setOnClickListener(v -> finish());
    }
}

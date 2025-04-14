package com.example.ni1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ObesidadeGrau2Activity extends AppCompatActivity {

    TextView textoMostraPeso5, textoMostraAltura5, textoMostraIMC5, textoMostraClassificacao5;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obesidade_grau2);

        textoMostraPeso5 = findViewById(R.id.textoMostraPeso5);
        textoMostraAltura5 = findViewById(R.id.textoMostraAltura5);
        textoMostraIMC5 = findViewById(R.id.textoMostraIMC5);
        textoMostraClassificacao5 = findViewById(R.id.textoMostraClassificacao5);
        btnVoltar = findViewById(R.id.btn1tela5);

        double peso = getIntent().getDoubleExtra("peso", 0.0);
        double altura = getIntent().getDoubleExtra("altura", 0.0);
        double imc = getIntent().getDoubleExtra("valor_imc", 0.0);

        textoMostraPeso5.setText(String.format("%.2f kg", peso));
        textoMostraAltura5.setText(String.format("%.2f m", altura));
        textoMostraIMC5.setText(String.format("%.2f", imc));
        textoMostraClassificacao5.setText("Obesidade Grau II");

        btnVoltar.setOnClickListener(v -> finish());
    }
}

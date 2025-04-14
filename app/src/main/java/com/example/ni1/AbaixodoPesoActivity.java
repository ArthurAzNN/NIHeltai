package com.example.ni1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AbaixodoPesoActivity extends AppCompatActivity {

    TextView textoMostraPeso, textoMostraAltura, textoMostraIMC, textoMostraClassificacao;
    Button btnFechar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abaixodo_peso);

        // Referência dos elementos da tela
        textoMostraPeso = findViewById(R.id.textoMostraPeso);
        textoMostraAltura = findViewById(R.id.textoMostraAltura);
        textoMostraIMC = findViewById(R.id.textoMostraIMC);
        textoMostraClassificacao = findViewById(R.id.textoMostraClassificacao);
        btnFechar = findViewById(R.id.btn1tela3);

        // Recuperar os dados enviados pela outra Activity
        Intent intent = getIntent();
        double peso = intent.getDoubleExtra("peso", 0);
        double altura = intent.getDoubleExtra("altura", 0);
        double imc = intent.getDoubleExtra("valor_imc", 0);

        // Exibir os dados
        textoMostraPeso.setText(String.format("%.2f kg", peso));
        textoMostraAltura.setText(String.format("%.2f m", altura));
        textoMostraIMC.setText(String.format("%.2f", imc));
        textoMostraClassificacao.setText("Abaixo do peso");

        // Ação do botão: voltar para a tela inicial
        btnFechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltar = new Intent(AbaixodoPesoActivity.this, MainActivity.class);
                voltar.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // Limpa a pilha e volta à Main
                startActivity(voltar);
                finish();
            }
        });
    }
}

package com.example.ni1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CalculoIMCActivity extends AppCompatActivity {

    EditText editaTextoPeso, editaTextoAltura;
    Button btnCalcular, btnLimpar, btnFechar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_imcactivity);

        editaTextoPeso = findViewById(R.id.editaTextoPeso);
        editaTextoAltura = findViewById(R.id.editaTextoAltura);
        btnCalcular = findViewById(R.id.btn1tela2);
        btnLimpar = findViewById(R.id.btn2tela2);
        btnFechar = findViewById(R.id.btn3tela2);

        // Botão Calcular
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double peso = Double.parseDouble(editaTextoPeso.getText().toString());
                    double altura = Double.parseDouble(editaTextoAltura.getText().toString());
                    double imc = peso / (altura * altura);

                    Intent intent;

                    if (imc < 18.5) {
                        intent = new Intent(CalculoIMCActivity.this, AbaixodoPesoActivity.class);
                    } else if (imc < 25) {
                        intent = new Intent(CalculoIMCActivity.this, PesoNormalActivity.class);
                    } else if (imc < 30) {
                        intent = new Intent(CalculoIMCActivity.this, SobrepesoActivity.class);
                    } else if (imc < 35) {
                        intent = new Intent(CalculoIMCActivity.this, ObesidadeGrau1Activity.class);
                    } else if (imc < 40) {
                        intent = new Intent(CalculoIMCActivity.this, ObesidadeGrau2Activity.class);
                    } else {
                        intent = new Intent(CalculoIMCActivity.this, ObesidadeGrau3Activity.class);
                    }

                    // Enviando dados para a próxima Activity
                    intent.putExtra("valor_imc", imc);
                    intent.putExtra("peso", peso);
                    intent.putExtra("altura", altura);

                    startActivity(intent);

                } catch (NumberFormatException e) {
                    Toast.makeText(CalculoIMCActivity.this, "Digite valores válidos!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Botão Limpar
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editaTextoPeso.setText("");
                editaTextoAltura.setText("");
            }
        });

        // Botão Fechar
        btnFechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish(); // Fecha a tela atual e volta para a anterior
            }
        });
    }
}

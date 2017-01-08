package com.example.jesse.aplicativoq;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final float[] climc = new float[1];
        Button botaoCalcular = (Button) findViewById(R.id.botaoCalcular);
        botaoCalcular.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView editPeso = (TextView) findViewById(R.id.editPeso);
                TextView editAltura = (TextView) findViewById(R.id.editAltura);
                TextView textViewResultado = (TextView) findViewById(R.id.textViewResultado);
                TextView textViewDescricao = (TextView) findViewById(R.id.textViewDescricao);
                float peso = Float.parseFloat(editPeso.getText().toString());
                float altura = Float.parseFloat(editAltura.getText().toString());
                climc[0] = peso / (altura*altura);
                if (climc[0]<18.5){
                    textViewResultado.setText("IMC: "+Math.round(climc[0]));
                    textViewDescricao.setText("Baixo Peso!");
                }
                else{
                    if (climc[0]<25){
                        textViewResultado.setText("IMC: "+Math.round(climc[0]));
                        textViewDescricao.setText("Peso Ideal!");
                    }
                    else{
                        if (climc[0]<30){
                            textViewResultado.setText("IMC: "+Math.round(climc[0]));
                            textViewDescricao.setText("Sobrepeso!");
                        }
                        else{
                            textViewResultado.setText("IMC: "+Math.round(climc[0]));
                            textViewDescricao.setText("Obesidade!");
                            }


                        }

                    }

            }
        });
    }
}


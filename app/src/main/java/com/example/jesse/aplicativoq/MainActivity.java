package com.example.jesse.aplicativoq;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText EditPeso;
    EditText EditAltura;

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IniciaSplash();

        final float[] climc = new float[1];

        Button botaoCalcular = (Button) findViewById(R.id.botaoCalcular);
        botaoCalcular.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                EditPeso = (EditText) findViewById(R.id.EditPeso);
                EditAltura = (EditText) findViewById(R.id.EditAltura);
                TextView textViewResultado = (TextView) findViewById(R.id.textViewResultado);
                final TextView textViewDescricao = (TextView) findViewById(R.id.textViewDescricao);
                float peso = Float.parseFloat(EditPeso.getText().toString());
                float altura = Float.parseFloat(EditAltura.getText().toString());
                climc[0] = peso / (altura * altura);

                EditPeso.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    public void onFocusChange(View v, boolean hasFocus) {
                        if (EditPeso.getText().length() == 0) {
                            textViewDescricao.setError("Campo Obrigatório!");
                        }
                    }
                });
                EditAltura.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    public void onFocusChange(View v, boolean hasFocus) {
                        if (EditAltura.getText().length() == 0) {
                            textViewDescricao.setError("Campo Obrigatório!");
                        }
                    }
                });



                if (climc[0] < 18.5) {
                    textViewResultado.setText("IMC: " + Math.round(climc[0]));
                    textViewDescricao.setText("Baixo Peso!");
                } else {
                    if (climc[0] < 25) {
                        textViewResultado.setText("IMC: " + Math.round(climc[0]));
                        textViewDescricao.setText("Peso Ideal!");
                    } else {
                        if (climc[0] < 30) {
                            textViewResultado.setText("IMC: " + Math.round(climc[0]));
                            textViewDescricao.setText("Sobrepeso!");
                        } else {
                            textViewResultado.setText("IMC: " + Math.round(climc[0]));
                            textViewDescricao.setText("Obesidade!");
                        }


                    }


                }


            }

        });

    }
    private void IniciaSplash() {
        setContentView(R.layout.activity_main);

        new Thread(new Runnable() {
            @Override
            public void run() {

                counter ++;
                try{
                    while (counter==1||counter<=2){
                        Thread.sleep(1000);
                        counter++;

                        Log.e("Counter =",Integer.toString(counter));
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                if (counter==20){
                    Intent it = new Intent(MainActivity.this,Menu.class);
                    startActivity(it);

                    counter++;

                    Log.e("Counter =",Integer.toString(counter));
                }
            }
        }).start();
    }
}










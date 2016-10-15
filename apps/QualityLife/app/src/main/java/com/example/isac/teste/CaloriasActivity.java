package com.example.isac.teste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CaloriasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorias);

        Button frutas = (Button)findViewById(R.id.frutas);
        Button graos = (Button)findViewById(R.id.graos);
        Button legum = (Button)findViewById(R.id.legum);
        Button massas = (Button)findViewById(R.id.massas);
        Button carnes = (Button)findViewById(R.id.carnes);
        Button voltar = (Button)findViewById(R.id.voltar);

        frutas.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela = new Intent(CaloriasActivity.this,AlimentosActivity.class);
                startActivity(tela);
            }
        });

        graos.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela = new Intent(CaloriasActivity.this,AlimentosActivity.class);
                startActivity(tela);
            }
        });

        legum.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela = new Intent(CaloriasActivity.this,AlimentosActivity.class);
                startActivity(tela);
            }
        });

        massas.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela = new Intent(CaloriasActivity.this,AlimentosActivity.class);
                startActivity(tela);
            }
        });

        carnes.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela = new Intent(CaloriasActivity.this,AlimentosActivity.class);
                startActivity(tela);
            }
        });

        voltar.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

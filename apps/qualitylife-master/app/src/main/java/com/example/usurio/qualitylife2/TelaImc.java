package com.example.usurio.qualitylife2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TelaImc extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_imc);
    }

    public void calcular(View view) {
        Intent it = new Intent(TelaImc.this, ImcResultado.class);
        startActivity(it);
    }
    public void fechar(View view) {
        finish();
    }
}

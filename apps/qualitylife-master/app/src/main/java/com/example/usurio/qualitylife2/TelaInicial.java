package com.example.usurio.qualitylife2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.R.id.closeButton;
import static com.example.usurio.qualitylife2.R.id.activity_tela_imc;
import static com.example.usurio.qualitylife2.R.id.activity_tela_inicial;

public class TelaInicial extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);
    }
    public void imc(View view){
        Intent it = new Intent(TelaInicial.this, TelaImc.class);
        startActivity(it);
    }
    public void calorias(View view){
        Intent it = new Intent(TelaInicial.this, TelaCalorias.class);
        startActivity(it);
    }
    public void fechar(View view) {
        finish();
    }
}


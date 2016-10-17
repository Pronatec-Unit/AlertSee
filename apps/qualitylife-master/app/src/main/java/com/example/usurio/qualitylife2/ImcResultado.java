package com.example.usurio.qualitylife2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ImcResultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc_resultado);
    }
    public void fechar(View view) {
        finish();
    }
}

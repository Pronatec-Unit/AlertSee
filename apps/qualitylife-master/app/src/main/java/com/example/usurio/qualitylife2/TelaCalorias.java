package com.example.usurio.qualitylife2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TelaCalorias extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_calorias);
    }
    public void fechar(View view) {
        finish();
    }
}

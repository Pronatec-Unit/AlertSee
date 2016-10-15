package com.example.isac.teste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button imc = (Button)findViewById(R.id.imc);
        Button calorias = (Button)findViewById(R.id.calorias);
        Button sair = (Button)findViewById(R.id.sair);

        imc.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela = new Intent(MainActivity.this,ImcActivity.class);
                startActivity(tela);
            }
        });

        calorias.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela = new Intent(MainActivity.this,CaloriasActivity.class);
                startActivity(tela);
            }
        });

        sair.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

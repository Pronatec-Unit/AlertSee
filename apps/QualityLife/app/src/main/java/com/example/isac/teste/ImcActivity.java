package com.example.isac.teste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ImcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        Button calcular = (Button)findViewById(R.id.calcular);
        Button voltar = (Button)findViewById(R.id.voltar);

        calcular.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela = new Intent(ImcActivity.this,ResultActivity.class);
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

package es.esy.wilddcost.aplicativoq;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText EditPeso;
    EditText EditAltura;
    InputMethodManager imm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditPeso = (EditText) findViewById(R.id.EditPeso);
        EditAltura = (EditText) findViewById(R.id.EditAltura);
        Button botaoCalcular = (Button) findViewById(R.id.botaoCalcular);
        imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);

        final float[] climc = new float[1];

        botaoCalcular.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                String v1 = EditPeso.getText().toString();
                String v2 = EditAltura.getText().toString();

                if(v1.trim().isEmpty() || v2.trim().isEmpty()){
                    AlertDialog.Builder dlg = new AlertDialog.Builder(v.getContext());
                    dlg.setMessage("Há campos vazios!");
                    dlg.setNeutralButton("Ok",null);
                    dlg.show();

                }else{

                    TextView textViewResultado = (TextView) findViewById(R.id.textViewResultado);
                    final TextView textViewDescricao = (TextView) findViewById(R.id.textViewDescricao);
                    float peso = Float.parseFloat(EditPeso.getText().toString());
                    float altura = Float.parseFloat(EditAltura.getText().toString());
                    climc[0] = peso / (altura * altura);

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
            }

        });

    }

    public void sair(View view){
        this.finish();
    }
}










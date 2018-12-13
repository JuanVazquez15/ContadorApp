package com.juanvazquez.android.contadorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText campoConteo;
    private Button botonContar;
    private Button botonReiniciar;

    private int contadorManual = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoConteo = (EditText) findViewById(R.id.campo_conteo);
        botonContar = (Button) findViewById(R.id.boton_contar);
        botonReiniciar = (Button) findViewById(R.id.boton_reiniciar);

        botonContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorManual++;
                campoConteo.setText(contadorManual + ""); //Se visualiza el resultado
            }
        });

        botonReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorManual = 0;
                campoConteo.setText(contadorManual + ""); //Se visualiza el resultado
            }
        });
    }
}

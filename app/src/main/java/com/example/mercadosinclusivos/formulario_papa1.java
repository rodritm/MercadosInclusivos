package com.example.mercadosinclusivos;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class formulario_papa1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_papa1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button continuar = (Button) findViewById(R.id.formpapa1_botonContinuar);
        continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(formulario_papa1.this, formulario_papa2.class); //aqui se debe definir a que formulario se va a redirigir
                startActivity(i);

            }
        });

        Button cancelar= (Button) findViewById(R.id.formpapa1_botonCancelar);
        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(formulario_papa1.this, Pantalla_Inicial.class); //aqui se debe definir a que formulario se va a redirigir
                startActivity(i);

            }
        });

    }

}

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

public class Pantalla_Inicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla__inicial);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton editar = (ImageButton) findViewById(R.id.ini_editar);
        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pantalla_Inicial.this, Registro.class);
                startActivity(i);

            }
        });
        ImageButton formulario = (ImageButton) findViewById(R.id.ini_formulario);
        formulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pantalla_Inicial.this, formulario_papa1.class); //aqui se debe definir a que formulario se va a redirigir
                startActivity(i);

            }
        });

//        pantalla de ayuda
//        ImageButton registrarse = (ImageButton) findViewById(R.id.ini_ayuda);
//        registrarse.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(Pantalla_Inicial.this, ayuda.class);
//                startActivity(i);
//
//            }
//        });

        ImageButton registrarse = (ImageButton) findViewById(R.id.ini_salir);
        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pantalla_Inicial.this, MainActivity.class);
                startActivity(i);

            }
        });
    }



//    ini_formulario

}

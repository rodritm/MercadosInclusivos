package com.example.mercadosinclusivos;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class formulario_papa2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_papa2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE); //mostrar la pantalla de forma horizontal

        Button guardar= (Button) findViewById(R.id.formpapa2_botonGuardar);
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "Datos guardados con éxito", Toast.LENGTH_SHORT);
                toast1.show();
                Intent i = new Intent(formulario_papa2.this, Pantalla_Inicial.class);
                startActivity(i);

            }
        });

        Button cancelar= (Button) findViewById(R.id.formpapa2_botonCancelar);
        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(formulario_papa2.this, Pantalla_Inicial.class);
                startActivity(i);

            }
        });
    }

}

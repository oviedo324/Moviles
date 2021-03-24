package com.example.texto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {


    TextView nombre;
    TextView genero;
    TextView carrera;
    TextView profesion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        profesion =  findViewById( R.id.profesion );
        carrera =  findViewById( R.id.carrera );
        genero =  findViewById( R.id.genero );
        nombre =  findViewById( R.id.nombre );

        nombre.setText("Nombre : " + getIntent().getStringExtra( "nombre" ));
        profesion.setText("Profesion : " + getIntent().getStringExtra( "profesion" ));
        genero.setText("Genero : " + getIntent().getStringExtra( "genero" ));
        carrera.setText("Carrera : " + getIntent().getStringExtra( "carrera" ));

    }
}

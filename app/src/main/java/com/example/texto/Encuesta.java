package com.example.texto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Encuesta extends AppCompatActivity {

    String nombreEncuesta;
    TextView nombre;
    RadioButton hombre;
    RadioButton mujer;
    RadioButton estudiante;
    RadioButton profesor;
    RadioButton sistemas;
    RadioButton electronica;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
        nombreEncuesta = getIntent().getStringExtra( "nombre" );
        nombre = findViewById( R.id.nombre );
        nombre.setText( "Nombre del encuestado : " + nombreEncuesta );
        hombre = findViewById( R.id.hombre );
        mujer = findViewById( R.id.mujer );
        estudiante = findViewById( R.id.profesor );
        profesor = findViewById( R.id.profesor );
        sistemas = findViewById( R.id.sistemas );
        electronica = findViewById( R.id.electronica );
    }


    public void enviar( View view ){

        String genero;
        String profesion;
        String carrera;

        if( mujer.isChecked() ){
            genero = "Femenino";
        }else{
            genero = "Masculino";
        }

        if( estudiante.isChecked() ){
            profesion = "Estudiante";
        }else{
            profesion = "Profesor";
        }

        if( sistemas.isChecked() ){
            carrera = "Sistemas";
        }else{
            carrera = "Electronica";
        }

        Intent intent =  new Intent( this, Resultado.class );
        intent.putExtra( "genero", genero );
        intent.putExtra( "profesion", profesion );
        intent.putExtra( "carrera", carrera );
        intent.putExtra( "nombre", nombreEncuesta );
        startActivity(intent);

    }

}

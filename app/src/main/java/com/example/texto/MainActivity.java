package com.example.texto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText textNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textNombre = findViewById( R.id.nombre );
    }


    public void conitnuar(View view ){

        if(!textNombre.getText().toString().isEmpty()){

            Intent intent =  new Intent( this, Encuesta.class );
            intent.putExtra( "nombre", textNombre.getText().toString() );
            startActivity(intent);

        }else{



        }

    }

    @Override
    public void onBackPressed() {

    }
}

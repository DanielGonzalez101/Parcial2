package com.example.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtUsuario, edtConstrasena;

    Button btnIniciarSesion;


    public void iniciarSesion(View view){
        EditText edtUsuario = findViewById(R.id.edtUsuario);
        EditText edtConstrasena= findViewById(R.id.edtContrasena);

        if (edtUsuario.getText().toString().isEmpty() || edtConstrasena.getText().toString().isEmpty()) {
            Toast.makeText(this, "Porfavor llenar los campos", Toast.LENGTH_SHORT).show();
        } else if (edtUsuario.getText().toString().equals("uac123") || edtConstrasena.getText().toString().equals("12345678")) {
            // Aqui va la funcion para ir a la otra pantalla
            Intent validado = new Intent(this, Recycle.class);
            startActivity(validado);
        }else {
            Toast.makeText(this, "Datos incorrectos", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
package com.example.parcial2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.parcial2.Adapatadores.UsuarioAdaptador;
import com.example.parcial2.clases.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Recycle extends AppCompatActivity {

    RecyclerView rcv_usuarios;
    List<Usuario> listaUsuarios = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);


        rcv_usuarios = findViewById(R.id.rcv_usuarios);

        Usuario usu1 = new Usuario("Rick", "vivo" , "Humano", "https://rickandmortyapi.com/api/character/avatar/72.jpeg");
        listaUsuarios.add(usu1);

        rcv_usuarios.setLayoutManager(new LinearLayoutManager(this));
        rcv_usuarios.setAdapter(new UsuarioAdaptador(listaUsuarios));
    }
}
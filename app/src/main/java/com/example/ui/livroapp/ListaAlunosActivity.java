package com.example.ui.livroapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.livroapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_aluno);

        //Iniciando uma lista
        List<String> alunos = new ArrayList<>(Arrays.asList("Jonas", "José", "Maria", "Ana Alice"));
        //Linkando a Lista criada no Layout
        ListView listaAlunos = findViewById(R.id.lstAlunos);
        // criando o Adapter para jogar os alunos na lista
        listaAlunos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunos));

        FloatingActionButton adcAlunos = findViewById(R.id.floatAdcAluno);

        adcAlunos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent formulario = new Intent(ListaAlunosActivity.this, FormularioAluno.class);
                startActivity(formulario);
            }
        });


    }
}
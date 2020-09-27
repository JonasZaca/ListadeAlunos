package com.example.ui.livroapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dao.AlunoDAO;
import com.example.livroapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ListaAlunosActivity extends AppCompatActivity {

    private FloatingActionButton adcAlunos;
    private final AlunoDAO dao = new AlunoDAO();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_aluno);

        adcAlunos = findViewById(R.id.floatAdcAluno);

        configuraFABNovoAluno(adcAlunos);
    }

    private void configuraFABNovoAluno(FloatingActionButton adcAlunos) {
        adcAlunos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abreFormularioAluno();
            }
        });
    }

    private void abreFormularioAluno() {
        startActivity(new Intent(this, FormularioAluno.class));
    }

    @Override
    protected void onResume() {
        super.onResume();
        configuraLista();
    }

    private void configuraLista() {
        //Linkando a Lista criada no Layout
        ListView listaAlunos = findViewById(R.id.lstAlunos);
        // criando o Adapter para inserir os alunos na lista
        listaAlunos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dao.todos()));
    }
}
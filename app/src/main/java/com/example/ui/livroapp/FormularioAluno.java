package com.example.ui.livroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.dao.AlunoDAO;
import com.example.livroapp.R;
import com.example.model.Aluno;

public class FormularioAluno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);

        final AlunoDAO dao = new AlunoDAO();

        final EditText emailAlno = findViewById(R.id.edtEmail);
        final EditText nomeAluno = findViewById(R.id.edtNome);
        final EditText telefoneAluno = findViewById(R.id.edtTelefone);
        Button   butonEnvia = findViewById(R.id.btnEnvia);

        butonEnvia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome     = nomeAluno.getText().toString();
                String email    = emailAlno.getText().toString();
                String telefone = telefoneAluno.getText().toString();

                Aluno alunoCriado = new Aluno(nome, telefone, email);
                dao.salva(alunoCriado);

                startActivity(new Intent(FormularioAluno.this, ListaAlunosActivity.class));
            }
        });


    }
}
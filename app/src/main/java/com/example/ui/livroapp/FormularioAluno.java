package com.example.ui.livroapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dao.AlunoDAO;
import com.example.livroapp.R;
import com.example.model.Aluno;

public class FormularioAluno extends AppCompatActivity {

    private EditText emailAlno;
    private EditText telefoneAluno;
    private EditText nomeAluno;
    private Button butonEnvia;
    final AlunoDAO dao = new AlunoDAO();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);

        inicializacaoDosCampos();
        configuraBotaoSalvar();
    }

    private void configuraBotaoSalvar() {
        butonEnvia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Aluno alunoCriado = criaAluno();
                salva(alunoCriado);
            }
        });
    }

    private void inicializacaoDosCampos() {
        emailAlno = findViewById(R.id.edtEmail);
        nomeAluno = findViewById(R.id.edtNome);
        telefoneAluno = findViewById(R.id.edtTelefone);
        butonEnvia = findViewById(R.id.btnEnvia);
    }

    private void salva(Aluno alunoCriado) {
        dao.salva(alunoCriado);
        finish();
    }

    private Aluno criaAluno() {
        String nome = nomeAluno.getText().toString();
        String email = emailAlno.getText().toString();
        String telefone = telefoneAluno.getText().toString();

        return new Aluno(nome, telefone, email);
    }
}
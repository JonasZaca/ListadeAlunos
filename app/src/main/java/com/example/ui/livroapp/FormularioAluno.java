package com.example.ui.livroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.livroapp.R;

public class FormularioAluno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);

        EditText emailAlno = findViewById(R.id.edtEmail);
        EditText nomeAluno = findViewById(R.id.edtNome);
        EditText telefoneAluno = findViewById(R.id.edtTelefone);
        Button   butonEnvia = findViewById(R.id.btnEnvia);

        butonEnvia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FormularioAluno.this, "Cliquei aqui  no buton save", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
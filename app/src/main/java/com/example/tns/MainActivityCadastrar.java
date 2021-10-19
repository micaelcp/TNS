package com.example.tns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityCadastrar extends AppCompatActivity {

    EditText edtNomeNovoU, edtEmailNovoU, edtSenhaNovoU, edtConfirmarSenha;
    Button btnCadastrarNovoU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cadastrar);

        edtNomeNovoU = (EditText) findViewById(R.id.txtNomeNovoU);
        edtEmailNovoU = (EditText) findViewById(R.id.txtEmailNovoU);
        edtSenhaNovoU = (EditText) findViewById(R.id.txtSenhaNovoU);
        edtConfirmarSenha = (EditText) findViewById(R.id.txtConfirmarSenha);
        btnCadastrarNovoU = (Button) findViewById(R.id.btnCadastrarNovoU);

        btnCadastrarNovoU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityCadastrar.this, MainActivity.class);
                Usuario usuario = new Usuario();
                usuario.setNomeUsuario(edtNomeNovoU.getText().toString());
                usuario.setEmialUsuario(edtEmailNovoU.getText().toString());
                usuario.setSenha(edtSenhaNovoU.getInputType());
                usuario.setConfirmarSenha(edtConfirmarSenha.getInputType());
                startActivity(intent);
            }
        });
    }
}
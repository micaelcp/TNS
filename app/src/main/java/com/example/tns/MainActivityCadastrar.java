package com.example.tns;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
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
                Intent intent = new Intent(MainActivityCadastrar.this, ActivityVitrine.class);
                Usuario usuario = new Usuario();
                usuario.setNomeUsuario(edtNomeNovoU.getText().toString());
                usuario.setEmialUsuario(edtEmailNovoU.getText().toString());
                usuario.setSenha(edtSenhaNovoU.getInputType());
                usuario.setConfirmarSenha(edtConfirmarSenha.getInputType());
                validaCampos();
            }
        });
    }
    private void validaCampos(){

        boolean res = false;

        String nome = edtNomeNovoU.getText().toString();
        String email = edtEmailNovoU.getText().toString();
        String senha = edtSenhaNovoU.getText().toString();
        String confirmarSenha = edtConfirmarSenha.getText().toString();

        if (res = isCampoVazio(nome)){
            edtNomeNovoU.requestFocus();
        }
        else if (res = isCampoVazio(email)){
            edtEmailNovoU.requestFocus();
        }
        else if (res = isCampoVazio(senha)){
            edtSenhaNovoU.requestFocus();
        }
        else if (res = isCampoVazio(confirmarSenha)){
            edtConfirmarSenha.requestFocus();
        }

        if (res){
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setTitle("Aviso");
            dlg.setMessage("Há campos inválidos ou em branco");
            dlg.setNeutralButton("Ok", null);
            dlg.show();
        }
    }

    private boolean isCampoVazio(String valor){
        boolean resultado = (TextUtils.isEmpty(valor) || valor.trim().isEmpty());
        return resultado;
    }

    private boolean isEmailValido(String email){
        boolean resultado = (!isCampoVazio(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
        return resultado;
    }
}
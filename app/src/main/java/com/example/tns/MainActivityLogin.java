package com.example.tns;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityLogin extends AppCompatActivity {

    EditText edtEmailLogin, edtSenhaLogin;
    Button btnLogin, btnAdm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        edtEmailLogin = (EditText) findViewById(R.id.txtEmailLogin);
        edtSenhaLogin = (EditText) findViewById(R.id.txtSenhaLogin);
        btnLogin = (Button) findViewById(R.id.btnLoginL);
        btnAdm = (Button) findViewById(R.id.btnAdministrador);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityLogin.this, ActivityVitrine.class);
                Usuario usuario = new Usuario();
                usuario.setNomeUsuario(edtEmailLogin.getText().toString());
                usuario.setSenha(edtSenhaLogin.getInputType());
                //intent.putExtra("objetoAutenticacao", usuario);
                startActivity(intent);
                validaCampos();
            }
        });

        btnAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityLogin.this, ActivityAdmPage.class);
                startActivity(intent);
            }
        });
    }

    private void validaCampos(){

        boolean res = false;

        String email = edtEmailLogin.getText().toString();
        String senha = edtSenhaLogin.getText().toString();

        if (res = isCampoVazio(email)){
            edtEmailLogin.requestFocus();
        }
        else if (res = isCampoVazio(senha)){
            edtSenhaLogin.requestFocus();
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
}
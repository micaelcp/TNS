package com.example.tns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
}
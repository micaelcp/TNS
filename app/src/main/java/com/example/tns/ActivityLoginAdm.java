package com.example.tns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityLoginAdm extends AppCompatActivity {

    EditText edtEmailLogin, edtSenhaLogin;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_adm);

        edtEmailLogin = (EditText) findViewById(R.id.txtEmailLogin);
        edtSenhaLogin = (EditText) findViewById(R.id.txtSenhaLogin);
        btnLogin = (Button) findViewById(R.id.btnLoginL);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityLoginAdm.this, ActivityAdmPage.class);
                Usuario usuario = new Usuario();
                usuario.setNomeUsuario(edtEmailLogin.getText().toString());
                usuario.setSenha(edtSenhaLogin.getInputType());
                //intent.putExtra("objetoAutenticacao", usuario);
                startActivity(intent);
            }
        });
    }
}
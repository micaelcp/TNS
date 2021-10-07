package com.example.tns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityLogin extends AppCompatActivity {

    EditText edtEmail, edtSenha;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        edtEmail = (EditText) findViewById(R.id.txtEmail);
        edtSenha = (EditText) findViewById(R.id.txtSenha);
        btnLogin = (Button) findViewById(R.id.btnLoginL);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityLogin.this, MainActivity.class);
                Usuario usuario = new Usuario();
                usuario.setNome(edtEmail.getText().toString());
                usuario.setSenha(edtSenha.getText().toString());
                //intent.putExtra("objetoAutenticacao", usuario);
                startActivity(intent);
            }
        });
    }
}
package com.example.tns.CRUDP;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.tns.R;

public class ActivityPesquisarProduto extends AppCompatActivity {

    EditText edtNome;
    Button btnPesquisarP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesquisar_produto);

        edtNome = (EditText) findViewById(R.id.txtNomeProduto);
        btnPesquisarP = (Button) findViewById(R.id.cmdPesquisarProduto);

        btnPesquisarP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
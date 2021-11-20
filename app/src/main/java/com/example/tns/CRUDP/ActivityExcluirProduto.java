package com.example.tns.CRUDP;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.tns.R;

public class ActivityExcluirProduto extends AppCompatActivity {

    EditText edtNome, edtCodigo, edtCategoria;
    Button btnExcluirP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excluir_produto);

        edtNome = (EditText) findViewById(R.id.txtNomeProduto);
        edtCodigo = (EditText) findViewById(R.id.txtCodigoProduto);
        edtCategoria = (EditText) findViewById(R.id.txtCategoriaProduto);
        btnExcluirP = (Button) findViewById(R.id.cmdPesquisarProduto);

        btnExcluirP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
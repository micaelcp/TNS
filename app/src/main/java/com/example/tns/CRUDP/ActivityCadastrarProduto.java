package com.example.tns.CRUDP;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.tns.R;

public class ActivityCadastrarProduto extends AppCompatActivity {

    EditText edtNome, edtCodigo, edtPreco, edtDescricao, edtCategoria;
    Button btnCadastrarP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_produto);

        edtNome = (EditText) findViewById(R.id.txtNomeProduto);
        edtCodigo = (EditText) findViewById(R.id.txtCodigoProduto);
        edtPreco = (EditText) findViewById(R.id.txtPrecoProduto);
        edtDescricao = (EditText) findViewById(R.id.txtDescricaoProduto);
        edtCategoria = (EditText) findViewById(R.id.txtCategoriaProduto);
        btnCadastrarP = (Button) findViewById(R.id.cmdPesquisarProduto);

    }
}
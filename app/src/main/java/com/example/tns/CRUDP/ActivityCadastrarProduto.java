package com.example.tns.CRUDP;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
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

        btnCadastrarP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validaCampos();
            }
        });
    }

    private void validaCampos(){

        boolean res = false;

        String nome = edtNome.getText().toString();
        String codigo = edtCodigo.getText().toString();
        String preco = edtPreco.getText().toString();
        String descricao = edtDescricao.getText().toString();
        String categoria = edtCategoria.getText().toString();

        if (res = isCampoVazio(nome)){
            edtNome.requestFocus();
        }
        else if (res = isCampoVazio(codigo)){
            edtCodigo.requestFocus();
        }
        else if (res = isCampoVazio(preco)){
            edtDescricao.requestFocus();
        }
        else if (res = isCampoVazio(descricao)){
            edtDescricao.requestFocus();
        }
        else if (res = isCampoVazio(categoria)){
            edtCategoria.requestFocus();
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
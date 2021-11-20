package com.example.tns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tns.CRUDP.ActivityAtualizarProduto;
import com.example.tns.CRUDP.ActivityCadastrarProduto;
import com.example.tns.CRUDP.ActivityExcluirProduto;
import com.example.tns.CRUDP.ActivityPesquisarProduto;

public class ActivityAdmPage extends AppCompatActivity {

    Button btnAdmCadastrarP, btnAdmAtualizarP, btnAdmExcluirP, btnAdmPesquisarP, btnAdmVitrine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adm_page);

        btnAdmCadastrarP = (Button) findViewById(R.id.cmdAdmCadastrarProduto);
        btnAdmAtualizarP = (Button) findViewById(R.id.cmdAdmAtualizarProduto);
        btnAdmExcluirP = (Button) findViewById(R.id.cmdAdmExcluirProduto);
        btnAdmPesquisarP = (Button) findViewById(R.id.cmdAdmPesquisarProduto);
        btnAdmVitrine = (Button) findViewById(R.id.cmdAdmVitirne);

        btnAdmCadastrarP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityAdmPage.this, ActivityCadastrarProduto.class);
                startActivity(intent);
            }
        });

        btnAdmAtualizarP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityAdmPage.this, ActivityAtualizarProduto.class);
                startActivity(intent);
            }
        });

        btnAdmExcluirP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityAdmPage.this, ActivityExcluirProduto.class);
                startActivity(intent);
            }
        });

        btnAdmPesquisarP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityAdmPage.this, ActivityPesquisarProduto.class);
                startActivity(intent);
            }
        });

        btnAdmVitrine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityAdmPage.this, ActivityVitrine.class);
                startActivity(intent);
            }
        });
    }
}
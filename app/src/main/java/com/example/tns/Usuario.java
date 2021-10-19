package com.example.tns;

import java.io.Serializable;

public class Usuario implements Serializable {

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmialUsuario() {
        return emialUsuario;
    }

    public void setEmialUsuario(String emialUsuario) {
        this.emialUsuario = emialUsuario;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    public Integer getConfirmarSenha() {
        return confirmarSenha;
    }

    public void setConfirmarSenha(Integer confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }

    private String nomeUsuario;
    private String emialUsuario;
    private Integer senha;
    private Integer confirmarSenha;



    public Usuario(){

    }


}

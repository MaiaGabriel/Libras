package com.example.signum;

import java.io.Serializable;

public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nome,email, senha,nescolaridade,nalfabetizacaolibras;
    private int tipo;
    public Usuario(String nome, String email, String senha, String nescolaridade,String nalfabetizacaolibras) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.nescolaridade = nescolaridade;
        this.nalfabetizacaolibras = nalfabetizacaolibras;
    }
    // getters e setters ...

    public String getName()
    {
        return nome;
    }

    public String getEmail()
    {
        return email;
    }

    public String getSenha()
    {
        return senha;
    }

    public String getNEscolaridade()
    {
        return nescolaridade;
    }


    public String getNAlfabetizacaolibras()
    {
        return nalfabetizacaolibras;
    }



}

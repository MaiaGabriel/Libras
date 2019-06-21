package com.example.signum.Model;

public class Users  {
    private String nome,email, senha,nescolaridade,nalfabetizacaolibras;

    public Users(){}

    public Users(String nome, String email, String senha, String nescolaridade,String nalfabetizacaolibras) {
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

    public void setName(String nome)
    {
        this.nome = nome;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getSenha()
    {
        return senha;
    }

    public void setSenha(String senha)
    {
        this.senha = senha;
    }

    public String getNEscolaridade()
    {
        return nescolaridade;
    }

    public void setNescolaridade(String nescolaridade)
    {
        this.nescolaridade = nescolaridade;
    }


    public String getNAlfabetizacaolibras()
    {
        return nalfabetizacaolibras;
    }

    public void setNalfabetizacaolibras(String nalfabetizacaolibras)
    {
        this.nalfabetizacaolibras = nalfabetizacaolibras;
    }
}

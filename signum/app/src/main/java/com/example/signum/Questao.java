package com.example.signum;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class Questao implements Parcelable {

    private String descricao;
    private String alternativas;
    private int urlImagem;

    public  Questao(String descricao, String alternativas, int urlImagem)
    {
        this.descricao = descricao;
        this.alternativas = alternativas;
        this.urlImagem = urlImagem;
    }

    protected Questao(Parcel p) {
        descricao = p.readString();
        alternativas = p.readString();
        urlImagem = p.readInt();
    }

    public static final Creator<Questao> CREATOR = new Creator<Questao>() {
        @Override
        public Questao createFromParcel(Parcel p) {
            return new Questao(p);
        }

        @Override
        public Questao[] newArray(int size) {
            return new Questao[size];
        }
    };

    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public String getAlternativas()
    {
        return alternativas;
    }

    public void setAlternativas(String alternativas){ this.alternativas = alternativas;}

    public int getUrlImagem()
    {
        return urlImagem;
    }

    public void setUrlImagem(int urlImagem){ this.urlImagem = urlImagem; }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(descricao);
        parcel.writeString(alternativas);
        parcel.writeInt(urlImagem);
    }
}

package com.example.signum;

import android.os.Parcel;
import android.os.Parcelable;

public class Resumo implements Parcelable {
    private String imagem;
    private String texto;
    private String titulo;

    public Resumo (String imagem, String texto, String titulo) {
        this.texto = texto;
        this.imagem = imagem;
        this.titulo = titulo;
    }

    protected Resumo (Parcel p){
        this.imagem = p.readString();
        this.texto = p.readString();
        this.titulo = p.readString();
    }

    public static final Creator<Resumo> CREATOR = new Creator<Resumo>() {
        @Override
        public Resumo createFromParcel(Parcel p) {
            return new Resumo(p);
        }

        @Override
        public Resumo[] newArray(int size) {
            return new Resumo[size];
        }
    };

    @Override
    public int describeContents() {return 0;}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(this.imagem);
        parcel.writeString(this.texto);
        parcel.writeString(this.titulo);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}

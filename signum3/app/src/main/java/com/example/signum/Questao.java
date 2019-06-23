package com.example.signum;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class Questao implements Parcelable {

    private String descricao;
    private String alternativa1;
    private String alternativa2;
    private String alternativa3;
    private String alternativa4;
    private String alternativaCorreta;
    private String urlVideo;

    public  Questao(String descricao, String alternativa1,String alternativa2,String alternativa3,String alternativa4,String alternativaCorreta , String urlVideo)
    {
        this.descricao = descricao;
        this.alternativa1 = alternativa1;
        this.alternativa2 = alternativa2;
        this.alternativa3 = alternativa3;
        this.alternativa4 = alternativa4;
        this.alternativaCorreta = alternativaCorreta;
        this.urlVideo = urlVideo;
    }

    protected Questao(Parcel p) {
        descricao = p.readString();
        alternativa1 = p.readString();
        alternativa2 = p.readString();
        alternativa3 = p.readString();
        alternativa4 = p.readString();
        alternativaCorreta = p.readString();
        urlVideo = p.readString();
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

    public String getAlternativa1()
    {
        return alternativa1;
    }

    public void setAlternativa1(String alternativa1){ this.alternativa1 = alternativa1;}


    public String getAlternativa2()
    {
        return alternativa2;
    }

    public void setAlternativa2(String alternativa2){ this.alternativa2 = alternativa2;}

    public String getAlternativa3()
    {
        return alternativa3;
    }

    public void setAlternativa3(String alternativa3){ this.alternativa3 = alternativa3;}

    public String getAlternativa4()
    {
        return alternativa4;
    }

    public void setAlternativa4(String alternativa4){ this.alternativa4 = alternativa4;}

    public String getAlternativaCorreta() { return alternativaCorreta; }

    public void setAlternativaCorreta(String alternativaCorreta) {this.alternativaCorreta = alternativaCorreta;}

    public String getUrlVideo()
    {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo){ this.urlVideo = urlVideo; }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(descricao);
        parcel.writeString(alternativa1);
        parcel.writeString(alternativa2);
        parcel.writeString(alternativa3);
        parcel.writeString(alternativa4);
        parcel.writeString(alternativaCorreta);
        parcel.writeString(urlVideo);
    }
}

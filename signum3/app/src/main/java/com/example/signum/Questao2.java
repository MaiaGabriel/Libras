package com.example.signum;

import android.os.Parcel;
import android.os.Parcelable;

public class Questao2 implements Parcelable {
    private String descricao;
    private String alternativa1;
    private String alternativa2;
    private String alternativa3;
    private String alternativa4;
    private String urlVideo;
    private String urlVideo2;
    private String urlVideo3;
    private String urlVideo4;

    public  Questao2(String descricao, String alternativa1,String alternativa2,String alternativa3,String alternativa4, String urlVideo,String urlVideo2,String urlVideo3,String urlVideo4)
    {
        this.descricao = descricao;
        this.alternativa1 = alternativa1;
        this.alternativa2 = alternativa2;
        this.alternativa3 = alternativa3;
        this.alternativa4 = alternativa4;
        this.urlVideo = urlVideo;
        this.urlVideo2 = urlVideo2;
        this.urlVideo3 = urlVideo3;
        this.urlVideo4 = urlVideo4;
    }

    protected Questao2(Parcel p) {
        descricao = p.readString();
        alternativa1 = p.readString();
        alternativa2 = p.readString();
        alternativa3 = p.readString();
        alternativa4 = p.readString();
        urlVideo = p.readString();
        urlVideo2 = p.readString();
        urlVideo3 = p.readString();
        urlVideo4 = p.readString();
    }


    public static final Creator<Questao2> CREATOR = new Creator<Questao2>() {
        @Override
        public Questao2 createFromParcel(Parcel p) {
            return new Questao2(p);
        }

        @Override
        public Questao2[] newArray(int size) {
            return new Questao2[size];
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


    public String getUrlVideo()
    {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo){ this.urlVideo = urlVideo; }

    public String getUrlVideo2()
    {
        return urlVideo2;
    }

    public void setUrlVideo2(String urlVideo2){ this.urlVideo2 = urlVideo2; }

    public String getUrlVideo3()
    {
        return urlVideo3;
    }

    public void setUrlVideo3(String urlVideo3){ this.urlVideo3 = urlVideo3; }

    public String getUrlVideo4()
    {
        return urlVideo4;
    }

    public void setUrlVideo4(String urlVideo4){ this.urlVideo4 = urlVideo4; }

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
        parcel.writeString(urlVideo);
        parcel.writeString(urlVideo2);
        parcel.writeString(urlVideo3);
        parcel.writeString(urlVideo4);
    }



}

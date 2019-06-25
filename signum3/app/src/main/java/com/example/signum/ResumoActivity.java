package com.example.signum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ResumoActivity extends AppCompatActivity {

    String imagem;
    String texto;
    String titulo;
    ImageView imagemView;
    TextView tituloView;
    TextView textoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo);

        Resumo resumo = getIntent().getExtras().getParcelable("Resumo");
        imagem = resumo.getImagem();
        titulo = resumo.getTitulo();
        texto = resumo.getTexto();

        Resources res = getResources();
        imagemView = (ImageView) findViewById(R.id.imagemResumo);
        tituloView = (TextView) findViewById(R.id.tituloResumo);
        textoView = (TextView) findViewById(R.id.textoResumo);
        int resID = res.getIdentifier(imagem , "drawable", getPackageName());
        imagemView.setImageResource(resID);
        textoView.setText(texto);
        tituloView.setText(titulo);

    }

    public void iniciarTeste(View view)
    {
        ArrayList<Questao> q = new ArrayList<Questao>();
        q = getIntent().getParcelableArrayListExtra("questoes");


        Intent intent4 = new Intent(view.getContext(), questao1conjuntos.class);
        intent4.putParcelableArrayListExtra("questoes",q);
        startActivity(intent4);
    }

}

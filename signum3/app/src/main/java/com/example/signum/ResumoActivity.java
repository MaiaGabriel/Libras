package com.example.signum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        imagemView = (ImageView) findViewById(R.id.imagemResumo);
        tituloView = (TextView) findViewById(R.id.tituloResumo);
        textoView = (TextView) findViewById(R.id.textoResumo);
        imagemView.setImageResource(R.drawable.imagem_conjunto_resumo);
        textoView.setText(texto);
        tituloView.setText(texto);

    }

    public void iniciarTeste(View view)
    {
        ArrayList<Questao> questaoArrayList = new ArrayList<Questao>();
        Questao questao1 = new Questao("Pergunta: qual a tradução da frase a seguir?","Um conjunto é uma coleção de números naturais","Um conjunto é uma coleção de números","Um conjunto é uma coleção de objetos","O número pertence ao conjunto dos naturais", "Um conjunto é uma coleção de objetos" ,"https://signum.s3-us-west-2.amazonaws.com/conjunto_dos_numeros_reais/Conjunto_ser_colecao_objeto_definicao.mp4"  );
        questaoArrayList.add(questao1);
        Questao questao2 = new Questao("Qual o significado do vídeo a seguir?","subtração","Conjunto irracional","Conjunto Natural","adição", "adição" , "https://signum.s3-us-west-2.amazonaws.com/conjunto_dos_numeros_reais/adicao1.mp4"  );
        questaoArrayList.add(questao2);
        Questao questao3 = new Questao("Que tipo de conjunto o vídeo es","subtração","Conjunto irracional","Conjunto Natural","adição", "adição" , "https://signum.s3-us-west-2.amazonaws.com/conjunto_dos_numeros_reais/adicao1.mp4"  );
        questaoArrayList.add(questao3);
        Questao questao4 = new Questao("Qual o significado do vídeo a seguir?","subtração","Conjunto irracional","Conjunto Natural","adição", "adição" , "https://signum.s3-us-west-2.amazonaws.com/conjunto_dos_numeros_reais/adicao1.mp4"  );
        questaoArrayList.add(questao4);



        Intent intent4 = new Intent(view.getContext(), questao1conjuntos.class);
        intent4.putParcelableArrayListExtra("questoes",questaoArrayList);
        startActivity(intent4);
    }

}

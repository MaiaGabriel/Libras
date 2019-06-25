package com.example.signum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class ListaTreinamento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_treinamento);

        final String[] video_str = {"Conjuntos", "funções", "funções trigonometricas", "funções exponenciais e logaritmicas"
                ,"funções compostas e inversas"};

        ListView listView = (ListView) findViewById(R.id.listatreinamento);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, video_str);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(i == 0)
                {
                    Resumo resumo = new Resumo("drawable-v24/imagem_conjunto_resumo.jpeg",
                            "Conjunto dos números naturais: É representado por todos os números positivos. Seu símbolo é o N maiúsculo.\n" +
                                    "Conjunto dos números inteiros: Esse conjunto é formado pelos elementos do conjunto dos números naturais e os números inteiros negativos. Ele é representado pela letra maiúscula Z.\n" +
                                    "Conjunto dos números racionais: É representado pela letra maiúscula Q. Pertencem a esse conjunto os números naturais, inteiros, decimais, fracionários e dízima periódica.\n" +
                                    "Conjunto dos números irracionais: Esse conjunto é formado pelos números que são dízimas não periódicas, ou seja, decimais infinitos que não possuem uma repetição de números após a vírgula. É representado pela letra maiúscula I.",
                            "Conjunto dos números");
                    Intent intent = new Intent(view.getContext(), ResumoActivity.class);
                    intent.putExtra("Resumo", resumo);
                    startActivity(intent);
                }
                if(i == 1)
                {
                    Questao questao1 = new Questao("qual significado desse sinal?","adição","subtração","multiplicação","divisão", "adição" ,"https://signum.s3-us-west-2.amazonaws.com/Adicao_traducao.mp4"  );
                    Questao questao2 = new Questao("Qual a tradução da frase a seguir?","9 é um número natural","9 é um número real","9 é faz parte do conjunto dos racionais","9 faz parte dos conjuntos dos reais", "9 faz parte dos conjuntos dos reais" , "https://signum.s3-us-west-2.amazonaws.com/Adicao_traducao.mp4"  );
                    ArrayList<Questao> questaoArrayList = new ArrayList<Questao>();
                    questaoArrayList.add(questao1);
                    questaoArrayList.add(questao2);
                    Intent intent4 = new Intent(view.getContext(), questao1conjuntos.class);
                    intent4.putParcelableArrayListExtra("questoes",questaoArrayList);
                    startActivity(intent4);
                }
                if(i == 2){
                    Resumo resumo = new Resumo("drawable-v24/imagem_conjunto_resumo.jpeg",
                            "Conjunto dos números naturais: É representado por todos os números positivos. Seu símbolo é o N maiúsculo.\n" +
                                    "Conjunto dos números inteiros: Esse conjunto é formado pelos elementos do conjunto dos números naturais e os números inteiros negativos. Ele é representado pela letra maiúscula Z.\n" +
                                    "Conjunto dos números racionais: É representado pela letra maiúscula Q. Pertencem a esse conjunto os números naturais, inteiros, decimais, fracionários e dízima periódica.\n" +
                                    "Conjunto dos números irracionais: Esse conjunto é formado pelos números que são dízimas não periódicas, ou seja, decimais infinitos que não possuem uma repetição de números após a vírgula. É representado pela letra maiúscula I.",
                            "Conjunto dos números");
                    Intent intent = new Intent(view.getContext(), ResumoActivity.class);
                    intent.putExtra("Resumo", resumo);
                    startActivity(intent);
                }


            }
        });

    }
}

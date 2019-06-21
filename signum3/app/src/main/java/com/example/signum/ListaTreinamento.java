package com.example.signum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaTreinamento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_treinamento);

        final String[] video_str = {"Conjuntos", "funções", "Sinal de funções", "funções trigonometricas", "funções exponenciais",
                "funções logaritmicas", "funções compostas", "funções inversas"};

        ListView listView = (ListView) findViewById(R.id.listatreinamento);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, video_str);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(i == 0)
                {
                    Questao questao = new Questao("qual significado desse sinal?","adição","subtração","multiplicação","divisão", "https://signum.s3-us-west-2.amazonaws.com/Adicao_traducao.mp4"  );
                    Intent intent3 = new Intent(view.getContext(), questao1conjuntos.class);
                    intent3.putExtra("questao", questao);
                    startActivity(intent3);
                }


            }
        });

    }
}

package com.example.signum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Hashtable;

public class ListaGlossario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_glossario);

        final String[] video_str = {"adicao", "conjunto natural", "conjunto ser colecao objeto definicao", "conjunto irracionais", "conjunto racionais",
                "conjuntos inteiros", "conjuntos reais", "divisao", "intervalo fechado", "intervalo aberto",
                "intervalo semiaberto", "multiplicacao", "negativo", "conjunto chamar elemento", "positivos", "subconjunto", "subtracao"};


        final Hashtable<String, String> videos = new Hashtable<String, String>();
        videos.put("adicao", "https://signum.s3-us-west-2.amazonaws.com/Adicao_traducao.mp4");
        videos.put("conjunto natural", "https://signum.s3-us-west-2.amazonaws.com/Conjunto_natural.mp4");
        videos.put("conjunto ser colecao objeto definicao", "https://signum.s3-us-west-2.amazonaws.com/Conjunto_ser_colecao_objeto_definicao.mp4");
        videos.put("conjunto irracionais", "https://signum.s3-us-west-2.amazonaws.com/Conjuntos_Irracionais.mp4");
        videos.put("conjunto racionais","https://signum.s3-us-west-2.amazonaws.com/Conjuntos_Racionais.mp4");
        videos.put("conjunto inteiros","https://signum.s3-us-west-2.amazonaws.com/Conjuntos_inteiros.mp4");
        videos.put("conjunto reais","https://signum.s3-us-west-2.amazonaws.com/Conjuntos_reais.mp4");
        videos.put("divisao", "https://signum.s3-us-west-2.amazonaws.com/divisao_traducao.mp4");
        videos.put("intervalo aberto","https://signum.s3-us-west-2.amazonaws.com/intervalo_aberto_traducao");
        videos.put("intervalo fechado", "https://signum.s3-us-west-2.amazonaws.com/intervalo_fechado_traducao.mp4");
        videos.put("intervalo semiaberto","https://signum.s3-us-west-2.amazonaws.com/intervalo_semiaberto.mp4");
        videos.put("multiplicacao", "https://signum.s3-us-west-2.amazonaws.com/multiplicacao_traducao.mp4");
        videos.put("negativo","https://signum.s3-us-west-2.amazonaws.com/negativo_traducao.mp4");
        videos.put("conjunto chamar elemento", "https://signum.s3-us-west-2.amazonaws.com/objeto_conjunto_chamar_elemento_definicao.mp4");
        videos.put("positivos", "https://signum.s3-us-west-2.amazonaws.com/positivo_traducao.mp4");
        videos.put("subconjunto", "https://signum.s3-us-west-2.amazonaws.com/subconjunto_traducao.mp4");
        videos.put("subtracao", "https://signum.s3-us-west-2.amazonaws.com/subtracao.mp4");


        /*String vid = null;
        if (videos.contains(video_str)) {
            vid = videos.get(video_str);
        }*/

        ListView listView = (ListView) findViewById(R.id.windowlist);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, video_str);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(i == 0)
                {
                    Intent intent2 = new Intent(view.getContext(), pop2.class);
                    String vid = videos.get(video_str[0]);
                    intent2.putExtra("video", vid);
                    startActivity(intent2);

                }

                if(i == 1)
                {
                    Intent intent2 = new Intent(view.getContext(), pop2.class);
                    String vid = videos.get(video_str[1]);
                    intent2.putExtra("video", vid);
                    startActivity(intent2);
                }
                if(i == 2)
                {
                    Intent intent2 = new Intent(view.getContext(), pop2.class);
                    String vid = videos.get(video_str[2]);
                    intent2.putExtra("video", vid);
                    startActivity(intent2);
                }
                if(i == 3)
                {
                    Intent intent2 = new Intent(view.getContext(), pop2.class);
                    String vid = videos.get(video_str[3]);
                    intent2.putExtra("video", vid);
                    startActivity(intent2);
                }
                if(i == 4)
                {
                    Intent intent2 = new Intent(view.getContext(), pop2.class);
                    String vid = videos.get(video_str[4]);
                    intent2.putExtra("video", vid);
                    startActivity(intent2);
                }
                if(i == 5)
                {
                    Intent intent2 = new Intent(view.getContext(), pop2.class);
                    String vid = videos.get(video_str[5]);
                    intent2.putExtra("video", vid);
                    startActivity(intent2);
                }
                if(i == 6)
                {
                    Intent intent2 = new Intent(view.getContext(), pop2.class);
                    String vid = videos.get(video_str[6]);
                    intent2.putExtra("video", vid);
                    startActivity(intent2);
                }

                if(i == 7)
                {
                    Intent intent2 = new Intent(view.getContext(), pop2.class);
                    String vid = videos.get(video_str[7]);
                    intent2.putExtra("video", vid);
                    startActivity(intent2);
                }

                if(i == 8)
                {
                    Intent intent2 = new Intent(view.getContext(), pop2.class);
                    String vid = videos.get(video_str[8]);
                    intent2.putExtra("video", vid);
                    startActivity(intent2);
                }
                if(i == 9)
                {
                    Intent intent2 = new Intent(view.getContext(), pop2.class);
                    String vid = videos.get(video_str[9]);
                    intent2.putExtra("video", vid);
                    startActivity(intent2);
                }
                if(i == 10)
                {
                    Intent intent2 = new Intent(view.getContext(), pop2.class);
                    String vid = videos.get(video_str[10]);
                    intent2.putExtra("video", vid);
                    startActivity(intent2);
                }
                if(i == 11)
                {
                    Intent intent2 = new Intent(view.getContext(), pop2.class);
                    String vid = videos.get(video_str[11]);
                    intent2.putExtra("video", vid);
                    startActivity(intent2);
                }
                if(i == 12)
                {
                    Intent intent2 = new Intent(view.getContext(), pop2.class);
                    String vid = videos.get(video_str[12]);
                    intent2.putExtra("video", vid);
                    startActivity(intent2);
                }
                if(i == 13)
                {
                    Intent intent2 = new Intent(view.getContext(), pop2.class);
                    String vid = videos.get(video_str[13]);
                    intent2.putExtra("video", vid);
                    startActivity(intent2);
                }
                if(i == 14)
                {
                    Intent intent2 = new Intent(view.getContext(), pop2.class);
                    String vid = videos.get(video_str[14]);
                    intent2.putExtra("video", vid);
                    startActivity(intent2);
                }
                if(i == 15)
                {
                    Intent intent2 = new Intent(view.getContext(), pop2.class);
                    String vid = videos.get(video_str[15]);
                    intent2.putExtra("video", vid);
                    startActivity(intent2);
                }

                if(i == 16)
                {
                    Intent intent2 = new Intent(view.getContext(), pop2.class);
                    String vid = videos.get(video_str[16]);
                    intent2.putExtra("video", vid);
                    startActivity(intent2);
                }


            }
        });
    }
}

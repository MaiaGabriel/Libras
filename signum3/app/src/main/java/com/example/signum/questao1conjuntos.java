package com.example.signum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.MediaController;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.ArrayList;

public class questao1conjuntos extends AppCompatActivity {

    int pontuacao = 0;
    int tamanho = 0;
    final int pontuacaoMinima = 7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1conjuntos);
        ArrayList<Questao> q = new ArrayList<Questao>();
        q = getIntent().getParcelableArrayListExtra("questoes");
        String descricao = q.get(0).getDescricao();
        String alternativa1 = q.get(0).getAlternativa1();
        String alternativa2 = q.get(0).getAlternativa2();
        String alternativa3 = q.get(0).getAlternativa3();
        String alternativa4 = q.get(0).getAlternativa4();
        String alternativaCorreta = q.get(0).getAlternativaCorreta();
        String video = q.get(0).getUrlVideo();
        TextView pergunta = (TextView) findViewById(R.id.textView3);
        tamanho = q.size();

        pergunta.setText(Html.fromHtml(
                " <b>" + descricao +
                        "</b> "));

        RadioButton alternativ1 = (RadioButton) findViewById(R.id.radioButton21);
        alternativ1.setText(Html.fromHtml("<b>" + alternativa1 + "</b>"));

        RadioButton alternativ2 = (RadioButton) findViewById(R.id.radioButton22);
        alternativ2.setText(Html.fromHtml("<b>" + alternativa2 + "</b>"));

        RadioButton alternativ3 = (RadioButton) findViewById(R.id.radioButton23);
        alternativ3.setText(Html.fromHtml("<b>" + alternativa3 + "</b>"));

        RadioButton alternativ4 = (RadioButton) findViewById(R.id.radioButton24);
        alternativ4.setText(Html.fromHtml("<b>" + alternativa4 + "</b>"));

        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(Html.fromHtml("Pontuação: " + pontuacao +"/" + tamanho));


        MediaController mediaController = new MediaController(this);
        VideoView vd = (VideoView) findViewById(R.id.videoView8);
        mediaController.setAnchorView(vd);
        vd.setMediaController(mediaController);
        vd.setVideoURI(Uri.parse(video));
        vd.requestFocus();
        vd.start();

    }

    public void proximaQuestao(View view) {
        ArrayList<Questao> q = new ArrayList<Questao>();
        q = getIntent().getParcelableArrayListExtra("questoes");
        pontuacao++;

        if (q.size() == 1){

            finish();
        }else {
            q.remove(0);
            String descricao = q.get(0).getDescricao();
            String alternativa1 = q.get(0).getAlternativa1();
            String alternativa2 = q.get(0).getAlternativa2();
            String alternativa3 = q.get(0).getAlternativa3();
            String alternativa4 = q.get(0).getAlternativa4();
            String alternativaCorreta = q.get(0).getAlternativaCorreta();
            String video = q.get(0).getUrlVideo();
            TextView pergunta = (TextView) findViewById(R.id.textView3);

            pergunta.setText(Html.fromHtml(
                    " <b>" + descricao +
                            "</b> "));

            RadioButton alternativ1 = (RadioButton) findViewById(R.id.radioButton21);
            alternativ1.setText(Html.fromHtml("<b>" + alternativa1 + "</b>"));

            RadioButton alternativ2 = (RadioButton) findViewById(R.id.radioButton22);
            alternativ2.setText(Html.fromHtml("<b>" + alternativa2 + "</b>"));

            RadioButton alternativ3 = (RadioButton) findViewById(R.id.radioButton23);
            alternativ3.setText(Html.fromHtml("<b>" + alternativa3 + "</b>"));

            RadioButton alternativ4 = (RadioButton) findViewById(R.id.radioButton24);
            alternativ4.setText(Html.fromHtml("<b>" + alternativa4 + "</b>"));

            TextView textView = (TextView) findViewById(R.id.textView2);
            textView.setText(Html.fromHtml("Pontuação: " + pontuacao +"/" + tamanho));


            MediaController mediaController = new MediaController(this);
            VideoView vd = (VideoView) findViewById(R.id.videoView8);
            mediaController.setAnchorView(vd);
            vd.setMediaController(mediaController);
            vd.setVideoURI(Uri.parse(video));
            vd.requestFocus();
            vd.start();
        }
    }

//    public void questao2(View view) {
//        Questao2 questao2 = new Questao2("Qual das figuras representa a palava conjunto natural?","a","b","c","d", "d" ,"https://signum.s3-us-west-2.amazonaws.com/Adicao_traducao.mp4","https://signum.s3-us-west-2.amazonaws.com/Adicao_traducao.mp4","https://signum.s3-us-west-2.amazonaws.com/Adicao_traducao.mp4","https://signum.s3-us-west-2.amazonaws.com/Adicao_traducao.mp4"  );
//        Intent intent4 = new Intent(view.getContext(), questao2conjuntos.class);
//        intent4.putExtra("questao2", questao2);
//        startActivity(intent4);
//
//    }
}

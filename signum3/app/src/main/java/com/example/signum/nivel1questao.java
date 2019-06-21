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

public class nivel1questao extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel1questao);
        Questao q = getIntent().getExtras().getParcelable("questao");
        String descricao = q.getDescricao();
        String alternativa1 = q.getAlternativa1();
        String alternativa2 = q.getAlternativa2();
        String alternativa3 = q.getAlternativa3();
        String alternativa4 = q.getAlternativa4();
        String video = q.getUrlVideo();
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


        MediaController mediaController = new MediaController(this);
        VideoView vd = (VideoView) findViewById(R.id.videoView8);
        mediaController.setAnchorView(vd);
        vd.setMediaController(mediaController);
        vd.setVideoURI(Uri.parse(video));
        vd.requestFocus();
        vd.start();



    }

    public void nivel2(View view)
    {
        Questao2 questao2 = new Questao2("Qual das figuras representa a palava conjunto natural?","a","b","c","d","https://signum.s3-us-west-2.amazonaws.com/Conjunto_natural.mp4","https://signum.s3-us-west-2.amazonaws.com/teste.MP4","https://signum.s3-us-west-2.amazonaws.com/Adicao_traducao.mp4","https://signum.s3-us-west-2.amazonaws.com/Conjuntos_inteiros.mp4"  );
        Intent intent = new Intent(this, nivel2questao.class);
        intent.putExtra("questao2",questao2);
        startActivity(intent);

    }


    public void nivel3(View view) {
    }
}

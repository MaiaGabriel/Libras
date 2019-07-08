package com.example.signum;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.VideoView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class questao1conjuntos extends AppCompatActivity {

    int pontuacao = 0;
    int tamanho = 0;
    final int pontuacaoMinima = 7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1conjuntos);
        Button button = (Button) findViewById(R.id.button15);
        Button button1 = (Button) findViewById(R.id.button9);
        button.setClickable(false);
        button1.setVisibility(View.INVISIBLE);
        button1.setClickable(false);
        ArrayList<Questao> q = new ArrayList<Questao>();
        q = getIntent().getParcelableArrayListExtra("questoes");
        String descricao = q.get(0).getDescricao();
        String alternativa1 = q.get(0).getAlternativa1();
        String alternativa2 = q.get(0).getAlternativa2();
        String alternativa3 = q.get(0).getAlternativa3();
        String alternativa4 = q.get(0).getAlternativa4();
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
        vd.setMediaController(mediaController);
        vd.setVideoURI(Uri.parse(video));
        mediaController.setAnchorView(vd);
        vd.requestFocus();
        vd.start();

    }

    public void proximaQuestao(View view) {
        ArrayList<Questao> q = new ArrayList<Questao>();
        q = getIntent().getParcelableArrayListExtra("questoes");
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        RadioButton opcaoEscolhida = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
        Button button = (Button) findViewById(R.id.button15);
        Button button1 = (Button) findViewById(R.id.button9);
        button.setClickable(false);
        button.setVisibility(View.INVISIBLE);
        button1.setVisibility(View.VISIBLE);
        button1.setClickable(true);
//        radioGroup.clearCheck();
        if(q.get(0).getAlternativaCorreta().equals(opcaoEscolhida.getText().toString())){
            pontuacao++;
            TextView textView = (TextView) findViewById(R.id.textView2);
            textView.setText(Html.fromHtml("Pontuação: " + pontuacao + "/" + tamanho));
            Snackbar.make(view, "Resposta Correta!", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            button1.setBackgroundResource(R.drawable.roundcornerverde);

        }else {
            Snackbar.make(view, "A Resposta correta era " + q.get(0).getAlternativaCorreta(), Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            button1.setBackgroundResource(R.drawable.roundcornerred);
        }
    }

    public void continuar(View view) {
        ArrayList<Questao> q = new ArrayList<Questao>();
        q = getIntent().getParcelableArrayListExtra("questoes");
        Button button = (Button) findViewById(R.id.button15);
        Button button1 = (Button) findViewById(R.id.button9);
        if (q.size() == 0) {
            super.finish();
        } else {
            if (q.size() == 1) {
                Snackbar.make(view, "Você acertou: " + pontuacao + " de " + tamanho + " perguntas!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                button1.setBackgroundResource(R.drawable.roundcornerblue);
                q.remove(0);
            } else {
                button.setClickable(true);
                button.setVisibility(View.VISIBLE);
                button1.setVisibility(View.INVISIBLE);
                button1.setClickable(false);
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
                textView.setText(Html.fromHtml("Pontuação: " + pontuacao + "/" + tamanho));


                MediaController mediaController = new MediaController(this);
                VideoView vd = (VideoView) findViewById(R.id.videoView8);
                mediaController.setAnchorView(vd);
                vd.setMediaController(mediaController);
                vd.setVideoURI(Uri.parse(video));
                vd.requestFocus();
                vd.start();
            }
        }
    }
    public void setEnviarVisible2(View view){
        boolean checked = ((RadioButton) view).isChecked();
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        Button button = (Button) findViewById(R.id.button15);
        switch(view.getId()) {
            case R.id.radioButton21: {
                button.setClickable(true);
                button.setBackgroundResource(R.drawable.roundcornerverde);
                break;
            }
            case R.id.radioButton22: {
                button.setClickable(true);
                button.setBackgroundResource(R.drawable.roundcornerverde);
                break;
            }
            case R.id.radioButton23: {
                button.setClickable(true);
                button.setBackgroundResource(R.drawable.roundcornerverde);
                break;
            }
            case R.id.radioButton24: {
                button.setClickable(true);
                button.setBackgroundResource(R.drawable.roundcornerverde);
                break;
            }
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
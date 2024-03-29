package com.example.signum;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.MediaController;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.VideoView;

public class questao2conjuntos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao2conjuntos);
        Questao2 q = getIntent().getExtras().getParcelable("questao2");
        String descricao = q.getDescricao();
        String alternativa1 = q.getAlternativa1();
        String alternativa2 = q.getAlternativa2();
        String alternativa3 = q.getAlternativa3();
        String alternativa4 = q.getAlternativa4();
        String video = q.getUrlVideo();
        String video2 = q.getUrlVideo2();
        String video3 = q.getUrlVideo3();
        String video4 = q.getUrlVideo4();
        TextView pergunta = (TextView) findViewById(R.id.textView3);

        pergunta.setText(Html.fromHtml(
                " <b>" + descricao +
                        "</b> "));

        RadioButton alternativ1 = (RadioButton) findViewById(R.id.radioButton25);
        alternativ1.setText(Html.fromHtml("<b>" + alternativa1 + "</b>"));

        RadioButton alternativ2 = (RadioButton) findViewById(R.id.radioButton26);
        alternativ2.setText(Html.fromHtml("<b>" + alternativa2 + "</b>"));

        RadioButton alternativ3 = (RadioButton) findViewById(R.id.radioButton27);
        alternativ3.setText(Html.fromHtml("<b>" + alternativa3 + "</b>"));

        RadioButton alternativ4 = (RadioButton) findViewById(R.id.radioButton28);
        alternativ4.setText(Html.fromHtml("<b>" + alternativa4 + "</b>"));

        MediaController mediaController = new MediaController(this);
        VideoView vd = (VideoView) findViewById(R.id.videoView9);
        mediaController.setAnchorView(vd);
        vd.setMediaController(mediaController);
        vd.setVideoURI(Uri.parse(video));
        vd.requestFocus();
        vd.start();


        MediaController mediaController2 = new MediaController(this);
        VideoView vd2 = (VideoView) findViewById(R.id.videoView10);
        mediaController2.setAnchorView(vd2);
        vd2.setMediaController(mediaController2);
        vd2.setVideoURI(Uri.parse(video2));
        vd2.requestFocus();
        vd2.start();

        MediaController mediaController3 = new MediaController(this);
        VideoView vd3 = (VideoView) findViewById(R.id.videoView11);
        mediaController3.setAnchorView(vd3);
        vd3.setMediaController(mediaController3);
        vd3.setVideoURI(Uri.parse(video3));
        vd3.requestFocus();
        vd3.start();

        MediaController mediaController4 = new MediaController(this);
        VideoView vd4 = (VideoView) findViewById(R.id.videoView12);
        mediaController4.setAnchorView(vd4);
        vd4.setMediaController(mediaController4);
        vd4.setVideoURI(Uri.parse(video4));
        vd4.requestFocus();
        vd4.start();

    }

    public void oneRadioButtonClicked(View view) {
// Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        switch(view.getId()) {
            case R.id.radioButton25: {
                radioGroup.clearCheck();
                radioGroup.check(R.id.radioButton25);
                break;
                }
            case R.id.radioButton26: {
                radioGroup.clearCheck();
                radioGroup.check(R.id.radioButton26);
                break;
            }
            case R.id.radioButton27: {
                radioGroup.clearCheck();
                radioGroup.check(R.id.radioButton27);
                break;
            }
            case R.id.radioButton28: {
                radioGroup.clearCheck();
                radioGroup.check(R.id.radioButton28);
                break;
            }
        }
    }

    public void questao3(View view) {

    }
}

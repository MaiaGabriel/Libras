package com.example.signum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class nivel1questao extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel1questao);
        Questao q = getIntent().getExtras().getParcelable("questao");
        String descricao = q.getDescricao();
        String alternativas = q.getAlternativas();
        int img = q.getUrlImagem();
        TextView pergunta = (TextView) findViewById(R.id.textView2);

        pergunta.setText(Html.fromHtml(
                " <b>" + descricao +
                        "</b> "));

        RadioButton alternativa = (RadioButton) findViewById(R.id.radioButton);
        alternativa.setText(Html.fromHtml("<b>" + alternativas + "</b>"));


        ImageView im  = (ImageView) findViewById(R.id.imageView2);
        im.setImageResource(img);

    }

    public void nivel2(View view)
    {
        Questao questao = new Questao("teste","alt1", R.drawable.questao1  );
        Intent intent = new Intent(this, nivel2questao.class);
        intent.putExtra("questao",questao);
        startActivity(intent);

    }


}

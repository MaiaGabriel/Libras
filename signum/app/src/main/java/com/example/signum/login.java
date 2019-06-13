package com.example.signum;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Intent intent = new Intent(this,Pop.class);
        startActivity(intent);


        /*//displays a video file
        VideoView videoView = (VideoView) findViewById(R.id.videoView);

        String videoPath = "android.resource://com.example.signum/" + R.raw.intro;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);*/

    }


    // nome da declaracao de criacao do menu
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }

    // ao clicar em sobre, irar aparecer uma mensagem alerta do nome do app e versao
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.sobre:
                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setMessage("App libras v1.0")
                        .setNeutralButton("Ok", null).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    //ao clicar no botao login, vai aparecer um toast escrito ola "fulando@tal"
    // em seguida, ao clicar o botao, ele abrira a activity bemvindo
    public void entrarClicado(View view) {

        Intent intent = new Intent(this, MainActivity.class);

        EditText inputEmail = (EditText) findViewById(R.id.editText);
        EditText inputSenha = (EditText) findViewById(R.id.editText2);

        //verifica senha
        UsuarioDAO usuarioDAO = new UsuarioDAO(this);
        Usuario usuario = usuarioDAO.getUsuario(inputEmail.getText().toString(),
                inputSenha.getText().toString());

        if (usuario != null) {
            intent.putExtra("usuario", usuario);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Usuário e/ou Senha inválidos!",
                    Toast.LENGTH_SHORT).show();
        }

    }


    public void cadastro(View view) {
        Intent intent = new Intent(this, cadastroUsuario.class);
        startActivity(intent);
    }
}

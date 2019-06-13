package com.example.signum;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class cadastroUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);
    }


    public void onconcluir(View view) {

        EditText inputNome = (EditText) findViewById(R.id.editText3);
        EditText inputEmail = (EditText) findViewById(R.id.editText4);
        EditText inputSenha = (EditText) findViewById(R.id.editText5);
        EditText inputNescolaridade = (EditText) findViewById(R.id.editText6);
        EditText inputNAlfabetizacaoLibras = (EditText) findViewById(R.id.editText7);

        Usuario usuario = new Usuario(inputNome.getText().toString(),
                inputEmail.getText().toString(),
                inputSenha.getText().toString(),
                inputNescolaridade.getText().toString(),
                inputNAlfabetizacaoLibras.getText().toString());
        UsuarioDAO usuarioDAO = new UsuarioDAO(this);
        if (usuarioDAO.addUsuario(usuario)) {
            Toast.makeText(this, "Usuário criado!", Toast.LENGTH_SHORT).show();
            finish();
        } else {
            Toast.makeText(this, "Erro ao cadastrar!", Toast.LENGTH_SHORT).show();
        }

    }

}

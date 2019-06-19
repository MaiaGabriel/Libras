package com.example.signum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class cadastroUsuario extends AppCompatActivity {



    String names [] = {"nivel de escolaridade","básico","intermediário","avançado"};
    String names2 [] = {"nivel de alfabetização em libras","básico","intermediário","avançado"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);

        Spinner myspinner = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(cadastroUsuario.this,android.R.layout.simple_list_item_1,names);
        myspinner.setAdapter(myAdapter);


        Spinner  myspinner2 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(cadastroUsuario.this,android.R.layout.simple_list_item_1,names2);
        myspinner2.setAdapter(myAdapter2);

    }


    public void onconcluir(View view) {

        EditText inputNome = (EditText) findViewById(R.id.editText3);
        EditText inputEmail = (EditText) findViewById(R.id.editText4);
        EditText inputSenha = (EditText) findViewById(R.id.editText5);
        Spinner myspinner = (Spinner) findViewById(R.id.spinner1);
        Spinner  myspinner2 = (Spinner) findViewById(R.id.spinner2);

        Usuario2 usuario = new Usuario2(inputNome.getText().toString(),
                inputEmail.getText().toString(),
                inputSenha.getText().toString(),
                myspinner.getSelectedItem().toString(),
                myspinner2.getSelectedItem().toString());
        UsuarioDAO2 usuarioDAO = new UsuarioDAO2();
        if (usuarioDAO.addUsuario(usuario)) {
            Toast.makeText(this, "Usuário criado!", Toast.LENGTH_SHORT).show();
            finish();
        } else {
            Toast.makeText(this, "Erro ao cadastrar!", Toast.LENGTH_SHORT).show();
        }



    }

}

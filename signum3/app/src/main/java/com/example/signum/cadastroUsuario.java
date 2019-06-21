package com.example.signum;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.signum.Model.Users;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

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

        Users user = new Users(inputNome.getText().toString(),
                inputEmail.getText().toString(),
                inputSenha.getText().toString(),
                myspinner.getSelectedItem().toString(),
                myspinner2.getSelectedItem().toString());

        CreateAccount(user);

    }


    private void CreateAccount(Users usuario)
    {

        if(TextUtils.isEmpty(usuario.getName()))
        {
            Toast.makeText(this, "por favor escreva seu nome", Toast.LENGTH_SHORT).show();
        }
        else if(TextUtils.isEmpty(usuario.getEmail()))
        {
            Toast.makeText(this, "por favor escreva seu email", Toast.LENGTH_SHORT).show();
        }
        else if(TextUtils.isEmpty(usuario.getSenha()))
        {
            Toast.makeText(this, "por favor escreva sua senha", Toast.LENGTH_SHORT).show();
        }
        else if(TextUtils.isEmpty(usuario.getNEscolaridade()))
        {
            Toast.makeText(this, "por favor escreva seu nivel de escolaridade", Toast.LENGTH_SHORT).show();
        }
        else if(TextUtils.isEmpty(usuario.getNAlfabetizacaolibras()))
        {
            Toast.makeText(this, "por favor escreva seu nivel de alfabetização em libras", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"por favor, aguarde enquanto estamos checando suas credenciais",Toast.LENGTH_SHORT).show();
            ValidateEmail(usuario.getEmail(),usuario.getName(),usuario.getSenha(),usuario.getNEscolaridade(),usuario.getNAlfabetizacaolibras());
        }


    }
    //validar email
    private void ValidateEmail(final String email, final String nome, final String senha, final String nescolaridade, final String nalfabetizacaolibras)
    {
        final DatabaseReference RootRef;
        RootRef = FirebaseDatabase.getInstance().getReference();

        RootRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // se usuario nao existe entao faz isso ai
                if(!dataSnapshot.child("Users").child(email).exists())
                {
                    HashMap<String,Object> userDataMap = new HashMap<>();
                    userDataMap.put("nome",nome);
                    userDataMap.put("email",email);
                    userDataMap.put("senha",senha);
                    userDataMap.put("nescolaridade",nescolaridade);
                    userDataMap.put("nalfabetizacaolibras",nalfabetizacaolibras);

                    RootRef.child("Users").child(email).updateChildren(userDataMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if(task.isSuccessful())
                            {
                                Toast.makeText(cadastroUsuario.this, "conta criada com sucesso!",Toast.LENGTH_SHORT).show();
                                finish();

                            }
                            else
                            {
                                Toast.makeText(cadastroUsuario.this, "Erro de internet! Tente novamente.",Toast.LENGTH_SHORT).show();

                            }
                        }
                    });
                }
                // se usuario ja existe exibe essa mensagem
                else
                {
                    Toast.makeText(cadastroUsuario.this, "Esse" + email + "ja existe",Toast.LENGTH_SHORT).show();
                    Toast.makeText(cadastroUsuario.this, "por favor, tente outro email!",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }


}

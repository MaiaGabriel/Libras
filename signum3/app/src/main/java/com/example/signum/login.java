package com.example.signum;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.signum.Model.Users;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class login extends AppCompatActivity {

    private String parentDbName = "Users";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Intent intent = new Intent(this,Pop.class);
        startActivity(intent);

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

        EditText inputEmail = (EditText) findViewById(R.id.editText);
        EditText inputSenha = (EditText) findViewById(R.id.editText2);

        String email = inputEmail.getText().toString();
        String senha = inputSenha.getText().toString();
        LoginUser(email,senha);

    }

    private void LoginUser(String email, String senha)
    {

         if(TextUtils.isEmpty(email))
         {
            Toast.makeText(this, "por favor escreva seu email", Toast.LENGTH_SHORT).show();
         }
         else if(TextUtils.isEmpty(senha))
         {
                Toast.makeText(this, "por favor escreva sua senha", Toast.LENGTH_SHORT).show();
         }
         else
         {
             Toast.makeText(this,"por favor, aguarde enquanto estamos checando suas credenciais",Toast.LENGTH_SHORT).show();
             AllowAccessToAccount(email,senha);
         }




    }

    private void AllowAccessToAccount(final String email, final String senha) {
        final DatabaseReference RootRef;
        RootRef = FirebaseDatabase.getInstance().getReference();

        RootRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.child(parentDbName).child(email).exists()) {
                    Users usuarioData = dataSnapshot.child(parentDbName).child(email).getValue(Users.class);

                    if (usuarioData.getEmail().equals(email)) {
                        if (usuarioData.getSenha().equals(senha)) {
                            Intent intent2 = new Intent(login.this, MainActivity.class);
                            startActivity(intent2);

                        }
                    }
                }
                else
                {
                    Toast.makeText(login.this, "A conta com esse" + email + "não existe!", Toast.LENGTH_SHORT).show();


                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        }


        );
    }


    public void cadastro(View view) {
        Intent intent = new Intent(this, cadastroUsuario.class);
        startActivity(intent);
    }
}

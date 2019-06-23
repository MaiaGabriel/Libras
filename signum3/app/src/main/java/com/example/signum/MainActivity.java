package com.example.signum;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.Menu;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Sem notificações!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Tela_Principal_Fragment()).commit();



    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
//            if(myFragment != null && myFragment.isVisible()){
//                super.onBackPressed();
//            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Tela_Principal_Fragment()).commit();

        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Tela_Principal_Fragment()).commit();


        } else if (id == R.id.nav_meuscursos) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Meus_cursos_Fragment()).commit();
        } else if (id == R.id.nav_teste) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Teste_Fragment()).commit();
        } else if (id == R.id.nav_fale_conosco) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Treinamento_Fragment()).commit();
        } else if (id == R.id.nav_share) {
            Toast.makeText(this,"share",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_send) {
            Intent intent = new Intent(this, login.class);
            startActivity(intent);
            finish();
        }


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void testeConjuntos(View view)
    {
        ArrayList<Questao> questaoArrayList = new ArrayList<Questao>();
        Questao questao1 = new Questao("1 – Se Maria tem os jogos{0, 1}, Carlos tem os jogos {0, 1, 2} e João tem os jogos {2, 3}. Quais jogos eles terão no total caso se unam?",
                "a) 0,1",
                "b) 0, 1, 2",
                "c) 2, 3",
                "d) 0,1,2,3",
                "d) 0,1,2,3" ,
                "https://signum.s3-us-west-2.amazonaws.com/Adicao_traducao.mp4"  );
        questaoArrayList.add(questao1);
        Questao questao2 = new Questao("2 - Se Maria tem os jogos{0, 1}, Carlos tem os jogos {0, 1, 2} e João tem os jogos {2, 3}. Quais jogos Carlos e Maria tem em comum? ",
                "a) 0,1,2",
                "b) 0, 1, 2",
                "c) 0, 1",
                "d) 2, 3",
                "c) 0,1" ,
                "https://signum.s3-us-west-2.amazonaws.com/Adicao_traducao.mp4"  );
        questaoArrayList.add(questao2);
        Questao questao3 = new Questao("3 - Os senhores A, B e C concorriam à liderança de certo partido político. Para escolher o líder, cada eleitor votou apenas em dois candidatos de sua preferência. Houve 100 votos para A e B, 80 votos para B e C e 20 votos para A e C. Em consequência:",
                "a) venceu A, com 120 votos.",
                "b) venceu A, com 140 votos.",
                "c) A e B empataram em primeiro lugar.",
                "d) venceu B, com 180 votos.",
                "d) venceu B, com 180 votos." ,
                "https://signum.s3-us-west-2.amazonaws.com/Adicao_traducao.mp4"  );
        questaoArrayList.add(questao3);
        Questao questao4 = new Questao("4 - Em um colégio, de 100 alunos, 80 gostam de sorvete de chocolate, 70 gostam de sorvete de creme e 60 gostam dos dois sabores. Quantos alunos não gostam de nenhum dos dois sabores?",
                "a) 0",
                "b) 10",
                "c) 20",
                "d) 30",
                "b) 10" ,
                "https://signum.s3-us-west-2.amazonaws.com/Adicao_traducao.mp4"  );
        questaoArrayList.add(questao4);
        Questao questao5 = new Questao("5  - Numa pesquisa de mercado, verificou-se que 15 pessoas utilizam pelo menos um dos produtos A ou B. Sabendo que 10 dessas pessoas não usam o produto B e que 2 dessas pessoas não usam o produto A, qual é o número de pessoas que utilizam os produtos A e B?",
                "a) 0",
                "b) 2",
                "c) 3",
                "d) 4",
                "c) 3" ,
                "https://signum.s3-us-west-2.amazonaws.com/Adicao_traducao.mp4"  );
        questaoArrayList.add(questao5);

        Intent intent4 = new Intent(view.getContext(), nivel1questao.class);
        intent4.putParcelableArrayListExtra("questoes",questaoArrayList);
        startActivity(intent4);

    }

    public void testeFuncoes(View view)
    {

    }


    public void glossario(View view)
    {

        Intent intent = new Intent(this, ListaGlossario.class);
        startActivity(intent);

    }

    public void botaotreinamento(View view)
    {

        Intent intent = new Intent(this, ListaTreinamento.class);
        startActivity(intent);

    }





}

package com.example.signum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class ListaTreinamento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_treinamento);

        final String[] video_str = {"Conjuntos", "funções", "funções trigonometricas", "funções exponenciais e logaritmicas"
                ,"funções compostas e inversas"};

        ListView listView = (ListView) findViewById(R.id.listatreinamento);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, video_str);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(i == 0)
                {
                    ArrayList<Questao> questaoArrayList = new ArrayList<Questao>();
                    Questao questao1 = new Questao("Pergunta: qual a tradução da frase a seguir?","Um conjunto é uma coleção de números naturais","Um conjunto é uma coleção de números","Um conjunto é uma coleção de objetos","O número pertence ao conjunto dos naturais", "Um conjunto é uma coleção de objetos" ,"https://signum.s3-us-west-2.amazonaws.com/conjunto_dos_numeros_reais/Conjunto_ser_colecao_objeto_definicao.mp4"  );
                    questaoArrayList.add(questao1);
                    Questao questao2 = new Questao("Qual o significado do vídeo a seguir?","subtração","Conjunto irracional","Conjunto Natural","adição", "adição" , "https://signum.s3-us-west-2.amazonaws.com/conjunto_dos_numeros_reais/adicao1.mp4"  );
                    questaoArrayList.add(questao2);
                    Questao questao3 = new Questao("Que tipo de conjunto o vídeo es","subtração","Conjunto irracional","Conjunto Natural","adição", "adição" , "https://signum.s3-us-west-2.amazonaws.com/conjunto_dos_numeros_reais/adicao1.mp4"  );
                    questaoArrayList.add(questao3);
                    Questao questao4 = new Questao("Qual o significado do vídeo a seguir?","subtração","Conjunto irracional","Conjunto Natural","adição", "adição" , "https://signum.s3-us-west-2.amazonaws.com/conjunto_dos_numeros_reais/adicao1.mp4"  );
                    questaoArrayList.add(questao4);

                    Resumo resumo = new Resumo("imagem_conjunto_resumo",
                            "Conjunto dos números naturais: É representado por todos os números positivos. Seu símbolo é o N maiúsculo.\n" +
                                    "Conjunto dos números inteiros: Esse conjunto é formado pelos elementos do conjunto dos números naturais e os números inteiros negativos. Ele é representado pela letra maiúscula Z.\n" +
                                    "Conjunto dos números racionais: É representado pela letra maiúscula Q. Pertencem a esse conjunto os números naturais, inteiros, decimais, fracionários e dízima periódica.\n" +
                                    "Conjunto dos números irracionais: Esse conjunto é formado pelos números que são dízimas não periódicas, ou seja, decimais infinitos que não possuem uma repetição de números após a vírgula. É representado pela letra maiúscula I.",
                            "Conjunto dos números");
                    Intent intent = new Intent(view.getContext(), ResumoActivity.class);
                    intent.putExtra("Resumo", resumo);
                    intent.putParcelableArrayListExtra("questoes",questaoArrayList);
                    startActivity(intent);
                }
                if(i == 1)
                {
                    Questao questao1 = new Questao("qual significado desse sinal?","adição","subtração","multiplicação","divisão", "adição" ,"https://signum.s3-us-west-2.amazonaws.com/Adicao_traducao.mp4"  );
                    Questao questao2 = new Questao("Qual a tradução da frase a seguir?","9 é um número natural","9 é um número real","9 é faz parte do conjunto dos racionais","9 faz parte dos conjuntos dos reais", "9 faz parte dos conjuntos dos reais" , "https://signum.s3-us-west-2.amazonaws.com/Adicao_traducao.mp4"  );
                    ArrayList<Questao> questaoArrayList = new ArrayList<Questao>();
                    questaoArrayList.add(questao1);
                    questaoArrayList.add(questao2);

                    Resumo resumo = new Resumo("imagem_funcao", "Uma função f (ou aplicação) é uma relação entre dois conjuntos quaisquer, A e B, e uma regra que permite associar a cada elemento de A um único elemento de B. Isto quer dizer, em linguagem matemática, que: f : A → B\n" +
                            "Domínio, contradomínio e imagem: Vamos analisar a função definida por: f : A → B, f(x) = x+1, sendo A = {1,2} e B = {2,3,4}.\n" +
                            "Podemos dizer que:\n" +
                            "Domínio: de onde partem as flechas;\n" +
                            "Contradomínio: os elementos que as flechas podem acertar;\n" +
                            "Imagem: os elementos foram atingidos pelas flechas.",
                            "Função");

                    Intent intent = new Intent(view.getContext(), ResumoActivity.class);
                    intent.putExtra("Resumo", resumo);
                    intent.putParcelableArrayListExtra("questoes",questaoArrayList);
                    startActivity(intent);
                }
                if(i == 2){

                    Questao questao1 = new Questao("qual significado desse sinal?","adição","subtração","multiplicação","divisão", "adição" ,"https://signum.s3-us-west-2.amazonaws.com/Adicao_traducao.mp4"  );
                    Questao questao2 = new Questao("Qual a tradução da frase a seguir?","9 é um número natural","9 é um número real","9 é faz parte do conjunto dos racionais","9 faz parte dos conjuntos dos reais", "9 faz parte dos conjuntos dos reais" , "https://signum.s3-us-west-2.amazonaws.com/Adicao_traducao.mp4"  );
                    ArrayList<Questao> questaoArrayList = new ArrayList<Questao>();
                    questaoArrayList.add(questao1);
                    questaoArrayList.add(questao2);

                    Resumo resumo = new Resumo("imagem_funcoes_trigonometricas",
                            "A palavra trigonometria significa “medida dos triângulos”. Mas a trigonometria não se limita apenas a estudar triângulos. Sua aplicação se estende na outros campos da matemática, como a Análise, e a outros campos da atividade humana como a Eletricidade, a Mecânica, a Acústica, a Música, a Topologia, a Engenharia Civil, etc.\n" +
                                    "\n" +
                                    "Algumas funções são muito importantes para entender a trigonometria e ela estão listadas abaixo:\n" +
                                    "\n" +
                                    "Função seno\n" +
                                    "f(x) = sen x\n" +
                                    "O domínio dessa função é R e a imagem é Im [ -1,1] ; visto que, na circunferência trigonométrica o raio é unitário e, pela definição do seno, –1 £ sen x £ 1, ou seja:\n" +
                                    "Domínio de f(x)= sen x; D(sen x) = R.\n" +
                                    "Imagem de f(x)= sen x; Im(sen x) = [ -1,1] .\n" +
                                    "\n" +
                                    "Sinal da Função: Como seno x é a ordenada do ponto-extremidade do arco:1\n" +
                                    "f(x) = sen x é positiva no 1° e 2° quadrantes (ordenada positiva)\n" +
                                    "f(x) = sen x é negativa no 3° e 4° qua drantes (ordenada negativa)\n" +
                                    "\n" +
                                    "\n" +
                                    "Função cosseno\n" +
                                    "Chamamos de função cosseno a função f(x) = cos x.\n" +
                                    "O domínio dessa função é R e a imagem é Im [ -1,1] ; visto que, na circunferência trigonométrica o raio é unitário e, pela definição do cosseno, –1 £ cos x £ 1, ou seja:\n" +
                                    "Domínio de f(x) = cos x; D(cos x) = R.\n" +
                                    "Imagem de f(x) = cos x; Im(cos x) = [ -1,1] .\n" +
                                    "Sinal da Função: Como cosseno x é a abscissa do ponto-extremidade do arco:\n" +
                                    "f(x) = cos x é positiva no 1° e 4° quadrantes (abscissa positiva)\n" +
                                    "f(x) = cos x é negativa no 2° e 3° quadrantes (abscissa negativa)\n" +
                                    "\n" +
                                    "Função tangente\n" +
                                    "Chamamos de função tangente a função f(x) = tg x.\n" +
                                    "Domínio de f(x) = O domínio dessa função são todos os números reais, exceto os que zeram o cosseno pois não existe cosx = 0\n" +
                                    "Imagem de f(x) = tg x; Im(tg x) = R ou  .\n" +
                                    "\n" +
                                    "Sinal da Função:   Como tangente x é a ordenada do ponto T interseção da reta que passa pelo centro de uma circunferência trigonométrica e o ponto-extremidade do arco, com o eixo das tangentes então:\n" +
                                    "f(x) = tg x é positiva no 1° e 3° quadrantes (produto da ordenada pela abscissa positiva)\n" +
                                    "f(x) = tg x é negativa no 2° e 4° quadrantes (produto da ordenada pela abscissa negativa)",
                            "Funções Trigonométricas");



                    Intent intent = new Intent(view.getContext(), ResumoActivity.class);
                    intent.putExtra("Resumo", resumo);
                    intent.putParcelableArrayListExtra("questoes",questaoArrayList);
                    startActivity(intent);
                }

                if(i == 3){
                    ArrayList<Questao> questaoArrayList = new ArrayList<Questao>();
                    Questao questao1 = new Questao("qual significado desse sinal?","adição","subtração","multiplicação","divisão", "adição" ,"https://signum.s3-us-west-2.amazonaws.com/Adicao_traducao.mp4"  );
                    questaoArrayList.add(questao1);
                    Questao questao2 = new Questao("Qual a tradução da frase a seguir?","9 é um número natural","9 é um número real","9 é faz parte do conjunto dos racionais","9 faz parte dos conjuntos dos reais", "9 faz parte dos conjuntos dos reais" , "https://signum.s3-us-west-2.amazonaws.com/Adicao_traducao.mp4"  );
                    questaoArrayList.add(questao2);


                    Resumo resumo = new Resumo("imagem_exponenciais_logaritmicas",
                            "Função Exponencial é aquela que a variável está no expoente e cuja base é sempre maior que zero e diferente de um.\n" +
                                    "Essas restrições são necessárias, pois 1 elevado a qualquer número resulta em 1. Assim, em vez de exponencial, estaríamos diante de uma função constante.\n" +
                                    "Além disso, a base não pode ser negativa, nem igual a zero, pois para alguns expoentes a função não estaria definida.\n" +
                                    "Algumas dicas são sempre importantes de serem lembradas: \n" +
                            "Toda função definida pela lei de formação f(x) = logax, com a ≠ 1 e a > 0 é denominada função logarítmica de base a. Nesse tipo de função o domínio é representado pelo conjunto dos números reais maiores que zero e o contradomínio, o conjunto dos reais.\n" +
                                    "\n" +
                                    "Domínio da função logarítmica\n" +
                                    "O domínio de uma função representa os valores de x onde a função é definida. No caso da função logarítmica, devemos levar em consideração as condições de existência do logaritmo.\n" +
                                    "Portanto, o logaritmando deve ser positivo e a base também deve ser positiva e diferente de 1.\n" +
                                    "\n" +
                                    "Gráfico da função logarítmica\n" +
                                    "De uma forma geral, o gráfico da função y = loga x está localizado no I e IV quadrantes, pois a função só é definida para x > 0.\n" +
                                    "Além disso, a curva da função logarítmica não toca o eixo y e corta o eixo x no ponto de abscissa igual a 1, pois y = loga1 = 0, para qualquer valor de a.\n" +
                                    "\n" +
                                    "Função crescente e decrescente\n" +
                                    "Uma função logarítmica será crescente quando a base a for maior que 1, ou seja, x1 < x2 ⇔ loga x1 < loga x2. Por exemplo, a função f (x) = log2 x é uma função crescente, pois a base é igual a 2.",
                            "Funções Exponenciais e Logaritmicas");

                    Intent intent = new Intent(view.getContext(), ResumoActivity.class);
                    intent.putExtra("Resumo", resumo);
                    intent.putParcelableArrayListExtra("questoes",questaoArrayList);
                    startActivity(intent);
                }

                if(i == 4){
                    ArrayList<Questao> questaoArrayList = new ArrayList<Questao>();
                    Questao questao1 = new Questao("qual significado desse sinal?","adição","subtração","multiplicação","divisão", "adição" ,"https://signum.s3-us-west-2.amazonaws.com/Adicao_traducao.mp4"  );
                    questaoArrayList.add(questao1);
                    Questao questao2 = new Questao("Qual a tradução da frase a seguir?","9 é um número natural","9 é um número real","9 é faz parte do conjunto dos racionais","9 faz parte dos conjuntos dos reais", "9 faz parte dos conjuntos dos reais" , "https://signum.s3-us-west-2.amazonaws.com/Adicao_traducao.mp4"  );
                    questaoArrayList.add(questao2);


                    Resumo resumo = new Resumo("imagem_composta_inversa",
                            "Função Composta\n" +
                                    "\n" +
                                    "A função composta, também chamada de função de função, é um tipo de função matemática que combina duas ou mais variáveis.\n" +
                                    "Sendo assim, ela envolve o conceito de proporcionalidade entre duas grandezas, e que ocorre por meio de uma só função.\n" +
                                    "Dada uma função f (f: A → B) e uma função g (g: B → C), a função composta de g com f é representada por gof. Já a função composta de f com g é representada por fog.\n" +
                                    "\n" +
                                    "fog (x) = f(g(x))\n" +
                                    "gof (x) = g(f(x))\n" +
                                    "\n" +
                                    "\n" +
                                    "Note que nas funções compostas as operações entre as funções não são comutativas. Ou seja, fog ≠ gof.\n" +
                                    "Assim, para resolver uma função composta aplica-se uma função no domínio de outra função. E, substitui-se a variável x por uma função.\n" +
                                    "Exemplo\n" +
                                    "Determine o gof(x) e fog(x) das funções f(x) = 2x + 2 e g(x) = 5x.\n" +
                                    "gof(x) = g[f(x)] = g(2x+2) = 5(2x+2) = 10x + 10\n" +
                                    "fog(x) = f[g(x)] = f(5x) = 2(5x) + 2 = 10x + 2\n" +
                                    "\n" +
                                    "Função Inversa\n" +
                                    "A função inversa é um tipo de função bijetora (sobrejetora e injetora). Isso porque os elementos de uma função A possui um elemento correspondente de uma função B.\n" +
                                    "Sendo assim, é possível trocar os conjuntos e associar cada elemento de B com os de A.\n" +
                                    "A função inversa f -1 é dada pela lei:\n" +
                                    "y = 2x – 1\n" +
                                    "y +1 = 2x\n" +
                                    "x = y + 1/2\n",
                            "Função Composta e Inversa");

                    Intent intent = new Intent(view.getContext(), ResumoActivity.class);
                    intent.putExtra("Resumo", resumo);
                    intent.putParcelableArrayListExtra("questoes",questaoArrayList);
                    startActivity(intent);
                }

            }
        });

    }
}

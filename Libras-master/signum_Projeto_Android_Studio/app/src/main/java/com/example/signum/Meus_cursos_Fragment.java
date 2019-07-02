package com.example.signum;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.Random;

public class Meus_cursos_Fragment extends Fragment {


    String[] alternativasConjunto = {"adição","subtração", "multiplicação", "divisão", "sinal positivo", "sinal negativo",
            "Conjunto irracional", "Conjunto racional", "Conjunto dos naturais", "Conjunto dos reais", "conjunto dos inteiros",
            "intervalo fechado", "intervalo aberto", "intervalo semi-aberto", "subconjunto"};
    String[] alternativasFuncoes = {"Função crescente", "dominio da função", "função ímpar", "função par", "função nem ímpar nem par",
            "função de primeiro grau", "função de segundo grau", "funções decrescentes", "grafico de uma função", "imagem da função",
            "plano carteseano"};
    String[] alternativasTrigonometricas = {"arcos angulos", "circulo trigonometrico", "dominio da função cosseno",
            "dominio da função seno", "função seno", "função cosseno",
            "função tangente", "propriedades trigonometricas", "periodo", "relações trigonometricas"};
    String[] alternativasExponenciais = {"definição de função exponencial", "inversões exponenciais", "raiz em funções exponenciais",
            "variaveis logaritmicas", "mutiplicação", "frações exponenciais"};
    String[] alternativasCompostasEInversas = {"definição Funções compostas",
            "sinal função seno", "sinal função cosseno", "variaveis logaritmicas", "inversões exponenciais"};

    String[] alternativas = {"", "", "", ""};


    public String[] randomizer (String alternativaCorreta,String[] vetor)
    {
        String[] questoes = {"","","",""};
        String[] copiaVetor = vetor;
        Random rand = new Random();
        String alternativaEmPotencial;
        int n = rand.nextInt(4);
        questoes[n] = alternativaCorreta;
        for (int i=0; i<3; ) {
            n = rand.nextInt(copiaVetor.length);
            alternativaEmPotencial = copiaVetor[n];
            if (questoes[0] != alternativaEmPotencial &&  questoes[1] != alternativaEmPotencial
                    && questoes[2] != alternativaEmPotencial && questoes[3] != alternativaEmPotencial){
                i++;
                for (int j=0; j<4 ; j++){
                    if (questoes[j] == ""){
                        questoes[j] = alternativaEmPotencial;
                        break;
                    }
                }
            }
        }
        return questoes;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_meus_cursos, container, false);

        final String[] video_str = {"Conjuntos", "funções", "funções trigonometricas", "funções exponenciais e logaritmicas"
                ,"funções compostas e inversas"};


        ListView listView = (ListView) view.findViewById(R.id.listadostreinamentos);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(view.getContext(), android.R.layout.simple_list_item_1, video_str);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(i == 0)
                {
                    ArrayList<Questao> questaoArrayList = new ArrayList<Questao>();
                    alternativas = randomizer("Um conjunto é uma coleção de objetos", alternativasConjunto);
                    Questao questao1 = new Questao("Pergunta: qual a tradução dos sinais acima?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], "Um conjunto é uma coleção de objetos","https://signum.s3-us-west-2.amazonaws.com/conjunto_dos_numeros_reais/Conjunto_ser_colecao_objeto_definicao.mp4");
                    questaoArrayList.add(questao1);
                    alternativas = randomizer("adição", alternativasConjunto);
                    Questao questao2 = new Questao("Qual o significado do vídeo acima?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], "adição","https://signum.s3-us-west-2.amazonaws.com/conjunto_dos_numeros_reais/adicao1.mp4");
                    questaoArrayList.add(questao2);
                    alternativas = randomizer("Conjunto irracional", alternativasConjunto);
                    Questao questao3 = new Questao("Que tipo de conjunto o vídeo acima está descrevendo?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], "Conjunto irracional","https://signum.s3-us-west-2.amazonaws.com/conjunto_dos_numeros_reais/Conjuntos_Irracionais.mp4");
                    questaoArrayList.add(questao3);
                    alternativas = randomizer("subtração", alternativasConjunto);
                    Questao questao4 = new Questao("Qual o significado do vídeo a seguir?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], "subtração","https://signum.s3-us-west-2.amazonaws.com/conjunto_dos_numeros_reais/subtracao.mp4");
                    questaoArrayList.add(questao4);
                    alternativas = randomizer("Conjunto Natural", alternativasConjunto);
                    Questao questao5 = new Questao("Que tipo de conjunto o vídeo acima está descrevendo?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], "Conjunto Natural","https://signum.s3-us-west-2.amazonaws.com/conjunto_dos_numeros_reais/conjuntosnaturais.mp4");
                    questaoArrayList.add(questao5);
                    Questao questao6 = new Questao("Qual o significado do sinal acima?","Um conjunto é uma coleção de objetos","Um conjunto é uma coleção de números naturais","O objeto de um conjunto se chama subconjunto","O objeto de um conjunto se chama elemento", "O objeto de um conjunto se chama elemento" , "https://signum.s3-us-west-2.amazonaws.com/conjunto_dos_numeros_reais/objeto_conjunto_chamar_elemento_definicao.mp4"  );
                    questaoArrayList.add(questao6);
                    alternativas = randomizer("intervalo aberto", alternativasConjunto);
                    Questao questao7 = new Questao("Qual tipo de intervalo o vídeo acima está descrevendo?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], "intervalo aberto","https://signum.s3-us-west-2.amazonaws.com/conjunto_dos_numeros_reais/intervaloaberto.mp4");
                    questaoArrayList.add(questao7);
                    alternativas = randomizer("divisão", alternativasConjunto);
                    Questao questao8 = new Questao("Qual o significado do vídeo acima?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], "divisão","https://signum.s3-us-west-2.amazonaws.com/conjunto_dos_numeros_reais/adicao1.mp4");
                    questaoArrayList.add(questao8);
                    alternativas = randomizer("conjunto dos inteiros", alternativasConjunto);
                    Questao questao9 = new Questao("Que tipo de conjunto o vídeo acima está descrevendo?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], "conjunto dos inteiros","https://signum.s3-us-west-2.amazonaws.com/conjunto_dos_numeros_reais/conjuntosinteiros.MP4");
                    questaoArrayList.add(questao9);
                    alternativas = randomizer("intervalo fechado", alternativasConjunto);
                    Questao questao10 = new Questao("Qual tipo de intervalo o vídeo acima está descrevendo?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], "intervalo fechado","https://signum.s3-us-west-2.amazonaws.com/conjunto_dos_numeros_reais/intervalo_fechado_traducao.mp4");
                    questaoArrayList.add(questao10);

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

                    ArrayList<Questao> questaoArrayList = new ArrayList<Questao>();
                    alternativas = randomizer("Função crescente", alternativasFuncoes);
                    Questao questao1 = new Questao("Os sinais acima estão se referindo a qual conceito matematico?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], "Função crescente","https://signum.s3-us-west-2.amazonaws.com/funcoes/funcoes_crescentes.MP4");
                    questaoArrayList.add(questao1);
                    alternativas = randomizer("dominio da função", alternativasFuncoes);
                    Questao questao2 = new Questao("Os sinais acima estão se referindo a qual conceito matematico?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], "dominio da função","https://signum.s3-us-west-2.amazonaws.com/funcoes/dominio_da_funcao.MP4");
                    questaoArrayList.add(questao2);
                    alternativas = randomizer("função ímpar", alternativasFuncoes);
                    Questao questao3 = new Questao("Os sinais acima estão se referindo a qual conceito matematico?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], "função ímpar","https://signum.s3-us-west-2.amazonaws.com/funcoes/funcao_impar.MP4");
                    questaoArrayList.add(questao3);
                    alternativas = randomizer("função nem ímpar nem par", alternativasFuncoes);
                    Questao questao4 = new Questao("Os sinais acima estão se referindo a qual conceito matematico?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], "função nem ímpar nem par","https://signum.s3-us-west-2.amazonaws.com/funcoes/funcao_nem_par_nem_impar.MP4");
                    questaoArrayList.add(questao4);
                    alternativas = randomizer("função de primeiro grau", alternativasFuncoes);
                    Questao questao5 = new Questao("Os sinais acima estão se referindo a qual conceito matematico?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], "função de primeiro grau","https://signum.s3-us-west-2.amazonaws.com/funcoes/funcao_primeiro_grau.MP4");
                    questaoArrayList.add(questao5);
                    alternativas = randomizer("função de segundo grau", alternativasConjunto);
                    Questao questao6 = new Questao("Os sinais acima estão se referindo a qual conceito matematico?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], "função de segundo grau","https://signum.s3-us-west-2.amazonaws.com/funcoes/funcao_segundo_grau.MP4");
                    questaoArrayList.add(questao6);
                    alternativas = randomizer("grafico de uma função", alternativasFuncoes);
                    Questao questao7 = new Questao("Os sinais acima estão se referindo a qual conceito matematico?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], "grafico de uma função","https://signum.s3-us-west-2.amazonaws.com/funcoes/grafico_de_uma_funcao.MP4");
                    questaoArrayList.add(questao7);
                    alternativas = randomizer("imagem da função", alternativasFuncoes);
                    Questao questao8 = new Questao("Os sinais acima estão se referindo a qual conceito matematico?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], "imagem da função","https://signum.s3-us-west-2.amazonaws.com/funcoes/imagem_da_funcao.MP4");
                    questaoArrayList.add(questao8);
                    alternativas = randomizer("plano carteseano", alternativasFuncoes);
                    Questao questao9 = new Questao("Os sinais acima estão se referindo a qual conceito matematico?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], "plano carteseano","https://signum.s3-us-west-2.amazonaws.com/funcoes/plano_cartesiano.MP4");
                    questaoArrayList.add(questao9);
                    alternativas = randomizer("função par", alternativasFuncoes);
                    Questao questao10 = new Questao("Os sinais acima estão se referindo a qual conceito matematico?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], "função par","https://signum.s3-us-west-2.amazonaws.com/funcoes/funcao_par.MP4");
                    questaoArrayList.add(questao10);



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
                    ArrayList<Questao> questaoArrayList = new ArrayList<Questao>();
                    alternativas = randomizer(alternativasTrigonometricas[0], alternativasTrigonometricas);
                    Questao questao1 = new Questao("Os sinais acima estão se referindo a qual conceito matematico?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], alternativasTrigonometricas[0],"https://signum.s3-us-west-2.amazonaws.com/funcoes_trigonometricas/arcos_angulos.MP4");
                    questaoArrayList.add(questao1);
                    alternativas = randomizer(alternativasTrigonometricas[1], alternativasTrigonometricas);
                    Questao questao8 = new Questao("Os sinais acima estão se referindo a qual conceito matematico?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], alternativasTrigonometricas[1],"https://signum.s3-us-west-2.amazonaws.com/funcoes_trigonometricas/circulo_trigonometrico.MP4");
                    questaoArrayList.add(questao8);
                    alternativas = randomizer(alternativasTrigonometricas[2], alternativasTrigonometricas);
                    Questao questao2 = new Questao("Os sinais acima estão se referindo a qual conceito matematico?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], alternativasTrigonometricas[2],"https://signum.s3-us-west-2.amazonaws.com/funcoes_trigonometricas/dominio_funcao_cosseno.MP4");
                    questaoArrayList.add(questao2);
                    alternativas = randomizer(alternativasTrigonometricas[3], alternativasTrigonometricas);
                    Questao questao3 = new Questao("Os sinais acima estão se referindo a qual conceito matematico?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], alternativasTrigonometricas[3],"https://signum.s3-us-west-2.amazonaws.com/funcoes_trigonometricas/dominio_funcao_seno.MP4");
                    questaoArrayList.add(questao3);
                    alternativas = randomizer(alternativasTrigonometricas[4], alternativasTrigonometricas);
                    Questao questao4 = new Questao("Os sinais acima estão se referindo a qual conceito matematico?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], alternativasTrigonometricas[4],"https://signum.s3-us-west-2.amazonaws.com/funcoes_trigonometricas/funcao_seno.MP4");
                    questaoArrayList.add(questao4);
                    alternativas = randomizer(alternativasTrigonometricas[5], alternativasTrigonometricas);
                    Questao questao5 = new Questao("Os sinais acima estão se referindo a qual conceito matematico?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], alternativasTrigonometricas[5],"https://signum.s3-us-west-2.amazonaws.com/funcoes_trigonometricas/funcao_cosseno.MP4");
                    questaoArrayList.add(questao5);
                    alternativas = randomizer(alternativasTrigonometricas[6], alternativasTrigonometricas);
                    Questao questao6 = new Questao("Os sinais acima estão se referindo a qual conceito matematico?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], alternativasTrigonometricas[6],"https://signum.s3-us-west-2.amazonaws.com/funcoes_trigonometricas/funcao_tangente.MP4");
                    questaoArrayList.add(questao6);
                    alternativas = randomizer(alternativasTrigonometricas[7], alternativasTrigonometricas);
                    Questao questao7 = new Questao("Os sinais acima estão se referindo a qual conceito matematico?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], alternativasTrigonometricas[7],"https://signum.s3-us-west-2.amazonaws.com/funcoes_trigonometricas/propriedades_trigonometricas.MP4");
                    questaoArrayList.add(questao7);
                    alternativas = randomizer(alternativasTrigonometricas[8], alternativasTrigonometricas);
                    Questao questao9 = new Questao("Os sinais acima estão se referindo a qual conceito matematico?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], alternativasTrigonometricas[8],"https://signum.s3-us-west-2.amazonaws.com/funcoes_trigonometricas/periodo.MP4");
                    questaoArrayList.add(questao9);
                    alternativas = randomizer(alternativasTrigonometricas[9], alternativasTrigonometricas);
                    Questao questao10 = new Questao("Os sinais acima estão se referindo a qual conceito matematico?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], alternativasTrigonometricas[9],"https://signum.s3-us-west-2.amazonaws.com/funcoes_trigonometricas/relacoes_trigonometricas.MP4");
                    questaoArrayList.add(questao10);


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

                    alternativas = randomizer(alternativasExponenciais[0], alternativasExponenciais);
                    Questao questao0 = new Questao("Os sinais acima estão se referindo a qual conceito matematico?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], alternativasExponenciais[0],"https://signum.s3-us-west-2.amazonaws.com/funcoes_exponenciais_e_logaritmicas/definicao_exponencial.MP4");
                    questaoArrayList.add(questao0);
                    alternativas = randomizer(alternativasExponenciais[1], alternativasExponenciais);
                    Questao questao1 = new Questao("Os sinais acima estão se referindo a qual conceito matematico?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], alternativasExponenciais[1],"https://signum.s3-us-west-2.amazonaws.com/funcoes_exponenciais_e_logaritmicas/inversoes_exponenciais.MP4");
                    questaoArrayList.add(questao1);
                    alternativas = randomizer(alternativasExponenciais[2], alternativasExponenciais);
                    Questao questao2 = new Questao("Os sinais acima estão se referindo a qual conceito matematico?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], alternativasExponenciais[2],"https://signum.s3-us-west-2.amazonaws.com/funcoes_exponenciais_e_logaritmicas/raizes_em_funcoes_exponenciais.MP4");
                    questaoArrayList.add(questao2);
                    alternativas = randomizer(alternativasExponenciais[3], alternativasExponenciais);
                    Questao questao3 = new Questao("Os sinais acima estão se referindo a qual conceito matematico?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], alternativasExponenciais[3],"https://signum.s3-us-west-2.amazonaws.com/funcoes_exponenciais_e_logaritmicas/variaiveis_logaritmicas.MP4");
                    questaoArrayList.add(questao3);
                    alternativas = randomizer(alternativasExponenciais[4], alternativasExponenciais);
                    Questao questao4 = new Questao("Os sinais acima estão se referindo a qual conceito matematico?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], alternativasExponenciais[4],"https://signum.s3-us-west-2.amazonaws.com/funcoes_exponenciais_e_logaritmicas/multiplicacao.MP4");
                    questaoArrayList.add(questao4);
                    alternativas = randomizer(alternativasExponenciais[5], alternativasExponenciais);
                    Questao questao5 = new Questao("Os sinais acima estão se referindo a qual conceito matematico?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], alternativasExponenciais[5],"https://signum.s3-us-west-2.amazonaws.com/funcoes_exponenciais_e_logaritmicas/fracoes_exponenciais.MP4");
                    questaoArrayList.add(questao5);


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

                    alternativas = randomizer(alternativasCompostasEInversas[0], alternativasCompostasEInversas);
                    Questao questao0 = new Questao("Os sinais acima estão se referindo a qual conceito matematico?",alternativas[0],alternativas[1],alternativas[2],alternativas[3], alternativasCompostasEInversas[0],"https://signum.s3-us-west-2.amazonaws.com/funcoes_compostas_e_inversas/definicao_funcao_composta.MP4");
                    questaoArrayList.add(questao0);


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

        return view;
    }


}

/*
Nome do aluno: Diogo Oliveira Neiss
Número de matrícula: 649651
Turno: manhã
Nome do professor: Alexei Machado
*/


import java.util.Scanner;

public class Invictos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // contar quantos jogos

        int totalJogos = input.nextInt();

        input.nextLine();

        // array pra armazenar os resultados dos jogos
        int[] partidas = new int[totalJogos];



        for (int i = 0; i < totalJogos; i++) {

            String rodada = input.nextLine();

            // cortar a string inserida em uma temporaria,pelo x, para fins de comparação. Se o item [0] for maior ou igual que o [1] o time nao perdeu

            String[] temp = rodada.trim().split("x");

            // preencher o array com 1, para vitoria ou empate, e -1, para derrota

            if (Integer.parseInt(temp[0]) >= Integer.parseInt(temp[1]))
                partidas[i] = 1;

            else
                partidas[i] = -1;
        }


        // chamada para a funcao sequencia vitorias e armazenamento do valor de retorno em "contador"
        int contador = sequenciaVitorias(partidas);

        jogosDaSequencia(partidas, contador);

    }
    public static int sequenciaVitorias (int[] array){

        // a funcao serve para contar a maior sequencia invicta

        int contador = 1;

        int MaiorSequencia = 1;

        boolean estaEmSequencia = true;

        for (int i = 1; i < array.length; i++) {


            // se a anterior for derrota e a atual nao vitoria, significa que uma sequencia invicta pode comecar
            if(array[i-1] != 1 && array[i] == 1){
                estaEmSequencia = true;
                contador = 1;
            }

            // se esta em sequencia o contador incrementa

            else if ((array[i-1] == 1 && array[i] == 1) && estaEmSequencia){
                contador++;
            }

            // se for encontrado derrota o time nao esta mais em sequencia
            if (array[i] != 1){
                estaEmSequencia = false;

                // caso hajam multiplas sequencias, a variavel MaiorSequencia armazena a maior dessas sequencias
                if (contador > MaiorSequencia)
                    MaiorSequencia = contador;
        }


        }

        System.out.println(MaiorSequencia);

        // retorna a MaiorSequencia para uso na outra funcao
        return MaiorSequencia;


    }

    public static void jogosDaSequencia(int[] array, int contador){


        boolean sequenciaEncontrada = false;

        int j = 0;
        int buscador = 0;
        int inicio= 0;
        int fim = array.length -1;



        while (!sequenciaEncontrada && j < array.length){
            // só há a sequencia desejada se o buscador for do tamanho exato da MaiorSequencia


            if (array[j] == 1)
                buscador++;

            else
                buscador = 0;

            if (buscador == contador){
                fim = j;
                inicio = j + 1 - buscador;

                // encerra a busca
                sequenciaEncontrada = true;
            }

            j++;

        }

        // como arrays começam em 0, é adicionado 1 a cada variavel, para que a 1a partida seja a 1a e nao a zerésima.
        System.out.println((inicio+1) +" "+(fim+1));



    }




}

// retornar numero de partidas invicto
// primeira partida invicta e ultima invicta

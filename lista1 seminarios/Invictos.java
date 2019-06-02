import java.util.Scanner;

public class Invictos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int totalJogos = input.nextInt();

        input.nextLine();

        int[] partidas = new int[totalJogos];

        for (int i = 0; i < totalJogos; i++) {

            String rodada = input.nextLine();

            String[] temp = rodada.trim().split("x");

            if (Integer.parseInt(temp[0]) > Integer.parseInt(temp[1]))
                partidas[i] = 1;

            else if (Integer.parseInt(temp[0]) == Integer.parseInt(temp[1]))
                partidas[i] = 0;
            else
                partidas[i] = -1;
        }

        int contador = sequenciaVitorias(partidas);

        jogosDaSequencia(partidas, contador);

    }
    public static int sequenciaVitorias (int[] array){

        int contador = 1;

        int MaiorSequencia = 1;

        boolean estaEmSequencia = true;

        for (int i = 1; i < array.length; i++) {

            if(array[i-1] != 1 && array[i] == 1){
                estaEmSequencia = true;
                contador = 1;
            }
            else if ((array[i-1] == 1 && array[i] == 1) && estaEmSequencia){
                contador++;
            }


            if (array[i] != 1){
                estaEmSequencia = false;

                if (contador > MaiorSequencia)
                    MaiorSequencia = contador;
        }


        }

        System.out.println(MaiorSequencia);

        return MaiorSequencia;


    }

    public static void jogosDaSequencia(int[] array, int contador){


        boolean sequenciaEncontrada = false;

        int j = 0;
        int buscador = 0;
        int inicio= 0;
        int fim = array.length -1;

        while (!sequenciaEncontrada && j < array.length){

            if (array[j] == 1)
                buscador++;

            else if (array[j] != 1)
                buscador = 0;

            if (buscador == contador){
                fim = j;
                inicio = j - buscador;

                sequenciaEncontrada = true;
            }

        }

        System.out.println((inicio+1) +" "+(fim+1));



    }




}

// retornar numero de partidas invicto
// primeira partida invicta e ultima invicta

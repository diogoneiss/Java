/*
Nome do aluno: Diogo Oliveira Neiss
Número de matrícula: 649651
Turno: manhã
Nome do professor: Alexei Machado
*/


import java.util.Scanner;


public class Ordem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       // Pegar o tamanho

        int tamanho = input.nextInt();

        while (tamanho < 2 || tamanho > 50){
            tamanho = input.nextInt();
        }


        // esse next line serve pra nao pegar linha vazia do enter
        input.nextLine();

        // string inserida por espaços

        String numeros = input.nextLine();


        //cortar whitespaces e tirar espacos desnecessários com o trim()

        String[] arrayStrings = numeros.trim().split("\\s+");

        int[] arrayNum = new int[arrayStrings.length];

        // converter a string [i] em int [i]

        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = Integer.parseInt(arrayStrings[i]);
        }


        // numero de testes


        int testes = input.nextInt();

        // armazenar os testes em um array de strings

       String[] combinacoesTestes = new String[testes];

        // ler whitespace e jogar fora
        input.nextLine();

        // ler as combinacoes em posicoes [i]

        for (int i = 0; i < testes; i++) {
            combinacoesTestes[i] = input.nextLine();
        }



        // arrmazenar em um array temporario o i-esimo elemento, e dar split dos pares


        for (int i = 0; i < testes; i++) {
            String[] temp = new String[2];

            temp = combinacoesTestes[i].split("\\s+");

            int inicial = Integer.parseInt(temp[0]);
            int fim = Integer.parseInt(temp[1]);

            // chamar a funcao com os valores, já cortados.
            estaOrdenado(arrayNum, inicial, fim);

        }



    }

    public static void estaOrdenado(int[] array, int inicial, int fim){
        // funcao para conferir se esta ordenado

        boolean ordenado = true;

        int i = inicial;

        while(ordenado && i < fim) {

            // se o proximo for menor que o anterior, nao esta ordenado
            if (array[i] > array[i+1])
                ordenado = false;

            i++;
        }

        if (ordenado)
            System.out.println("SIM");
        else
            System.out.println("NAO");
    }

}

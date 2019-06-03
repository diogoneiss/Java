/*
Nome do aluno: Diogo Oliveira Neiss
Número de matrícula: 649651
Turno: manhã
Nome do professor: Alexei Machado
*/

import java.util.Scanner;

public class Primos{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array;

        int tamanho;


        // pegar o tamanho
        do {

            tamanho = input.nextInt();

        } while (tamanho < 1 || tamanho > 100);

        array = new int[tamanho];

        // armazenar cada int em uma linha i
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        // chamada da funcao que printa na tela de acordo com ser primo ou nao
        varrerArray(array);

    }


    public static boolean ehPrimo(int num){


        // 1 nao e primo
        if (num == 1)
            return false;

        boolean serPrimo = true;

        // 2 e primo e a primeira verificacao de divisibilidade deve ser feita por ele
        int i = 2;

        while(serPrimo && i < num){

            // se o resto por x for 0, entao x é divisor de num, logo, num nao é primo
            if(num % i == 0)
                serPrimo = false;

            i++;
        }

        return serPrimo;
    }

    public static void varrerArray(int array[]){
        // a funcao varre o array e mostra os resultados de acordo com ser primo ou nao, chamando a funcao ehPrimo()


        for (int i = 0; i < array.length; i++) {

            if (ehPrimo(array[i]))
                System.out.println("SIM");
            else
                System.out.println("NAO");

        }
    }



}


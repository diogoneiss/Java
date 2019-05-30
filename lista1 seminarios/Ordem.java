import java.util.Scanner;

/*
A entrada contém um número inteiro na primeira linha, determinando o tamanho N
do conjunto (2 ? N ? 50). A seguir, uma linha com os números que compõem o
conjunto, na ordem do conjunto, separados por espaço. Cada número é um inteiro
positivo válido. Logo depois, um número K (1 ? K ? 10) indicando a quantidade de
testes que serão feitos sobre a ordem.
 */


public class Ordem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tamanho = input.nextInt();

        // cortar a string inserida em array de strings e, em seguida, de floats

        String numeros = input.next();


        String[] tempArray = numeros.split("\\s+");
        System.out.println(tempArray);


        int[] intArray = new int[tempArray.length];


        for (int i = 0; i < tempArray.length; i++) {

            String numeroEmString = tempArray[i];

            intArray[i] = Integer.parseInt(numeroEmString);
            System.out.println(intArray[i]);

        }


    }

}

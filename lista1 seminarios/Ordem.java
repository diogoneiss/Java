import java.util.Scanner;

/*
A entrada cont�m um n�mero inteiro na primeira linha, determinando o tamanho N
do conjunto (2 ? N ? 50). A seguir, uma linha com os n�meros que comp�em o
conjunto, na ordem do conjunto, separados por espa�o. Cada n�mero � um inteiro
positivo v�lido. Logo depois, um n�mero K (1 ? K ? 10) indicando a quantidade de
testes que ser�o feitos sobre a ordem.
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

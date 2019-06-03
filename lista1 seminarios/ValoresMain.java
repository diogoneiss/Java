/*
Nome do aluno: Diogo Oliveira Neiss
Número de matrícula: 649651
Turno: manhã
Nome do professor: Alexei Machado
*/

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class ValoresMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array;

        int tamanho;

        // ler tamanho
        do {

            tamanho = input.nextInt();

        } while (tamanho < 2 || tamanho > 100);

        array = new int[tamanho];

        // armazenar um inteiro por linha
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();

        }

        int soma = 0;

        // somar todos os pares na variavel soma
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                soma += array[i];
        }

        // calcular o maior elemento
        int maior = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior)
                maior = array[i];

        }

        // somar TODOS os elementos do array, nao so os pares
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];

        }

        // dividir com coerção de tipos
        float media = (float) total / ((float) array.length);


        // calcular os menores que a media
        int menores = 0;

        for (int i = 0; i < array.length; i++) {
            if ((float) array[i] < media)
                menores++;
        }


        // colocar a virgula do verde e duas casas decimais de precisao
        DecimalFormat df = new DecimalFormat("#.##", DecimalFormatSymbols.getInstance(Locale.ITALY));


        // printar os resultados
        System.out.println(soma);
        System.out.println(maior);
        System.out.println(df.format(media));
        System.out.println(menores);

    }


}


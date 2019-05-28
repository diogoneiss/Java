import java.util.Scanner;

public class Valores {

    public static void main(String[] args) {

        float[] conjuntoDados;

        int TAM = definirTamanho();

        conjuntoDados = new float[TAM];

        preencherArranjo(conjuntoDados);

        float media = mediaElementos(conjuntoDados);


        System.out.println(somaPares(conjuntoDados));
        System.out.println(maiorElemento(conjuntoDados));
        System.out.println(media);
        System.out.println(menoresMedia(conjuntoDados, media));
    }



    private static float somaPares(float[] array){

        float soma = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                soma += array[i];
        }

        return soma;
    }

    private static float maiorElemento(float[] array){

       float maior = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior)
                maior = array[i];

        }

        return maior;
    }

    private static float mediaElementos(float[] array){

        float total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        float media = total /((float) array.length);

        return media;

    }

    private static int menoresMedia(float[] array, float media){

        int c = 0;

        for (int i = 0; i < array.length;   i++) {
            if (array[i] < media)
                c++;

        }

        return c;
    }

    private static void preencherArranjo(float[] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            if (input.hasNextFloat())
                array[i] = input.nextFloat();
        }


    }

    private static int definirTamanho(){

        Scanner input = new Scanner(System.in);

        int tamanho;

        do {

            tamanho = input.nextInt();

        }while (tamanho < 2 || tamanho >100);

        return tamanho;

    }
}

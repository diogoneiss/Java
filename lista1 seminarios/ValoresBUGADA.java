import java.util.Scanner;

public class ValoresBUGADA {

    public static void main(String[] args) {

        int[] conjuntoDados;

        int TAM = definirTamanho();

        conjuntoDados = new int[TAM];

        preencherArranjo(conjuntoDados);

        float media = mediaElementos(conjuntoDados);


        System.out.println(somaPares(conjuntoDados));
        System.out.println(maiorElemento(conjuntoDados));
        System.out.println(media);
        System.out.println(menoresMedia(conjuntoDados, media));
    }



    private static int somaPares(int[] array){

        int soma = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                soma += array[i];
        }

        return soma;
    }

    private static int maiorElemento(int[] array){

       int maior = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior)
                maior = array[i];

        }

        return maior;
    }

    private static float mediaElementos(int[] array){

        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        float media = (float) total /((float) array.length);

        return media;

    }

    private static int menoresMedia(int[] array, float media){

        int c = 0;

        for (int i = 0; i < array.length;   i++) {
            if ((float)array[i] < media)
                c++;

        }

        return c;
    }

    private static void preencherArranjo(int[] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            if (input.hasNextInt())
                array[i] = input.nextInt();
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

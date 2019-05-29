import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class ValoresMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int[] array;

        int tamanho;

        do {

            tamanho = input.nextInt();

        } while (tamanho < 2 || tamanho > 100);

        array = new int[tamanho];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();

        }

        int soma = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                soma += array[i];
        }

        int maior = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior)
                maior = array[i];

        }

        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];

        }

        float media = (float) total / ((float) array.length);


        int menores = 0;

        for (int i = 0; i < array.length; i++) {
            if ((float) array[i] < media)
                menores++;
        }

        DecimalFormat df = new DecimalFormat("#.##", DecimalFormatSymbols.getInstance(Locale.ITALY));

        System.out.println(soma);
        System.out.println(maior);
        System.out.println(df.format(media));
        System.out.println(menores);

    }


}


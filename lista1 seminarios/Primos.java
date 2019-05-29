import java.util.Scanner;

public class Primos{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array;

        int tamanho;

        do {

            tamanho = input.nextInt();

        } while (tamanho < 1 || tamanho > 100);

        array = new int[tamanho];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        varrerArray(array);

    }


    public static boolean ehPrimo(int num){

        if (num == 1)
            return false;

        boolean serPrimo = true;
        int i = 2;

        while(serPrimo && i < num){
            if(num % i == 0)
                serPrimo = false;

            i++;
        }

        return serPrimo;
    }

    public static void varrerArray(int array[]){

        for (int i = 0; i < array.length; i++) {

            if (ehPrimo(array[i]))
                System.out.println("SIM");
            else
                System.out.println("NAO");

        }
    }



}


import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args){

        /*

        Nome: Diogo Oliveira Neiss
        Prof: Fatima
        Turma: CC manhã

        Calcular o menor de indeterminados valores no teclado, até achar uma entrada negativa

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor, qualquer negativo para sair");

        int menor;

        int entrada;

        entrada = input.nextInt();

        // o primeiro menor sera a primeira entrada
        menor = entrada;


        // se a entrada for 0 sai do while

        while(entrada > 0){

            // substituir o menor caso a entrada seja menor

            if(entrada < menor)
                menor = entrada;

            System.out.println("Insira o valor, qualquer negativo para sair");

            entrada = input.nextInt();

        }

        // se o primeiro valor inserido for menor que zero, sequer entrará no loop
        if(menor < 0)
            System.out.println("Não houve menor valor válido.");

        else
            System.out.println("O menor valor inserido foi "+menor);
    }


}

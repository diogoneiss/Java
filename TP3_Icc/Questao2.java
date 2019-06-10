import java.util.Scanner;

public class Questao2 {

        /*
        Nome: Diogo Oliveira Neiss
        Prof: Fatima
        Turma: CC manhã

        Calcular a soma dos n primeiros inteiros
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira quantos numeros inteiros voce quer somar: ");

        int n = input.nextInt();

        // chamada do metodo dentro da funcao
        System.out.println(somaInteiros(n));

    }

    public static int somaInteiros(int n){

        int soma = 0;
        int anterior = 0;

        // considerando 0 como o primeiro inteiro

        for (int i = 1; i<n; i++){

            //incrementa o num e o soma ao total

            anterior++;
            soma += anterior;
        }

     return soma;

    }

}

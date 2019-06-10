import java.util.Scanner;

public class Questao3 {

     /*
        Nome: Diogo Oliveira Neiss
        Prof: Fatima
        Turma: CC manhã

        Calcular o fatorial de um numero
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Insira o numero que voce quer calcular o fatorial: ");
        int n = input.nextInt();

        // chamada do metodo dentro do println
        System.out.println(fatorial(n));
    }


    // metodo recursivo para calcular o fatorial

    public static int fatorial(int n){

        int saida;

        // caso base, fatorial de 0 e de 1 são iguais a 1
        if(n == 0 || n == 1)
            saida = 1;

        // os outros fatoriais seguem essa forma
        else
            saida = n*(fatorial(n-1));

        return saida;

    }
}

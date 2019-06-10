import java.util.Scanner;

public class Questao4 {

    /*
        Nome: Diogo Oliveira Neiss
        Prof: Fatima
        Turma: CC manhã

        Mostrar na tela n termos da serie 1 1/3 1/9
    */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira quantos termos da serie voce quer printar: ");
        int n = input.nextInt();

        termosIndividuais(n);

    }

    public static void printarNaTela(int n){

        // coloca na forma 3 ^ 1(x)
        System.out.printf("\t1/%d", n);

    }

    public static void termosIndividuais(int numero){

        double parametro;

        for (int i = 0; i < numero; i++) {
            // faz a potenciacao
            parametro = Math.pow(3, i);

            // chama a funcao que printa na tela de acordo com o formato especificado
            printarNaTela((int) parametro);
        }


    }

}

import java.util.Scanner;

/*
        Nome: Diogo Oliveira Neiss
        Prof: Fatima
        Turma: CC manhã
        Saber se uma string lida é um palindromo

*/

public class Questao5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a string, que será verificada se é um palíndromo.");

        //ler a string
        String stringInserida = input.nextLine();

        // remover whitespace
        stringInserida = stringInserida.replaceAll("\\s+","");

        //rodar a funcao

        if(verificarPalindromo(stringInserida))
            System.out.println("A string inserida é um palíndromo");
        else
            System.out.println("A String inserida NÃO é um palíndromo");
    }

    public static boolean verificarPalindromo(String frase){
        boolean ehPalindromo = true;

        String reverse = "";

        // concatenar de tras pra frente na string vazia
        for (int i = (frase.length()-1); i >= 0; i--) {
            reverse = reverse + frase.charAt(i);
        }

        if (!frase.equals(reverse))
            ehPalindromo = false;

        return ehPalindromo;

    }
}

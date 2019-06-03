/*
Nome do aluno: Diogo Oliveira Neiss
Número de matrícula: 649651
Turno: manhã
Nome do professor: Alexei Machado
*/


import java.util.Scanner;

public class Chocolate {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        int divisoes = input.nextInt();


        // pegar whitespace
        input.nextLine();

        // ler numero de pedacos
        String fracoes = input.nextLine();

        String[] arrayFracoes;

        // cortar string em array
        arrayFracoes = fracoes.split("\\s+");

        int total = 0;

        for (int i = 0; i < divisoes; i++) {
            // converter para int e somar
            total += Integer.parseInt(arrayFracoes[i]);
        }

        // O chocolate armazenado é sempre o total menos quantas divisoes foram feitas
        // ja que é selecionada sempre uma parte por divisao, logo, o numero de divisoes
        // menos o total de fracoes corresponde ao estoque

        System.out.println(total - divisoes);



    }


}

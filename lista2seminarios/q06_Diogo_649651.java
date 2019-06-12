// Questão: 06 BOTAS TROCADAS
// Nome completo do aluno: Diogo Oliveira Neiss
// Número de matrícula: 649651
// Turno: manhã
// Nome do professor: Alexei Machado
//

import java.util.Scanner;
import java.util.Arrays;

// O programa deve contar quantos pares de botas de tamanhos iguais para os dois pés são possíveis de serem formados.
// Para tal, usarei classes.
// A entrada será ordenada puramente para facilitar o laço de verificacao


public class q06_Diogo_649651{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int numEntradas;

        numEntradas = input.nextInt();

        //pega o newline
        input.nextLine();

        //Array de strings com as entradas;

        String[] conjuntoBotas = new String[numEntradas];

        for(int i = 0; i < numEntradas; i++){

            conjuntoBotas[i] = input.nextLine();

        }

        // ordena o array
        Arrays.sort(conjuntoBotas);

        int paresFormados = 0;
        String tamanhoAtual[];



        for (int i = 0; i < numEntradas; i++) {

            // corta o i-esimo item em duas strings, uma com nums e outra pé
            tamanhoAtual = conjuntoBotas[i].split("\\s+");

            int j = i+1;
            boolean achouPar = false;

            while (!achouPar && j < numEntradas){

                // se a string tem o mesmo numero que a bota E NAO tem o mesmo pé, há um par
                if (conjuntoBotas[j].contains(tamanhoAtual[0]) && !conjuntoBotas[j].contains(tamanhoAtual[1])){
                    paresFormados++;
                    achouPar = true;
                }

                j++;
            }
        }

        System.out.println(paresFormados);

    }




}
// Questão: 07 quadrado mágico
// Nome completo do aluno: Diogo Oliveira Neiss
// Número de matrícula: 649651
// Turno: manhã
// Nome do professor: Alexei Machado
//

// quadrado mágico = linhas, diagonais e colunas tem a mesma soma
// se for um quad magico invalido = output 0
// se for um quad magico = output soma

import java.util.Scanner;

public class q07_Diogo_649651 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ordem = input.nextInt();

        // array bidimencional do quadrado

        int[][] quadrado= new int[ordem][ordem];

        // vou criar um for dentro de um for pra armazenar em um array bidimencional os nums

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                quadrado[i][j] = input.nextInt();
            }
        }

        // printar o quadrado

        /*
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.printf("%d ",quadrado[i][j]);
            }
            System.out.print("\n");
        }
        */


        boolean ehMagico = true;

        int totalLinha = 0;
        int totalLinhaAnterior = 0;

        // calcular a soma de uma linha, para comparação

        for (int i = 0; i < ordem ; i++) {
            totalLinhaAnterior += quadrado[i][0];
        }

        // comparar e definir uma chave de busca (total linha anterior) para a proxima iteracao

        int i1 = 1;


        // comparacao de linhas
        while (i1 < ordem && ehMagico) {
            for (int j1 = 0; j1 < ordem; j1++) {
                totalLinha += quadrado[i1][j1];

            }
            //System.out.println("Total linha: " + totalLinha);

            if (totalLinha != totalLinhaAnterior)
                ehMagico = false;

            totalLinhaAnterior = totalLinha;
            totalLinha = 0;
            i1++;
        }

        // so continuar o codigo se for magico
        if (ehMagico){
            // somar colunas

            int totalColuna = 0;
            int totalColunaAnterior = 0;

            // calcular a soma de uma coluna, para comparação

            for (int j = 0; j < ordem ; j++) {
                totalColunaAnterior += quadrado[0][j];
            }

            // comparar e definir uma chave de busca (total coluna anterior) para a proxima iteracao

            int j2 = 1;


            // comparacao de colunas

            while (j2 < ordem && ehMagico) {
                for (int i = 0; i < ordem; i++) {
                    totalColuna += quadrado[i][j2];

                }

                //System.out.println("Total coluna: " + totalColuna);

                if (totalColuna != totalColunaAnterior)
                    ehMagico = false;

                totalColunaAnterior = totalColuna;
                totalColuna = 0;

                j2++;
            }
        }

        if (ehMagico){

            // somar as diagonais

            int totalDiagonal = 0;

            for (int j3 = 0; j3 < ordem; j3++) {
                totalDiagonal += quadrado[j3][j3];

            }
            if (totalDiagonal != totalLinhaAnterior)
                ehMagico = false;

        }



        // respostas

        if(ehMagico)
            System.out.println(totalLinhaAnterior);

        else
            System.out.println("0");

    }

}

// Questão: 06
// Nome completo do aluno: Diogo Oliveira Neiss
// Número de matrícula: 649651
// Turno: manhã
// Nome do professor: Alexei Machado
//

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
// O programa deve contar quantos pares de botas de tamanhos iguais para os dois pés são possíveis de serem formados.
// Para tal, usarei classes. 
// A entrada será ordenada, e serão criados objetos para cada tamanho de bota. Cada par E/D incrementará em 1 o contador do objeto.


public class q06_Diogo_649651{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int numEntradas;

    numEntradas = input.nextInt();

    //Array de strings com as entradas;
    
    String[] conjuntoBotas = new String[numEntradas];

    for(int i = 0; i < numEntradas; i++){
    
        conjuntoBotas[i] = input.nextLine();

    }

    Arrays.sort(conjuntoBotas);

    //arrays pra armazenar tams e pes

    String[] conjuntoTamanhos = new String[numEntradas];
    String[] conjuntoPes = new String[numEntradas];

    //Criar um array splitado com os tamanhos e, em outro array, no mesmo índice, o pé.

    String[] array = new String[2];
   
    for(int i = 0; i<numEntradas;i++){
  
    array = conjuntoBotas[i].split("\\s+");

    conjuntoTamanhos[i] = array[0];
    conjuntoPes[i] = array[1];


   } 

   for(int j = 0;j<numEntradas;j++){
       System.out.println(conjuntoBotas[j]);
   }
    //Criar os objetos 
    //Chamar os metodos
    //Somar os pares



    }




}

// Questão: 06
// Nome completo do aluno: Diogo Oliveira Neiss
// Número de matrícula: 649651
// Turno: manhã
// Nome do professor: Alexei Machado
//

import java.util.Scanner;

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
        conjuntoBotas[i] = conjuntoBotas[i].trim();

    }

    //Ordenar as entradas numericamente e contar quantas ocorrencias unicas de cada tipo;

    //Criar os objetos 
    //Chamar os metodos
    //Somar os pares



    }




}

class bota{
private int pesEsquerdos = 0;
private int pesDireitos = 0;

private int NumPares = 0;

public static void addEsquerdo(){

this.pesEsquerdos++;

}
public static void addDireito(){

this.pesDireitos++;

}
public static int paresFormados(){
    int numDireitos = this.pesDireitos;
    int numEsquerdos = this.pesEsquerdos;

      if(numDireitos > 0 && numEsquerdos > 0){

            int menor = numEsquerdos;

            if(numDireitos < menor)
                menor = numDireitos;


            return menor;

        }
      else
        return 0;  
}

}

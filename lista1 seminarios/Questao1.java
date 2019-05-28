import java.util.Scanner;


public class Questao1 {

	/*
	
	TAREFA
Leia N n�meros em um vetor de dimens�o informada na entrada. 
Para este vetor, responda, em cada linha: 

soma dos elementos de valor par; 
maior elemento do vetor; 
m�dia dos elementos; 
quantidade de elementos menores que a m�dia.

ENTRADA

A entrada cont�m um conjunto de teste que deve ser lido da entrada padr�o. 
A primeira linha cont�m um n�mero N ( 2 ? N ? 100 ). 
Este n�mero N representa a quantidade de n�meros a ser lida em seguida, 
sendo cada um destes n�meros um valor inteiro positivo v�lido e estando um em cada linha posterior.

SA�DA
Seu programa deve imprimir, na sa�da padr�o, uma resposta em cada linha: 
soma dos elementos de valor par; maior elemento do vetor; m�dia dos elementos; quantidade de elementos menores que a m�dia.

	*/


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float valores[];

        //System.out.print("Insira o tamanho: ");

        int TAM = input.nextInt();

        valores = new float[TAM];

        preencherArranjo(valores);


        System.out.println(somaPares(valores));
        System.out.println(maiorElemento(valores));
        System.out.println(mediaElementos(valores));
        System.out.println(menoresMedia(valores, mediaElementos(valores)));
    }

  

    public static float somaPares(float[] array){
        
        float soma = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                soma += array[i];
        }
        
     return soma;
    }

    public static float maiorElemento(float[] array){
        float maior = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior)
                maior = array[i];

        }

        return maior;
    }

    public static float mediaElementos(float[] array){
        float total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        float media = total /((float) array.length);

        return media;

    }

    public static int menoresMedia(float[] array, float media){

        int c = 0;

        for (int i = 0; i < array.length;   i++) {
            if (array[i] < media)
                c++;

        }

        return c;
    }

    public static void preencherArranjo(float[] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            //System.out.print("Insira o "+(i+1)+"o valor: ");
            array[i] = input.nextFloat();
        }


    }


}

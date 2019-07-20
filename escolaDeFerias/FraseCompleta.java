import java.util.Scanner;
import java.lang.Character;

public class FraseCompleta {

	public static void main(String[] args){

		System.out.print("Insira a string para verificar se é uma frase completa: ");
	
		Scanner input = new Scanner(System.in);

		String entrada;

		entrada = input.nextLine();

		System.out.println(entrada);

		//converter String para chararray, bem mais fácil de manipular

		char[] entradaChar = entrada.toCharArray();

		for (int i = 0; i < entrada.length(); i++) {

		
		}

		entrada = String.copyValueOf(entradaChar);

		System.out.println(entrada);
      
		input.close();
	
	}

	boolean temLetra(char[] frase, char letra){
		boolean haLetra = false;

		int tam = (frase.toString()).length();

		for(int i = 0; i <tam; i++){
			if(frase[i] == letra){
				haLetra = true;
				i = tam;
			}
		}

		return haLetra;
	}

	
	

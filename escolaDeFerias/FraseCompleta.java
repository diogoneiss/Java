 import java.util.Scanner;
import java.lang.Character;

public class FraseCompleta {

	public static void main(String[] args) {

		System.out.print("Insira a string para verificar se é uma frase completa: ");

		Scanner input = new Scanner(System.in);

		String entrada;

		entrada = input.nextLine();

		System.out.println(entrada);

		//converter String para chararray, bem mais fácil de manipular

		char[] entradaChar = entrada.toCharArray();

		int contador = 0;

		for (int i = 0x0061 ; i <= 0x007A; i++) {
			if(temLetra(entradaChar, i))
				contador++;
		}

		// ç
		if(temLetra(entradaChar, 0x00C7));
				contador++;

		System.out.println("Total de carachteres unicos: " +contador);

		printarResposta(contador);
		
		input.close();

	}

	static boolean temLetra(char[] frase, int codigo) {
		boolean haLetra = false;

		int tam = (frase.toString()).length();

		for (int i = 0; i < tam; i++) {

			if (Character.toLowerCase(frase[i]) == Character.toChar(codigo)) {
				haLetra = true;
				// sai do for
				i = tam;
			}
		}

		return haLetra;
	}

	static void printarResposta(int contador){
		if(contador == 26)
			System.out.println("A frase eh completa");
		else if(contador >= 13)
			System.out.println("A frase eh quase completa");
		else
			System.out.println("A frase nao eh completa");
		
	}
}

	
	

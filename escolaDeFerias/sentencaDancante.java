import java.util.Scanner;
import java.lang.Character;

public class SentencaDancante {

	public static void main(String[] args) {

		System.out.print("Insira a string para printar: ");

		Scanner input = new Scanner(System.in);

		String entrada;

		entrada = input.nextLine();

		System.out.println(entrada);

		char[] entradaChar = entrada.toCharArray();

		for (int i = 0; i < entrada.length(); i = i + 2) {


			// verifica se o char não é um espaço
			if (entradaChar[i] != ' ') {

				//se não está maiuscula se torna
				if (!Character.isUpperCase(entrada.charAt(i))) {

					//converte pra maisuculo

					entradaChar[i] = Character.toUpperCase(entradaChar[i]);
				}

				// nao dar array out of bounds 
				if (i + 1 < entrada.length()) {
					//vai pra lower case se nao estiver
					if (!Character.isLowerCase(entrada.charAt(i + 1))) {

						//converte o proximo, i+1, pra minusculo
						entradaChar[i + 1] = Character.toLowerCase(entradaChar[i + 1]);
					}
				}

			}

		}

		entrada = String.copyValueOf(entradaChar);

		System.out.println(entrada);

		input.close();

	}
}

	
	
	
	/*
	 *
	 * Criar método para retornar booleano se estiver em letra maiuscula
	*/



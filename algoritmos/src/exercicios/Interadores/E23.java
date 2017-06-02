package exercicios.Interadores;

import java.util.Scanner;

public class E23 {

	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);

		String texto;
		boolean verdade = false;

		System.out.println("Digite uma incrível palavra.");
		texto = k.nextLine().toLowerCase();

		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				verdade = true;
			}
		}
		if (verdade) {
			System.out.println("Você imprimiu uma palavra com vogal");
		} else {
			System.out.println("Você imprimiu uma palavra sem vogal");
		}
		// Verificar vogais nas palavras :D
	}
}

package exercicios.num2;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {

		int numLinhas;

		Scanner k = new Scanner(System.in);

		System.out.println("Vamos fazer uma pirâmide com números um.");
		System.out.println("Informe o número de linhas ");
		numLinhas = k.nextInt();

		for (int i = numLinhas; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(i + " ");
			}
			System.out.println(" ");
		}
	}
}

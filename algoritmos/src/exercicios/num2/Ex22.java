package exercicios.num2;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {

		int numLinhas;

		Scanner k = new Scanner(System.in);

		System.out.println("Vamos fazer uma pirâmide com números um.");
		System.out.println("Informe o número de linhas ");
		numLinhas = k.nextInt();

		for (int i = 0; i < numLinhas; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println(" ");
		}
	}
}

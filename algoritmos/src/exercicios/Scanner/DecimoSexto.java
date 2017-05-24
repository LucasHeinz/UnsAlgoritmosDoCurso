package exercicios.Scanner;

import java.util.Scanner;

public class DecimoSexto {

	private static Scanner k;

	public static void main(String[] args) {

		int numCaracter, numNums;
		char caracter;

		k = new Scanner(System.in);

		System.out.println("Quantos números deseja digitar ?");
		numNums = k.nextInt();

		for (int i = 0; i < numNums; i++) {
			System.out.println("Digite um número de 1 a 23");
			numCaracter = k.nextInt() + 64;

			caracter = (char) numCaracter;

			System.out.println(caracter);
		}

	}
}

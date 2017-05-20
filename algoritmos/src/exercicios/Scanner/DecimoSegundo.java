package exercicios.Scanner;

import java.util.Scanner;

public class DecimoSegundo {

	public static void main(String[] args) {

		int num1, num2, num3;
		double resultado;
		Scanner k = new Scanner(System.in);

		System.out.println("Informe um número inteiro :");
		num1 = k.nextInt();

		System.out.println("Informe outro número inteiro :");
		num2 = k.nextInt();

		System.out.println("Informe mais um número inteiro :");
		num3 = k.nextInt();

		resultado = (num1 * num3) + Math.pow(num2, 3);

		System.out.println(resultado);

		System.out.println("B.");
		if (resultado > 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		System.out.println("C.");
		if (resultado > 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println("D.");
		if (resultado > 10 || resultado < 100) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println("E.");
		if (resultado % 10 == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println("F.");
		if (resultado % 2 == 0 || resultado % 3 == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}
}

package exercicios.Scanner;

import java.util.Scanner;

public class DecimoTerceiro {

	public static void main(String[] args) {

		int num1, num2, num3, num4;
		boolean A, B;
		Scanner k = new Scanner(System.in);

		System.out.println("Informe o primeiro inteiro :");
		num1 = k.nextInt();

		System.out.println("Informe o segundo número inteiro :");
		num2 = k.nextInt();

		System.out.println("Informe o terceiro número inteiro :");
		num3 = k.nextInt();
		
		System.out.println("Informe o quarto número inteiro :");
		num4 = k.nextInt();
		
		System.out.println("A.");
		if ((num1 <= (num2 + num3)) && (num4 % 2 != 0 || num4 > 10)) {
			System.out.println("true");
			A = true;
		} else {
			System.out.println("false");
			A = false;
		}

		System.out.println("B.");
		if ((num1 + num2 + num3 + num4) % 10 == 0 || (num1 + num2 + num3 + num4) % 5 == 0 || num1 == 5
				|| (num1 + num2 + num3) > 100 && num1 > 0) {
			System.out.println("true");
			B = true;
		} else {
			System.out.println("false");
			B = false;
		}
		System.out.println("C.");
		if (A && B || (A && B) == false) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println("D.");
		if ((num1 + num2 + num3 + num4) > 10) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}
		System.out.println("E.");
		if (num1 > 10 || num3 > 0 || num2 + num4 ==0) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}

	}
}

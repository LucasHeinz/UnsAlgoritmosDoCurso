package exercicios.Scanner;

import java.util.Scanner;

public class DecimoOitavo {

	public static void main(String[] args) {

		int num, result1, result2;
		Scanner k = new Scanner(System.in);

		System.out.println("Informe um incrível número");
		num = k.nextInt();

		result1 = num - 5;
		System.out.println(result1);
		result2 = num - 3;
		System.out.println(result2);
		
		System.out.println(result1 + " e " + result2);
	}
}

package exercicios.Scanner;

import java.util.Scanner;

public class DecimoSetimo {

	public static void main(String[] args) {
		
		int num, result1, result2;
		Scanner k = new Scanner(System.in);
		
		System.out.println("Informe um incr�vel n�mero");
		num = k.nextInt();
		
		result1 = num + 5;
		System.out.println(result1);
		result2 = result1 + 5;
		System.out.println(result2);
	}
}

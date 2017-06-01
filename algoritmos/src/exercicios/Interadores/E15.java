package exercicios.Interadores;

import java.util.Scanner;

public class E15 {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		int num, num1 = 0;
		
		System.out.println("Digite um número");
		num = k.nextInt();
		
		while (num1 <= num) {
			System.out.println(num1);
			num1++;
		}
	}
}

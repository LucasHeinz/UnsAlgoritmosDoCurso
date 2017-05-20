package exercicios.num2;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Vamos formar uma lista com números");
		System.out.println("Informe um número inteiro, esse será o começo da lista :");
		num1 = k.nextInt();
		
		System.out.println("Informe outro número inteiro, esse será o último da lista: ");
		num2 = k.nextInt();
		
		while(num1 <= num2) {
			System.out.println(num1);
			num1++;
		}
	}
}

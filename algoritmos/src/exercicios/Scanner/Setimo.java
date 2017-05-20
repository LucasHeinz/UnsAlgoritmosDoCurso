package exercicios.Scanner;

import java.util.Scanner;

public class Setimo {

public static void main(String[] args) {
		
		int num1, num2;
		Scanner k = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro :");
		num1 = k.nextInt();
		
		System.out.println("Informe outro número inteiro :");
		num2 = k.nextInt();
		
		if(num1 % num2 == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
	}
}

package exercicios.Scanner;

import java.util.Scanner;

public class Nono {

	public static void main(String[] args) {
		
		int num1, num2;
		Scanner k = new Scanner(System.in);
		
		System.out.println("Informe um n�mero inteiro :");
		num1 = k.nextInt();
		
		System.out.println("Informe outro n�mero inteiro :");
		num2 = k.nextInt();
		
		if(num1 <= 0 || num2 > 10) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
	}
}

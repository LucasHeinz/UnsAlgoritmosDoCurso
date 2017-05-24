package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num2 {

	public static void main(String[] args) {
		
		int num;
		Scanner k = new Scanner(System.in);
		
		System.out.println("Informe um número");
		num = k.nextInt();
		if(num % 2 == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O número é ímpar");
		}
	}
}

package exercicios.num2;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		int num, contador = 0;
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Escreva um número");
		num = k.nextInt();
		
		while (contador <= num) {
			if (contador % 2 == 0) {
				System.out.println(contador);
			}
			contador++;
		}
	}
}

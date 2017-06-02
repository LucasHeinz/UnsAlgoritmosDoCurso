package exercicios.Interadores;

import java.util.Scanner;

public class E20 {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		int num1, num2, resultado;
		
		System.out.println("Digite um número.");
		num1 = k.nextInt();
		
		System.out.println("Digite outro número, confie em mim.");
		num2 = k.nextInt();
		
		resultado = num1 + num2;
		
		System.out.println(":)");
		
		if(resultado == 2) {
			System.out.println(":)");
		}
		
		k.close();
	}
}

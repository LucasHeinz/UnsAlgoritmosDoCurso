package exercicios.Interadores;

import java.util.Scanner;

public class E16 {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número menor que 10");
		num = k.nextInt();
		
		for(int i = 10; i >= num; i--) {
			System.out.println(i);
		}
	}
}

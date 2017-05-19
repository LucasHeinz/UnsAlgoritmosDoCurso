package exercicios.num2;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		int num, contador = 0;
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Insira um incrível número :D");
		num = k.nextInt();
		
		while(contador <= num) {
			System.out.println(contador);
			contador++;
		}
	}
}

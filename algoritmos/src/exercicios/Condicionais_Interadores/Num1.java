package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num1 {

	public static void main(String[] args) {

		int num;
		Scanner k = new Scanner(System.in);

		System.out.println("Informe um número");
		num = k.nextInt();
		if (num > 10) {
			System.out.println("O número que você digitou é maior que 10");
		} else {
			System.out.println("O incrível número que você digitou é menor que 10");
		}
	}
}

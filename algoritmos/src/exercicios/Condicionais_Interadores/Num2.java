package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num2 {

	public static void main(String[] args) {
		
		int num;
		Scanner k = new Scanner(System.in);
		
		System.out.println("Informe um n�mero");
		num = k.nextInt();
		if(num % 2 == 0) {
			System.out.println("O n�mero � par");
		} else {
			System.out.println("O n�mero � �mpar");
		}
	}
}

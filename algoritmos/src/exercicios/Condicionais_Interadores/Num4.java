package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num4 {

	public static void main(String[] args) {
		
		int num, outroNum;
		Scanner k = new Scanner(System.in);

		System.out.println("Informe um número");
		num = k.nextInt();
		
		System.out.println("Informe mais um número");
		outroNum = k.nextInt();
		
		if(num % 7 == 0 && outroNum % 7 == 0) {
			System.out.println("Os dois números são múltiplos de 7");
		} else {
			System.out.println("Os dois números não são múltiplos de 7");
		}
	}
}

package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num4 {

	public static void main(String[] args) {
		
		int num, outroNum;
		Scanner k = new Scanner(System.in);

		System.out.println("Informe um n�mero");
		num = k.nextInt();
		
		System.out.println("Informe mais um n�mero");
		outroNum = k.nextInt();
		
		if(num % 7 == 0 && outroNum % 7 == 0) {
			System.out.println("Os dois n�meros s�o m�ltiplos de 7");
		} else {
			System.out.println("Os dois n�meros n�o s�o m�ltiplos de 7");
		}
	}
}

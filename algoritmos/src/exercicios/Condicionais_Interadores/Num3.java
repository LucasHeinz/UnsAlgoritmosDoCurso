package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num3 {

	public static void main(String[] args) {
		
		int num, outroNum, result;
		Scanner k = new Scanner(System.in);

		System.out.println("Informe um n�mero");
		num = k.nextInt();
		
		System.out.println("Informe mais um n�mero");
		outroNum = k.nextInt();
		
		result = num * outroNum;
		
		if(result % 5 == 0) {
			System.out.println("O resultado � m�ltiplo de 5");
		} else {
			System.out.println("O resultado n�o foi o esperado");
		}
		System.out.println(result);
	}
}

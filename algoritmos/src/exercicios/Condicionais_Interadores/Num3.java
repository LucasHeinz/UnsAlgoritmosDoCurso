package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num3 {

	public static void main(String[] args) {
		
		int num, outroNum, result;
		Scanner k = new Scanner(System.in);

		System.out.println("Informe um número");
		num = k.nextInt();
		
		System.out.println("Informe mais um número");
		outroNum = k.nextInt();
		
		result = num * outroNum;
		
		if(result % 5 == 0) {
			System.out.println("O resultado é múltiplo de 5");
		} else {
			System.out.println("O resultado não foi o esperado");
		}
		System.out.println(result);
	}
}

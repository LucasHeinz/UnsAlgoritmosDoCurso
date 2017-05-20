package exercicios.Scanner;

import java.util.Scanner;

public class DecimoNono {

	public static void main(String[] args) {
		
		int primeiroNumero, segundoNumero;
		Scanner k = new Scanner(System.in);
		
		System.out.println("Digite um número :");
		primeiroNumero = k.nextInt();
		
		segundoNumero = primeiroNumero;
		primeiroNumero = 10;
		
		System.out.println("O primeiro numero é " + primeiroNumero);
		System.out.println("O segundo numero é " + segundoNumero);
	}
}

package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num10 {

	public static void main(String[] args) {

		double n1, n2, soma;

		Scanner k = new Scanner(System.in);

		System.out.println("Informe um n�mero");
		n1 = k.nextDouble();

		System.out.println("Outro n�mero");
		n2 = k.nextDouble();

		soma = n1 + n2;
		
		if(soma > 20) {
			System.out.println(soma + " � maior que 20");
		} else if(soma > 30) {
			System.out.println(soma + " � maior que 30");
		} else if (soma > 10 || soma > 20) {
			System.out.println(soma +" � maior que 10 ou " + soma + " � maior que 20");
		} else if(soma % 5 == 0 && soma % 10 == 0) {
			System.out.println(soma + " � m�ltiplo de 5 e " + soma + " � m�ltiplo de 10");
		} else if(soma % 5 == 0 && soma % 10 == 0 || n1 == 5) {
			System.out.println(soma + " � m�ltiplo de 5 e " + soma + " � m�ltiplo de 10 ou " + n1 + " � 5.");
		}
 
	}
}

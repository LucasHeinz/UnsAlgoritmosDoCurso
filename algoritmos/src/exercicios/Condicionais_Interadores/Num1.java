package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num1 {

	public static void main(String[] args) {

		int num;
		Scanner k = new Scanner(System.in);

		System.out.println("Informe um n�mero");
		num = k.nextInt();
		if (num > 10) {
			System.out.println("O n�mero que voc� digitou � maior que 10");
		} else {
			System.out.println("O incr�vel n�mero que voc� digitou � menor que 10");
		}
	}
}

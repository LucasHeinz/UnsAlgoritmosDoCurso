package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num7 {

	public static void main(String[] args) {

		int n1, n2, resultado;
		String operador;

		Scanner k = new Scanner(System.in);

		System.out.println("Digite um número de sua preferência");
		n1 = k.nextInt();

		System.out.println("Selecione um operador matemático (+, -, *, /)");
		operador = k.nextLine();

		System.out.println("Digite outro número, também de sua preferência");
		n2 = k.nextInt();

		switch (operador) {
		case "+":
			resultado = n1 + n2;
			System.out.println("Valor da soma :" + resultado);
			break;
		case "-":
			resultado = n1 - n2;
			System.out.println("Valor da subtração :" + resultado);
			break;
		case "*":
			resultado = n1 * n2;
			System.out.println("Valor da multiplicação :" + resultado);
			break;
		case "/":
			resultado = n1 / n2;
			System.out.println("Valor da divisão :" + resultado);
			break;
		default:
			System.out.println("Insira um operador válido");
			break;
		}
	}
}

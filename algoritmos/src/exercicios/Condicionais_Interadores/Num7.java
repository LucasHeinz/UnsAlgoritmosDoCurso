package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num7 {

	public static void main(String[] args) {

		int n1, n2, resultado;
		String operador;

		Scanner k = new Scanner(System.in);

		System.out.println("Digite um n�mero de sua prefer�ncia");
		n1 = k.nextInt();

		System.out.println("Selecione um operador matem�tico (+, -, *, /)");
		operador = k.nextLine();

		System.out.println("Digite outro n�mero, tamb�m de sua prefer�ncia");
		n2 = k.nextInt();

		switch (operador) {
		case "+":
			resultado = n1 + n2;
			System.out.println("Valor da soma :" + resultado);
			break;
		case "-":
			resultado = n1 - n2;
			System.out.println("Valor da subtra��o :" + resultado);
			break;
		case "*":
			resultado = n1 * n2;
			System.out.println("Valor da multiplica��o :" + resultado);
			break;
		case "/":
			resultado = n1 / n2;
			System.out.println("Valor da divis�o :" + resultado);
			break;
		default:
			System.out.println("Insira um operador v�lido");
			break;
		}
	}
}

package exercicios.Interadores;

import java.util.Scanner;

public class E9 {

	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);

		int num1, num2, num3, num4;
		String frase;

		System.out.println("Informe o começo da lista (valor positivo e inteiro)");
		num1 = k.nextInt();

		System.out.println("Informe o final da lista (valor maior que o anterior)");
		num2 = k.nextInt();

		for (int i = num1; i < num2; i++) {
			System.out.println(i);
		}

		System.out.println("Informe qual deve ser o intervalo da próxima lista ");
		num3 = k.nextInt();

		for (int i = 0; i < (100 - num3); i = i + num3) {
			System.out.println(i);
		}

		System.out.println("Qual o valor máximo que deve ser impresso ? (valor inteiro maior que zero)");
		num4 = k.nextInt();

		for (int i = 0; i < num4; i++) {
			System.out.println(i);
		}
		
		System.out.println("Qual a mensagem que você deseja que apareça com cada número da incrível lista ?");
		frase = k.nextLine();
		
		for(int i = 0; i < 10; i++) {
			System.out.println(frase + " " + i);
		}
	}
}

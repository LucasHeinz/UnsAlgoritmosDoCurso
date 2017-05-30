package exercicios.Arrays_E_Matrizes;

import java.util.Scanner;

public class Ex_21 {

	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);

		int vet[] = new int[10], num = 1;

		for (int i = 0; i < 10; i++) {
			System.out.println("Bem-vindo, insira o " + num + "º valot");
			vet[i] = k.nextInt();
			num++;
		}
	}
}

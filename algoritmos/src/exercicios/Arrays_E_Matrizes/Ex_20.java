package exercicios.Arrays_E_Matrizes;

import java.util.Scanner;

public class Ex_20 {

	public static void main(String[] args) {

		int num[] = new int[3];

		Scanner k = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Insira um valor, se quiser, claro.");
			num[i] = k.nextInt();
		}
	}
}

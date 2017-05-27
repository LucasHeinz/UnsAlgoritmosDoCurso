package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num12 {

	public static void main(String[] args) {

		int nums[] = new int[3], maior = -45678, menor = 567890456, meio = 0;

		Scanner k = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Se você quiser, digite um número, a vida é sua.");
			nums[i] = k.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			if (nums[i] > maior) {
				maior = nums[i];
			}
			if (nums[i] < menor) {
				menor = nums[i];
			}
		}
		for (int i = 0; i < 3; i++) {
			if(nums[i] > menor && nums[i] < maior) {
				meio = nums[i];
			}
		}
		System.out.println(maior + " " + meio + " " + menor);
	}
}

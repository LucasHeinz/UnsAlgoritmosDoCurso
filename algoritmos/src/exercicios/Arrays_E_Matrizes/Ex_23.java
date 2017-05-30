package exercicios.Arrays_E_Matrizes;

import java.util.Scanner;

public class Ex_23 {

	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);

		int nums[] = new int[6], pergunta;
		boolean condicao = false;

		System.out.println("Se você estiver com tempo, informe um valor");
		pergunta = k.nextInt();

		for (int i = 0; i < 6; i++) {
			nums[i] = i + 1;
			if (pergunta == nums[i]) {
				condicao = true;
			}
		}
		if (condicao) {
			System.out.println(
					"O valor que você informou foi encontrado e precisa ser eliminado," + " informe outro valor");
			pergunta = k.nextInt();
			System.out.println("Obrigado pela contribuição, soldado");
		}
	}
}

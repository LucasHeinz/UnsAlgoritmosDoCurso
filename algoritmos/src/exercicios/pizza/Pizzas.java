package exercicios.pizza;

import java.util.Scanner;

public class Pizzas {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		String pizza[] = new String[15];
		pizza[0] = "Pizza de calabresa";
		pizza[1] = "Pizza de 4 queijos";
		pizza[2] = "Pizza de frango";
		pizza[3] = "Pizza de lombinho";
		pizza[4] = "Pizza de cora��o";
		pizza[5] = "Pizza de carne";
		pizza[6] = "Pizza de strogonoff de frango";
		pizza[7] = "Pizza de strogonoff de carne";
		pizza[8] = "Pizza de 5 queijos";
		pizza[9] = "Pizza de banana split";
		pizza[10] = "Pizza de sonho de valsa";
		pizza[11] = "Pizza de prest�gio";
		pizza[12] = "Pizza de chocolate preto";
		pizza[13] = "Pizza de chocolate branco";
		pizza[14] = "Pizza de coco";

		double preco[] = new double[15];
		int pedido;

		for (int i = 0; i < 15; i++) {
			System.out.println("Digite o valor da pizza de " + pizza[i]);
			preco[i] = k.nextDouble();
		}

		System.out.println("Ol�, seja bem-vindo ao nosso incr�vel restarante, temos :");
		for (int i = 0; i < 15; i++) {
			System.out.println(i + 1 + ". " + pizza[i] + "........ R$: " + preco[i]);
		}
		System.out.println("Informe o n�mero da pizza que voc� deseja.");
		pedido = k.nextInt() - 1;

		System.out.println("O valor da pizza de " + pizza[pedido] + " � de R$ " + preco[pedido]
				+ ".\nPortanto, o valor da sua conta � :" + preco[pedido]);

		k.close();
	}
}

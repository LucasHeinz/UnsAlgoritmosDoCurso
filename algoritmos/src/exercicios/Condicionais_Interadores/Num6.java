package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num6 {

	public static void main(String[] args) {

		String cidade, bairro, condicao;

		Scanner k = new Scanner(System.in);

		System.out.println("Em qual cidade você mora ?");
		cidade = k.nextLine().toLowerCase();

		System.out.println("Em qual bairro você mora ?");
		bairro = k.nextLine().toLowerCase();

		if (cidade.equals("blumenau")) {
			switch (bairro) {
			case "velha":
				System.out.println("Você se atrasará para o trabalho");
				break;
			case "fortaleza":
				System.out.println("Você se atrasará muito mais para o trabalho");
				break;
			case "garcia":
				System.out.println("Você tem que sair de casa para não pegar trânsito");
				break;
			case "bela vista":
				System.out.println("Pegue carona com quem vêem de gaspar, economiza gasolina!");
				break;
			default:
			}

			if (cidade.equals("gaspar") && bairro.equals("belchior")) {
				System.out.println("OK, você gosta de pegar trânsito");
			}

			System.out.println("Você concorda com o que eu disse ? (true or false)");
			condicao = k.nextLine();

			if (condicao.equals("true")) {
				System.out.println("Show de bola");
			} else if (condicao.equals("false")) {
				System.out.println("OK, problema é nosso");
			}
		}
	}
}

package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num6 {

	public static void main(String[] args) {

		String cidade, bairro, condicao;

		Scanner k = new Scanner(System.in);

		System.out.println("Em qual cidade voc� mora ?");
		cidade = k.nextLine().toLowerCase();

		System.out.println("Em qual bairro voc� mora ?");
		bairro = k.nextLine().toLowerCase();

		if (cidade.equals("blumenau")) {
			switch (bairro) {
			case "velha":
				System.out.println("Voc� se atrasar� para o trabalho");
				break;
			case "fortaleza":
				System.out.println("Voc� se atrasar� muito mais para o trabalho");
				break;
			case "garcia":
				System.out.println("Voc� tem que sair de casa para n�o pegar tr�nsito");
				break;
			case "bela vista":
				System.out.println("Pegue carona com quem v�em de gaspar, economiza gasolina!");
				break;
			default:
			}

			if (cidade.equals("gaspar") && bairro.equals("belchior")) {
				System.out.println("OK, voc� gosta de pegar tr�nsito");
			}

			System.out.println("Voc� concorda com o que eu disse ? (true or false)");
			condicao = k.nextLine();

			if (condicao.equals("true")) {
				System.out.println("Show de bola");
			} else if (condicao.equals("false")) {
				System.out.println("OK, problema � nosso");
			}
		}
	}
}

package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num25 {

	public static void main(String[] args) {

		String endereco1 = "Rua Ant�nio da Veiga, n�mero 201, Vila Nova, Blumenau - SC",
				endereco2 = "SC - Blumenau, rua Joiville n� 2011.";

		int pos1 = endereco1.indexOf(",");
		endereco1 = endereco1.substring(0, pos1);

		int pos2 = endereco2.indexOf(", ");
		int pos3 = endereco2.lastIndexOf("n");
		endereco2 = endereco2.substring(pos2, pos3);

		System.out.println("A. " + endereco1);
		System.out.println("B. " + endereco2);
	}
}

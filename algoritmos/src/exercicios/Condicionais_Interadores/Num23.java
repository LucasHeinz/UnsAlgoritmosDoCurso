package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num23 {

	public static void main(String[] args) {

		String nomeCompleto;

		Scanner k = new Scanner(System.in);

		System.out.println("Digite seu maravilhoso nome completo");
		nomeCompleto = k.nextLine();
		
		int espaco1 = nomeCompleto.indexOf(" ");
		int espaco2 = nomeCompleto.lastIndexOf(" ");
		
		nomeCompleto = nomeCompleto.substring(espaco1, espaco2);
		
		System.out.println(nomeCompleto);
	}
}

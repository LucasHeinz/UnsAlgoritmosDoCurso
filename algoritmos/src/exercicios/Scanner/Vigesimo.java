package exercicios.Scanner;

import java.util.Scanner;

public class Vigesimo {

	public static void main(String[] args) {
		
		String texto, outroTexto;
		Scanner k = new Scanner(System.in);
		
		System.out.println("Escreva um texto maravilhoso");
		texto = k.nextLine();
		
		outroTexto = texto;
		texto = "olá";
		
		System.out.println("O texto é : " + texto);
		System.out.println("O outro texto é : " + outroTexto);
	}
}

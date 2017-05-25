package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num22 {

	public static void main(String[] args) {
		
		String nomeCompleto;
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Digite seu maravilhoso nome completo");
		nomeCompleto = k.nextLine();
		
		int posicion = nomeCompleto.lastIndexOf(" ");
		posicion++;
		
		nomeCompleto = nomeCompleto.substring(posicion);
		
		System.out.println(nomeCompleto);
	}
}

package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num20 {

	public static void main(String[] args) {
		
		String nomeESobrenome;
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome e sobrenome ?");
		nomeESobrenome = k.nextLine().toUpperCase();
		
		System.out.println(nomeESobrenome);
		
		nomeESobrenome.toLowerCase();
		System.out.println(nomeESobrenome);
	}
}

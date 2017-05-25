package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num21 {

	public static void main(String[] args) {
		
		String data;
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Informe a sua data de nascimento (dd/mm/aaaa)");
		data = k.nextLine();
		
		int posicao = data.lastIndexOf("/");
		System.out.println(posicao);
		
	}
}

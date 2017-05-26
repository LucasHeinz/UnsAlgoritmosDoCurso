package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num24 {

	public static void main(String[] args) {
		
String data;
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Informe a sua data de nascimento (dd/mm/aaaa)");
		data = k.nextLine();
		
		int posicao = data.lastIndexOf("/");
		int outraPosicao = data.indexOf("/");
		
		data = data.substring(outraPosicao, posicao);
		System.out.println(data);
	}
}

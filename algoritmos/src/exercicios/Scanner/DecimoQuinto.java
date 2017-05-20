package exercicios.Scanner;

import java.util.Scanner;

public class DecimoQuinto {

	public static void main(String[] args) {
		
		String observacao;
		Scanner k = new Scanner(System.in);
		
		System.out.println("Escreva suas observações sobre o nosso conteúdo(Max 50 caracteres)");
		observacao = k.nextLine();
		
		if(observacao.length() > 50) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}
	}
}

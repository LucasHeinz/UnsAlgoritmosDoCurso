package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num27 {

	public static void main(String[] args) {
		
		String nomeCompleto;
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Se quiser, voc� poderia informar o seu incr�vel nome completo");
		nomeCompleto = k.nextLine();
		
		if(nomeCompleto.contains("Pereira")) {
			System.out.println("Voc� � da famosa fam�lia pereira :D");
		} else if(nomeCompleto.contains("Silva")) {
			System.out.println("Voc� � da doce fam�lia Silva");
		} else if(nomeCompleto.contains("Souza")) {
			System.out.println("Voc� � da super conhecida fam�lia Souza");
		} else {
			System.out.println("Infelizmente, voc� n�o tem um sobrenome famoso :(");
		}
		
	}
}

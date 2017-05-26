package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num27 {

	public static void main(String[] args) {
		
		String nomeCompleto;
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Se quiser, você poderia informar o seu incrível nome completo");
		nomeCompleto = k.nextLine();
		
		if(nomeCompleto.contains("Pereira")) {
			System.out.println("Você é da famosa família pereira :D");
		} else if(nomeCompleto.contains("Silva")) {
			System.out.println("Você é da doce família Silva");
		} else if(nomeCompleto.contains("Souza")) {
			System.out.println("Você é da super conhecida família Souza");
		} else {
			System.out.println("Infelizmente, você não tem um sobrenome famoso :(");
		}
		
	}
}

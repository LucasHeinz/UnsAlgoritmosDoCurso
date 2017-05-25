package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num9 {

	public static void main(String[] args) {
		
		String roupa, clima;
		int temperatura;
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Qual o clima de hoje ? (Sol, nublado ou chuvoso)");
		clima = k.nextLine();
		
		System.out.println("Qual é a temperatura de hoje ? (Representada em um número inteiro)");
		temperatura = k.nextInt();
		
		switch (clima) {
		case "sol":
			if(temperatura > 30) {
				roupa = "saia";	
			} else if(temperatura <= 30 && temperatura >= 23) {
				roupa = "short";
			} else {
				roupa = "calça jeans";
			}
			System.out.println("Ela usará " + roupa);
		case "nublado" :
			if(temperatura > 25) {
				roupa = "vestido";
			} else {
				roupa = "moletom e sobretudo";
			}
			System.out.println("Ela usará " + roupa);
		case "chuvoso" :
			roupa = "bota, calça jeans, ";
			if(temperatura <= 10) {
				roupa += "blusa e um casaco de lã.";
			} else if(temperatura > 10 && temperatura < 25) {
				roupa += "camisete";
			} else {
				roupa += "blusa regata"; 
			}
			System.out.println("Ela usará " + roupa);
			break;
		default:
			System.out.println("Ela não sairá de casa hoje");
			break;
		}
	}
}

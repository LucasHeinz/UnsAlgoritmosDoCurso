package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num9 {

	public static void main(String[] args) {
		
		String roupa, clima;
		int temperatura;
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Qual o clima de hoje ? (Sol, nublado ou chuvoso)");
		clima = k.nextLine();
		
		System.out.println("Qual � a temperatura de hoje ? (Representada em um n�mero inteiro)");
		temperatura = k.nextInt();
		
		switch (clima) {
		case "sol":
			if(temperatura > 30) {
				roupa = "saia";	
			} else if(temperatura <= 30 && temperatura >= 23) {
				roupa = "short";
			} else {
				roupa = "cal�a jeans";
			}
			System.out.println("Ela usar� " + roupa);
		case "nublado" :
			if(temperatura > 25) {
				roupa = "vestido";
			} else {
				roupa = "moletom e sobretudo";
			}
			System.out.println("Ela usar� " + roupa);
		case "chuvoso" :
			roupa = "bota, cal�a jeans, ";
			if(temperatura <= 10) {
				roupa += "blusa e um casaco de l�.";
			} else if(temperatura > 10 && temperatura < 25) {
				roupa += "camisete";
			} else {
				roupa += "blusa regata"; 
			}
			System.out.println("Ela usar� " + roupa);
			break;
		default:
			System.out.println("Ela n�o sair� de casa hoje");
			break;
		}
	}
}

package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num18 {

	public static void main(String[] args) {
		
		String nome[] = new String[2];
		int dia[] = new int[2], mes[] = new int[2], ano[] = new int[2], maiorMes = 12, maiorAno = 2017, maiorDia = 31;
		
		Scanner k = new Scanner(System.in);
		
		for(int i = 0; i < 2; i++) {
			System.out.println("Qual � o seu nome ?");
			nome[i] = k.nextLine();
			
			System.out.println("Em que ano voc� nasceu ?");
			ano[i] = k.nextInt();
			
			System.out.println("Em que m�s voc� nasceu ?");
			mes[i] = k.nextInt();
			
			System.out.println("Em que dia voc� nasceu ?");
			dia[i] = k.nextInt();
		}
		
	}
}

package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num5 {

	public static void main(String[] args) {
		
		int idade, ano, mentira;
		Scanner k = new Scanner(System.in);

		System.out.println("Informe sua idade");
		idade = k.nextInt();
		
		System.out.println("Informe seu ano de nascimento");
		ano = k.nextInt();
		
		mentira = ano + idade;
		
		if(mentira == 2017) {
			System.out.println("Voc� n�o mentiu pra mim");
		} else {
			System.out.println("Voc� mentiu pra mim");
		}
	}
}

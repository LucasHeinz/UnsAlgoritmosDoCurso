package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num17 {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		int maior = 0, menor = 1000000, meio = 0, coisa = 1;
		int idade[] = new int[3];
		String nome[] = new String[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Informe o " + coisa + "º nome");
			nome[i] = k.nextLine();
			coisa++;
		}
		
		coisa = 1;
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Informe o " + coisa + "ª idade");
			idade[i] = k.nextInt();
			coisa++;
		}
		for(int i = 0; i < 3; i++) {
			if(idade[i] > maior) {
				maior = idade[i];
			}
			if(idade[i] < menor) {
				menor = idade[i];
			}
		}
		for(int i = 0; i < 3; i++) {
			if(idade[i] > menor && idade[i] < maior) {
				meio = idade[i];
			}
		}
		System.out.println("A idade do mais velho é " + maior + ", o do meio tem " + meio + " e o mais"
				+ " novo tem " + menor);
	}
}

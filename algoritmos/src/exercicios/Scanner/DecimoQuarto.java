package exercicios.Scanner;

import java.util.Scanner;

public class DecimoQuarto {

	public static void main(String[] args) {
		
		String nome, telefone, cidade;
		int  ano, idade;
		Scanner k = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		nome = k.nextLine();
		
		System.out.println("Digite seu ano de nascimento:");
		ano = k.nextInt();
		
		System.out.println("Digite seu telefone:");
		telefone = k.nextLine();
		
		System.out.println("Digite a cidade de nascimento");
		cidade = k.nextLine();
		
		idade = 2017 - ano;
		
		System.out.println("Meu nome é " + nome +", nasci no ano " + ano
				+ ", tenho " + idade + " anos."
				+ " Se você quiser entrar em contato comigo, pode ligar para o telefone " + telefone 
				+ ". Há esqueci de te dizer aonde eu nasci, foi na cidade de " + cidade);
	}
}

package exercicios.Scanner;

public class VigesimoSegundo {

	public static void main(String[] args) {
		
		boolean teste = true, outroTeste = false;
		
		System.out.println("O teste � " + teste);
		System.out.println("O outro teste � " + outroTeste);
		
		outroTeste = teste;
		
		System.out.println("Agora o valor do teste � " + teste);
		System.out.println("E o valor do outro teste � " + outroTeste);
		
		teste = false;
		
		System.out.println("Ap�s serem mudadas de novo, o valor do teste � " + teste);
		System.out.println("E o valor do outro teste � " + outroTeste);
		
	}
}

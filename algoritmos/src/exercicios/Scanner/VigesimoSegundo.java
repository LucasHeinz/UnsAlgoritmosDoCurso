package exercicios.Scanner;

public class VigesimoSegundo {

	public static void main(String[] args) {
		
		boolean teste = true, outroTeste = false;
		
		System.out.println("O teste é " + teste);
		System.out.println("O outro teste é " + outroTeste);
		
		outroTeste = teste;
		
		System.out.println("Agora o valor do teste é " + teste);
		System.out.println("E o valor do outro teste é " + outroTeste);
		
		teste = false;
		
		System.out.println("Após serem mudadas de novo, o valor do teste é " + teste);
		System.out.println("E o valor do outro teste é " + outroTeste);
		
	}
}

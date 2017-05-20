package exercicios.Scanner;

public class VigesimoPrimeiro {

	public static void main(String[] args) {
		
		int numero = 10;
		
		for(int i=0; i<10; i++) {
			System.out.println(numero -1);
		}
		System.out.println(numero);
		for(int i=0; i<10; i++) {
			numero = numero - 1;
		}
		System.out.println(numero);
	}
}

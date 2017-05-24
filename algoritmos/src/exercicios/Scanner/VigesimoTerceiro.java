package exercicios.Scanner;

public class VigesimoTerceiro {

	public static void main(String[] args) {

		boolean numero = true;
		String booleano = "false";
		
		numero = false | true;
		booleano = "false | false";
		numero = false | numero;
		
		System.out.println(booleano);
		System.out.println(numero);

	}
}

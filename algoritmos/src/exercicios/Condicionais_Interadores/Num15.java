package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num15 {

	public static void main(String[] args) {
		
		int dia, mes;
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Informe um dia (lembrando que n�o � ano bissexto)");
		dia = k.nextInt();
		
		System.out.println("Informe um m�s (o n�mero do m�s)");
		mes = k.nextInt();
		
		switch (mes) {
		case 1:
			if(dia <= 31) {
				System.out.println("Esse dia existe no m�s escolhido :D");
			} else {
				System.out.println("Esse dia n�o existe nesse m�s :D");
			}
			break;
		case 2:
			if(dia <= 28) {
				System.out.println("Esse dia existe no m�s escolhido :D");
			} else {
				System.out.println("Esse dia n�o existe nesse m�s :D");
			}
			break;
		case 3:
			if(dia <= 31) {
				System.out.println("Esse dia existe no m�s escolhido :D");
			} else {
				System.out.println("Esse dia n�o existe nesse m�s :D");
			}
			break;
		case 4:
			if(dia <= 30) {
				System.out.println("Esse dia existe no m�s escolhido :D");
			} else {
				System.out.println("Esse dia n�o existe nesse m�s :D");
			}
			break;
		case 5:
			if(dia <= 31) {
				System.out.println("Esse dia existe no m�s escolhido :D");
			} else {
				System.out.println("Esse dia n�o existe nesse m�s :D");
			}
			break;
		case 6:
			if(dia <= 30) {
				System.out.println("Esse dia existe no m�s escolhido :D");
			} else {
				System.out.println("Esse dia n�o existe nesse m�s :D");
			}
			break;
		case 7:
			if(dia <= 31) {
				System.out.println("Esse dia existe no m�s escolhido :D");
			} else {
				System.out.println("Esse dia n�o existe nesse m�s :D");
			}
			break;
		case 8:
			if(dia <= 30) {
				System.out.println("Esse dia existe no m�s escolhido :D");
			} else {
				System.out.println("Esse dia n�o existe nesse m�s :D");
			}
			break;
		case 9:
			if(dia <= 31) {
				System.out.println("Esse dia existe no m�s escolhido :D");
			} else {
				System.out.println("Esse dia n�o existe nesse m�s :D");
			}
			break;
		case 10:
			if(dia <= 30) {
				System.out.println("Esse dia existe no m�s escolhido :D");
			} else {
				System.out.println("Esse dia n�o existe nesse m�s :D");
			}
			break;
		case 11:
			if(dia <= 31) {
				System.out.println("Esse dia existe no m�s escolhido :D");
			} else {
				System.out.println("Esse dia n�o existe nesse m�s :D");
			}
			break;
		case 12:
			if(dia <= 30) {
				System.out.println("Esse dia existe no m�s escolhido :D");
			} else {
				System.out.println("Esse dia n�o existe nesse m�s :D");
			}
			break;
		default:
			System.out.println("Esse m�s n�o existe no calend�rio crist�o");
			break;
		}
	}
}

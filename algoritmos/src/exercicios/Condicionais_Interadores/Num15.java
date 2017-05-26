package exercicios.Condicionais_Interadores;

import java.util.Scanner;

public class Num15 {

	public static void main(String[] args) {
		
		int dia, mes;
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Informe um dia (lembrando que não é ano bissexto)");
		dia = k.nextInt();
		
		System.out.println("Informe um mês (o número do mês)");
		mes = k.nextInt();
		
		switch (mes) {
		case 1:
			if(dia <= 31) {
				System.out.println("Esse dia existe no mês escolhido :D");
			} else {
				System.out.println("Esse dia não existe nesse mês :D");
			}
			break;
		case 2:
			if(dia <= 28) {
				System.out.println("Esse dia existe no mês escolhido :D");
			} else {
				System.out.println("Esse dia não existe nesse mês :D");
			}
			break;
		case 3:
			if(dia <= 31) {
				System.out.println("Esse dia existe no mês escolhido :D");
			} else {
				System.out.println("Esse dia não existe nesse mês :D");
			}
			break;
		case 4:
			if(dia <= 30) {
				System.out.println("Esse dia existe no mês escolhido :D");
			} else {
				System.out.println("Esse dia não existe nesse mês :D");
			}
			break;
		case 5:
			if(dia <= 31) {
				System.out.println("Esse dia existe no mês escolhido :D");
			} else {
				System.out.println("Esse dia não existe nesse mês :D");
			}
			break;
		case 6:
			if(dia <= 30) {
				System.out.println("Esse dia existe no mês escolhido :D");
			} else {
				System.out.println("Esse dia não existe nesse mês :D");
			}
			break;
		case 7:
			if(dia <= 31) {
				System.out.println("Esse dia existe no mês escolhido :D");
			} else {
				System.out.println("Esse dia não existe nesse mês :D");
			}
			break;
		case 8:
			if(dia <= 30) {
				System.out.println("Esse dia existe no mês escolhido :D");
			} else {
				System.out.println("Esse dia não existe nesse mês :D");
			}
			break;
		case 9:
			if(dia <= 31) {
				System.out.println("Esse dia existe no mês escolhido :D");
			} else {
				System.out.println("Esse dia não existe nesse mês :D");
			}
			break;
		case 10:
			if(dia <= 30) {
				System.out.println("Esse dia existe no mês escolhido :D");
			} else {
				System.out.println("Esse dia não existe nesse mês :D");
			}
			break;
		case 11:
			if(dia <= 31) {
				System.out.println("Esse dia existe no mês escolhido :D");
			} else {
				System.out.println("Esse dia não existe nesse mês :D");
			}
			break;
		case 12:
			if(dia <= 30) {
				System.out.println("Esse dia existe no mês escolhido :D");
			} else {
				System.out.println("Esse dia não existe nesse mês :D");
			}
			break;
		default:
			System.out.println("Esse mês não existe no calendário cristão");
			break;
		}
	}
}

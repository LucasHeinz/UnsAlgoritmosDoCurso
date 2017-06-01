package exercicios.Arrays_E_Matrizes;

import java.util.Scanner;

public class Ex_299 {

	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);

		boolean ingles;

		String cargo[] = new String[5];
		String funcionario;

		cargo[0] = "estagi�rio";
		cargo[1] = "j�nior";
		cargo[2] = "pleno";
		cargo[3] = "s�nior";
		cargo[4] = "s�nior plus plus";

		double sal[] = new double[5];
		double salFuncionario = 0;

		int tempo;

		sal[0] = 550;
		sal[1] = 1000;
		sal[2] = 1500;
		sal[3] = 2500;
		sal[4] = 3000;

		System.out.println("Qual � o cargo do funcion�rio ?");
		funcionario = k.nextLine().toLowerCase();

		for (int i = 0; i < cargo.length; i++) {
			if (funcionario.equals(cargo[i])) {
				salFuncionario = sal[i];
			}
		}

		System.out.println("Quanto tempo o funcion�rio trabalha na empresa (em meses)");
		tempo = k.nextInt();

		System.out.println("O funcion�rio possui ingl�s ?(true para sim, false para n�o)");
		ingles = k.nextBoolean();

		if (ingles) {
			salFuncionario = salFuncionario * 1.035;
		}
		
		if(tempo > 3 && tempo <= 9) {
			salFuncionario = salFuncionario * 1.038;
		} else if (tempo > 9 && tempo <= 12) {
			salFuncionario = salFuncionario * 1.05;
		} else if(tempo > 12 && tempo <=24) {
			salFuncionario = salFuncionario * 1.15;
		} else if (tempo > 24 && tempo <= 36) {
			salFuncionario = salFuncionario * 1.206;
		} else if(tempo > 36) {
			salFuncionario = salFuncionario * 1.3;
		}
		System.out.println(salFuncionario);
	}
}

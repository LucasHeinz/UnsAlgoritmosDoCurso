package exercicios.Arrays_E_Matrizes;

import java.util.Scanner;

public class Ex_29 {

	public static void main(String[] args) {
		
		String cargosSal[][] = new String[5][2];
		
		Scanner k = new Scanner(System.in);
		
		cargosSal[0][0] = "Estagiário ";
		cargosSal[1][0] = "Júnior ";
		cargosSal[2][0] = "Pleno ";
		cargosSal[3][0] = "Sênior ";
		cargosSal[4][0] = "Sênior plus plus ";
		cargosSal[0][1] = "500 ";
		cargosSal[1][1] = "1000 ";
		cargosSal[2][1] = "1500 ";
		cargosSal[3][1] = "2500 ";
		cargosSal[4][1] = "3000 ";
		
		for(int linhas=0;linhas<cargosSal.length;linhas++) {
			for(int colunas = 0; colunas<cargosSal[linhas].length; colunas++) {
				System.out.println(cargosSal[linhas][colunas]);
			}
			System.out.println();
		}
		
		String tempoAumento[][] = new String[7][2];
		
		tempoAumento[0][0] = "Inglês ";
		tempoAumento[1][0] = " ";
		tempoAumento[2][0] = " ";
		tempoAumento[3][0] = " ";
		tempoAumento[4][0] = " ";
		tempoAumento[5][0] = " ";
		tempoAumento[6][0] = " ";
		tempoAumento[0][1] = " ";
		tempoAumento[1][1] = " ";
		tempoAumento[2][1] = " ";
		tempoAumento[3][1] = " ";
		tempoAumento[4][1] = " ";
		tempoAumento[5][1] = " ";
		tempoAumento[6][1] = " ";
	}
}

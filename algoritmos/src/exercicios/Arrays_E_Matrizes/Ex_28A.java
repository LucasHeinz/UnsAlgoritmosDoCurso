package exercicios.Arrays_E_Matrizes;

public class Ex_28A {

	public static void main(String[] args) {

		String matriz[][] = new String[4][4];

		for (int linhas = 0; linhas < matriz.length; linhas++) {
			for (int colunas = 0; colunas < matriz[linhas].length; colunas++) {
				if (linhas >= 1 && linhas <= 2 && colunas >= 1 && colunas <= 2) {
					matriz[linhas][colunas] = " ";
				} else {
					matriz[linhas][colunas] = "X";
				}
				System.out.print(matriz[linhas][colunas]);

			}
			System.out.println();
		}
	}
}
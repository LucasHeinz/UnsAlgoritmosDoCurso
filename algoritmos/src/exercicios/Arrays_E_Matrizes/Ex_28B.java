package exercicios.Arrays_E_Matrizes;

public class Ex_28B {

	public static void main(String[] args) {

		String matriz[][] = new String[6][4];

		for (int linhas = 0; linhas < matriz.length; linhas++) {
			for (int colunas = 0; colunas < matriz[linhas].length; colunas++) {
				if (linhas >= 2 && linhas <= 3 && colunas >= 1 && colunas <= 2) {
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

package exercicios.Interadores;

public class E14J {

	public static void main(String[] args) {
		
		String coisas[][] = new String[7][7];

		for (int linhas = 0; linhas < 7; linhas++) {
			for (int colunas = 0; colunas < 7; colunas++) {
				if (colunas == 0 || colunas == 6 || linhas == 0 || linhas == 6) {
					coisas[linhas][colunas] = "@";
				} else if(linhas == 3 && colunas > 0 && colunas < 6) {
					coisas[linhas][colunas] = "#";
				}
				else {
					coisas[linhas][colunas] = "_";
				}
				System.out.print(coisas[linhas][colunas]);
			}
			System.out.println();
		}
	}
}

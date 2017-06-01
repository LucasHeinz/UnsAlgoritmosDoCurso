package exercicios.Interadores;

public class E14I {

	public static void main(String[] args) {
		
		String coisas[][] = new String[6][7];

		for (int linhas = 0; linhas < 6; linhas++) {
			for (int colunas = 0; colunas < 7; colunas++) {
				if (colunas == 0 || colunas == 6 || linhas == 0 || linhas == 5) {
					coisas[linhas][colunas] = "@";
				} else {
					coisas[linhas][colunas] = "_";
				}
				System.out.print(coisas[linhas][colunas]);
			}
			System.out.println();
		}
	}
}

package exercicios.Interadores;

public class E14G {

	public static void main(String[] args) {
		
		String coisas[][] = new String[4][3];
		
		for(int linhas = 0; linhas < 4; linhas++) {
			for(int colunas = 0; colunas < 3; colunas++) {
				if(colunas == 0 || colunas == 2) {
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

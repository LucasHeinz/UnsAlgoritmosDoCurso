package exercicios.Arrays_E_Matrizes;

public class Ex_26 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];
		int soma[] = new int[3];
		int j;
		
		matriz[0][0] = 3;
		matriz[0][1] = 3;
		matriz[0][2] = 3;
		matriz[1][0] = 2;
		matriz[1][1] = 2;
		matriz[1][2] = 2;
		matriz[2][0] = 1;
		matriz[2][1] = 1;
		matriz[2][2] = 1;
		
		for(int i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				soma[i] = soma[i] + matriz[j][i];
			}
			System.out.println("Soma da coluna " + i + ": " + soma[i]);
		}
	}
}

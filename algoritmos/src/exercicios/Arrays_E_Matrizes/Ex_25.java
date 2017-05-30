package exercicios.Arrays_E_Matrizes;

public class Ex_25 {

	public static void main(String[] args) {

		int[][] matriz = new int[3][3];
		int soma[] = new int[3];

		matriz[0][0] = 3;
		matriz[0][1] = 3;
		matriz[0][2] = 3;
		matriz[1][0] = 2;
		matriz[1][1] = 2;
		matriz[1][2] = 2;
		matriz[2][0] = 1;
		matriz[2][1] = 1;
		matriz[2][2] = 1;

		for (int i = 0; i < 3; i++) {
			soma[0] = soma[0] + matriz[0][i];
			soma[1] = soma[1] + matriz[1][i];
			soma[2] = soma[2] + matriz[2][i];
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("A soma da linha " + i + " é " + soma[i]);
		}
	}
}

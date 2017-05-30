package exercicios.Arrays_E_Matrizes;

public class Ex_27 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];
		int somaPar[] = new int[3], somaImpar[] = new int[3];
		int j;
		
		matriz[0][0] = 3;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		matriz[1][0] = 2;
		matriz[1][1] = 2;
		matriz[1][2] = 3;
		matriz[2][0] = 1;
		matriz[2][1] = 1;
		matriz[2][2] = 2;
		
		for(int i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				if(matriz[i][j] % 2 == 0) {
					somaPar[i] = somaPar[i] + matriz[i][j];
				} else {
					somaImpar[i] = somaImpar[i] + matriz[i][j];
				}
			}
			System.out.println("Soma dos números ímpares da linha " + i + ": " + somaImpar[i]);
			System.out.println("Soma dos números pares da linha " + i + ": " + somaPar[i]);
		}
	}
}

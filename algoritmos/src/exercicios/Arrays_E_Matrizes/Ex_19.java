package exercicios.Arrays_E_Matrizes;

public class Ex_19 {

	public static void main(String[] args) {

		int num1[] = new int[5], num2[] = new int[5], cont = 5;

		for (int i = 0; i < 5; i++) {
			num1[i] = i + 1;
		}
		for (int i = 0; i < 5; i++) {
			num2[i] = cont;
			cont--;
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(num1[i] == num2[j]) {
					System.out.println("ArrayA, posição " + i + ", arrayB, posição " + j + " possuem o valor " + num1[i]);
				}
			}
		}
	}
}

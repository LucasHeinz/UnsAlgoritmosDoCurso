package exercicios.Arrays_E_Matrizes;

public class Ex_15 {

	public static void main(String[] args) {

		int nums[] = new int[5], outrosNums[] = new int[5], contador = 4;

		for (int i = 0; i < 5; i++) {
			nums[i] = 10 - i * 2;
		}

		for (int i = 0; i < 5; i++) {
			outrosNums[i] = nums[contador];
			contador--;
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(outrosNums[i]);
		}
	}
}

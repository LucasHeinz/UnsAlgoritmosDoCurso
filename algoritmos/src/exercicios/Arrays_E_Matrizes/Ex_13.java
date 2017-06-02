package exercicios.Arrays_E_Matrizes;

public class Ex_13 {

	public static void main(String[] args) {

		int nums[] = new int[10], pop = 1;

		for (int i = 0; i < 8; i++) {
			if (i > 2) {
				nums[i] = pop;
				pop++;
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(nums[i]);
		}
	}
}

package exercicios.Arrays_E_Matrizes;

public class Ex_10 {

	public static void main(String[] args) {

		int nums[] = new int[6];

		for (int i = 0; i < 6; i++) {
			nums[i] = i*2 + 1;
		}
		for(int i = 0; i < 6; i++) {
			if(i != 5) {
				System.out.println(nums[i]);
			}
		}
	}
}

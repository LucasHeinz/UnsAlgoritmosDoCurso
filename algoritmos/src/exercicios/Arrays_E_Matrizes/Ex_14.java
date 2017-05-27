package exercicios.Arrays_E_Matrizes;

public class Ex_14 {

	public static void main(String[] args) {
		
		int nums[] = new int[5], outrosNums[] = new int[5];
		
		for(int i = 0; i < 5; i++) {
			nums[i] = 10 - i*2;
		}
		for(int i = 0; i < 5; i++) {
			outrosNums[i] = nums[i];
			System.out.println(outrosNums[i]);
		}
	}
}

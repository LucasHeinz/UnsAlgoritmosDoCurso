package exercicios.Arrays_E_Matrizes;

public class Ex_17 {

	public static void main(String[] args) {
		
		int nums[] = new int[10], maisNums[] = new int[5];
		
		for(int i = 0; i < 10; i++) {
			nums[i] = i + 1;
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(nums[i]);
		}
		for(int i = 0; i < 10; i++) {
			if(nums[i] % 2 != 0) {
				maisNums[i/2] = nums[i];
			}
		}
		for(int i = 0; i < 5; i++) {
			System.out.println("Os números ímpares são " + maisNums[i]);
		}
	}
}

package exercicios.Arrays_E_Matrizes;

public class Ex_6 {

	public static void main(String[] args) {
		
		int nums[] = new int[6];
		
		for(int i = 0; i < 6; i++) {
			nums[i] = i;
		}
		for(int i = 0; i < 6; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("Em ordem decrescente fica :");
		for(int i = 5; i >= 0; i--) {
			System.out.println(nums[i]);
		}
	}
}

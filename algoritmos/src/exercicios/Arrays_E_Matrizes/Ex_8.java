package exercicios.Arrays_E_Matrizes;

public class Ex_8 {

	public static void main(String[] args) {
		
		int nums[] = new int[5];
		
		for(int i = 0; i < 5; i++) {
			nums[i] = i + 1;
		}
		for(int i = 0; i < 3; i++) {
			System.out.println(nums[i]);
		}
		
		nums[0] = 10;
		nums[4] = 10;
		
		System.out.println("O array completo agora é :");
		
		for(int i = 0; i < 5; i++) {
			System.out.println(nums[i]);
		}
	}
}

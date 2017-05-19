package exercicios.num2;

public class Ex12 {

	public static void main(String[] args) {

		int num = 0;

		while (num <= 1000) {
		
			if (num % 2 == 0 && num % 15 == 0) {
				System.out.println(num);
			}
			num++;
		}
	}
}

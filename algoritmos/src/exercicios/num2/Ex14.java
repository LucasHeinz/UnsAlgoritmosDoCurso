package exercicios.num2;

public class Ex14 {

	public static void main(String[] args) {

		int num = -100;

		while (num <= 100) {
		
			if (num % 100 == 0) {
				System.out.println(num);
			}
			num++;
		}
	}
}

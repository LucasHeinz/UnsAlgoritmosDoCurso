package exercicios.num2;

public class Ex11 {

	public static void main(String[] args) {

		int num = 0;

		while (num <= 1000) {
		
			if (num % 97 == 0) {
				System.out.println(num);
			}
			num++;
		}
	}
}

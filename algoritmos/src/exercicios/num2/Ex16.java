package exercicios.num2;

public class Ex16 {

	public static void main(String[] args) {

		int num = 10;

		while (num <= 1000) {
		
			if (num % 5 == 0 && num / 5 > 3 ) {
				System.out.println(num);
			}
			num++;
		}
	}
}

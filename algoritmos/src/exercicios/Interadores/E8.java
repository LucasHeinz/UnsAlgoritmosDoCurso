package exercicios.Interadores;

public class E8 {

	public static void main(String[] args) {
		int num = 0;

		for (int i = 0; i < 11; i++) {
			System.out.print(i + ",");
		}

		System.out.println();

		for (int i = 10; i > -1; i--) {
			System.out.print(i + ",");
		}

		System.out.println();

		for (int i = 0; i < 6; i++) {
			System.out.print(i * 2 + ",");
		}

		System.out.println();

		for (int i = 10; i > 0; i = i - 3) {
			System.out.print(i + ",");
		}

		System.out.println();

		for (int i = 0; i < 11; i++) {
			num = num + i;
			System.out.print(num + ",");
		}
	}
}

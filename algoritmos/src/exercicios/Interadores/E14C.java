package exercicios.Interadores;

public class E14C {

	public static void main(String[] args) {

		System.out.println("Exercício C");

		System.out.println("a");
		System.out.println("b");
		System.out.println("c");

		System.out.println("Exercício D");

		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i);
		}

		System.out.println();
		System.out.println("E");

		for (int j = 0; j < 2; j++) {
			for (char i = 'a'; i <= 'f'; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}

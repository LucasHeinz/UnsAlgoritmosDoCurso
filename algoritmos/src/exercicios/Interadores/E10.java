package exercicios.Interadores;

public class E10 {

	public static void main(String[] args) {
		for (int i = 0; i < 1001; i++) {
			if (i % 15 == 0 && i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}

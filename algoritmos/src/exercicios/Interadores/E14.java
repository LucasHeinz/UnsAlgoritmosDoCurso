package exercicios.Interadores;

public class E14 {

	public static void main(String[] args) {
		
		System.out.println("A");
		
		for(int i = 1; i < 4; i++) {
			System.out.println("->" + i);
			for(int j = 1; j < 4; j++) {
				System.out.println(j);
			}
		}
		
		System.out.println("B");
		
		for(int i = 1; i < 4; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(1);
			}
			System.out.println();
		}
	}
}

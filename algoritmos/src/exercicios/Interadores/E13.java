package exercicios.Interadores;

public class E13 {

	public static void main(String[] args) {

		System.out.println("A");

		for (int i = 1; i < 10; i++) {
			if (i == 1 || i == 9) {
				System.out.print(i);
			} else {
				System.out.print(i);
				System.out.print(i);
			}

		}

		System.out.println();
		System.out.println("B");

		for (int i = 9; i > 0; i--) {
			if (i == 1 || i == 9) {
				System.out.print(i);
			} else {
				System.out.print(i);
				System.out.print(i);
			}

		}
		
		System.out.println();
		System.out.println("C");
		
		for (int i = 1; i < 6; i++) {
			if(i == 3) {
				System.out.println("Aqui é o meio");
			} else {
				System.out.println(i);
			}
		}
		
		System.out.println("D");
		
		for (int i = 1; i < 7; i++) {
			if(i == 3) {
				System.out.println("Aqui é um dos meios da lista");
			} else if (i == 4) {
				System.out.println("Aqui é o outro meio da lista");
			} else {
				System.out.println(i);
			}
		}
		
		System.out.println("E"); 
		
		for (int i = 1; i < 10; i++) {
			if(i % 3 == 0) {
				System.out.println("Aqui é um terço da lista");
			} else {
				System.out.println(i);
			}
		}
		
		System.out.println("F");
		
		for(int i = 0; i < 3; i ++) {
			System.out.println(" ______________ \n |||||||||||||||||||||||||||||| \n ############## \n ********************");
		}
		
	}

}

package exercicios.Arrays_E_Matrizes;

public class Ex_7 {

	public static void main(String[] args) {
		
		String letras[] = new String[6];
		
		letras[0] = "A";
		letras[1] = "B";
		letras[2] = "C";
		letras[3] = "D";
		letras[4] = "E";
		letras[5] = "F";
		
		for(int i = 0; i < 6; i++) {
			System.out.println(letras[i]);
		}
		
		System.out.println("Na forma decrescente fica :");
		
		for(int i = 5; i >= 0; i--) {
			System.out.println(letras[i]);
		}
		
		System.out.println("Sem o 'C' fica :");
		
		for(int i = 0; i < 6; i++) {
			if(letras[i] != ("C")) {
				System.out.println(letras[i]);
			}
		}
	}
}

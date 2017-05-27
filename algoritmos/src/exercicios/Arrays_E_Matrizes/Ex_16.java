package exercicios.Arrays_E_Matrizes;

public class Ex_16 {

	public static void main(String[] args) {
		
		String letra[] = new String[10];
		
		for(int i = 0; i < 10; i++) {
			switch (i) {
			case 2:
				letra[i] = "A";
				break;
			case 4:
				letra[i] = "B";
				break;
			case 5:
				letra[i] = "C";
				break;
			case 7:
				letra[i] = "D";
				break;
			default:
				letra[i] = "W";
				break;
			}
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(letra[i]);
		}
	}
}

package exercicios.Arrays_E_Matrizes;

public class Ex_11 {

	public static void main(String[] args) {
		
		boolean verdade[] = new boolean[6];
		
		for(int i = 0; i < 6; i++) {
			if(i % 2 == 0) {
				verdade[i] = true;
			} else {
				verdade[i] = false;
			}
		}
	}
}

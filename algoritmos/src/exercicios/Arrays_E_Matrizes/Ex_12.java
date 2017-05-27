package exercicios.Arrays_E_Matrizes;

public class Ex_12 {

	public static void main(String[] args) {
		
		boolean verdade[] = new boolean[3];
		
		verdade[0] = true;
		verdade[1] = false;
		verdade[2] = true;
		
		for(int i = 0; i < 3; i++) {
			if(verdade[i]) {
				System.out.println("1");
			} else {
				System.out.println("2");
			}
		}
	}
}

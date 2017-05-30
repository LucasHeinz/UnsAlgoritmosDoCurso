package exercicios.Arrays_E_Matrizes;

public class Ex_24 {

	public static void main(String[] args) {

		char letras[] = new char[20];
		String fraseIncrivel = " ";
		
		letras[0] = 'e';
		letras[1] = 's';
		letras[2] = 't';
		letras[3] = 'a';
		letras[4] = ' ';
		letras[5] = 'a';
		letras[6] = 'c';
		letras[7] = 'a';
		letras[8] = 'b';
		letras[9] = 'a';
		letras[10] = 'n';
		letras[11] = 'd';
		letras[12] = 'o';
		letras[13] = ' ';
		letras[14] = 'a';
		letras[15] = ' ';
		letras[16] = 'a';
		letras[17] = 'u';
		letras[18] = 'l';
		letras[19] = 'a';
		
		for(int i=0; i<20; i++) {
			fraseIncrivel += letras[i];
		}
		System.out.println(fraseIncrivel);
	}
}

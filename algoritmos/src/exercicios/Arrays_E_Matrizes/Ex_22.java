package exercicios.Arrays_E_Matrizes;

import java.util.Scanner;

public class Ex_22 {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		int nums[] = new int[5], pergunta;
		boolean achei = false;
		
		System.out.println("Se você quiser, insira um incrível valor inteiro :D");
		pergunta = k.nextInt();
		
		for(int i=0;i<5;i++) {
			nums[i] = (i*2) + 1;
			if(pergunta == nums[i]) {
				achei = true;
			}
		}
		if(achei == true) {
			System.out.println("Achei o valor");
		}
	}
}

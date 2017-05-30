package exercicios.Interadores;

public class E7 {

	public static void main(String[] args) {
		for (int i = 10; i < 21; i++) {
			if (i % 10 == 0 && i % 5 == 0) {
				System.out.println("Este é um múltiplo de 10:"+i);
			} else if(i % 5==0) {
				System.out.println("Este é um múltiplo de 5 :"+i);
			}
		}
	}
}

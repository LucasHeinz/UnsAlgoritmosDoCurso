package exercicios.Condicionais_Interadores;

public class Num13 {

	public static void main(String[] args) {
		
		double sal = 600, salLiq;
		
		if(sal <= 600) {
			salLiq = sal;
		} else if(sal > 600 && sal <= 1200) {
			salLiq = sal * 0.8;
		} else if(sal > 1200 && sal <= 2000) {
			salLiq = sal * 0.75;
		} else {
			salLiq = sal * 0.7;
		}
		System.out.println("O salário líquido é " + salLiq);
	}
}

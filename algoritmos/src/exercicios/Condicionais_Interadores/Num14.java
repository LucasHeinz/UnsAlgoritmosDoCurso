package exercicios.Condicionais_Interadores;

public class Num14 {

	public static void main(String[] args) {
		
		double compra = 30, venda;
		
		if(compra < 20) {
			venda = compra * 1.5;
		} else {
			venda = compra * 1.35;
		}
		System.out.println("O valor da compra foi " + compra + " e o valor da venda será : " + venda);
	}
}

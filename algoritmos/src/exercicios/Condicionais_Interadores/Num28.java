package exercicios.Condicionais_Interadores;

public class Num28 {

	public static void main(String[] args) {
		
		String primeiroNome = "Vinícius", templateTexto = "Meu nome é %1$s. E de novo meu nome é %1$s";
		System.out.println(String.format(templateTexto, primeiroNome));
	}
}

package exercicios.Condicionais_Interadores;

public class Num29 {

	public static void main(String[] args) {
		
		String nome = "Lucas", cidade = "Blumenau", templateNome = "Olá, tudo bem? Meu nome é $$$, ",
				templateIdade = "tenho $$$ anos de idade, ",
				templateCidade = "e moro em $$$ desde de que eu nasci.",
				templatePais = " Moro com o(s) meu(s) $$$,", templateBairro = " no bairro da $$$.";
		System.out.println(String.format(templateNome, nome));
	}
}

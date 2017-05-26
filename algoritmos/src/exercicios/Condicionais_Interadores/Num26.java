package exercicios.Condicionais_Interadores;

public class Num26 {

	public static void main(String[] args) {
		
		String data = "25/05/2015", dia, mes, ano;
		
		int posDia = data.indexOf("/");
		dia = data.substring(0, posDia);
		
		int posMes = data.indexOf("/");
		int posMes2 = data.lastIndexOf("/");
		posMes++;
		mes = data.substring(posMes, posMes2);
		
		posMes2++;
		ano = data.substring(posMes2, 10);
		
		System.out.println("O dia é {" + dia + "}, do mês {" + mes + "}, do ano {" + ano + "}");
	}
}

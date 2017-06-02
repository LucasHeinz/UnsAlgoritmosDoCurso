package exercicios.Arrays_E_Matrizes;

public class Ex_12 {

	public static void main(String[] args) {

		boolean[] arrayBoolean = new boolean[3];
		arrayBoolean[0] = true;
		arrayBoolean[1] = false;
		arrayBoolean[2] = true;

		boolean todosVerdadeiros = true;
		for (int aux = 0; aux < arrayBoolean.length; aux++) {
			for (int aux2 = 0; aux2 < arrayBoolean.length; aux2++) {
				if (aux != aux2 && !(arrayBoolean[aux] || arrayBoolean[aux2])) {
					todosVerdadeiros = false;
				}
			}
		}
		if (todosVerdadeiros) {
			System.out.println("1");
		} else {
			System.out.println("2");
		}
	}
}

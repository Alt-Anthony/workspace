package javafirststeps;

public class EjemploMultiplicacion {
	public static void main(String[] args) {
		
		for(int contador=1; contador <= 10; contador++) {
			for (int contador2=1; contador2 <= 10; contador2++) {
				System.out.print(contador+"*"+contador2+"="+(contador2*contador));
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

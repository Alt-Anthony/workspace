package javafirststeps;

public class EjercicioFactorial {
	public static void main(String[] args) {
		int total =1;
		for (int contador = 1; contador<=10; contador ++) {	
			total *= contador;
			System.out.println("El factorial de "+contador+"! es "+total);
			
		}
		
	}
}

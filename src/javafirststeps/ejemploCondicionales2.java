package javafirststeps;

public class ejemploCondicionales2 {

	public static void main(String[] args) {
		System.out.println("Hello World");

		int edad = 21;
		int cantidadPersonas = 2;
		
		boolean esPareja = cantidadPersonas > 1;
		boolean puedeEntrar = edad >= 18 && esPareja;
		
		System.out.println("Valor: "+esPareja);
		
		if (puedeEntrar) {
			System.out.println("Usted puede entrar");
		}
		else {
			System.out.println("Usted no esta permitido a entrar");	
		}


	}
}
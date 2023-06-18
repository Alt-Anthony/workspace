package javafirststeps;

public class ejemploScope {
	public static void main(String[] args) {
		System.out.println("Hello World");

		int edad = 21;
		int cantidadPersonas = 2;
		
		boolean esPareja;
		
		if(cantidadPersonas>1) {
			esPareja = true;
		} else {
			esPareja = false;
		}
		//System.out.println("Valor: "+esPareja);
		boolean puedeEntrar = edad >= 18 && esPareja;
		if (puedeEntrar) {
			System.out.println("Usted puede entrar");
		}
		else {
			System.out.println("Usted no esta permitido a entrar");	
		}

	}
}

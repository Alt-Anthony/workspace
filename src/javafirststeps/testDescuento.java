package javafirststeps;

public class testDescuento {
	public static void main(String[] args) {

		double valorCompra = 299.0;

		if (valorCompra < 200.0) {
			System.out.println("Descuento del 10%");
		}else if (valorCompra <300) {
			System.out.println("Descuento del 15%");
		}else if (valorCompra >=300){
			System.out.println("Descuento del 20%");
		}
	}
}

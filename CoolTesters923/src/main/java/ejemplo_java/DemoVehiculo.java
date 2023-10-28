package ejemplo_java;

public class DemoVehiculo {

	public static void main(String[] args) {
		
		Vehiculo minivan = new Vehiculo();
		
		int rango;
		
		//asignar valores a las variables
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;

		//Calcular el rango asumiendo un tanque lleno
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango de: " + rango + " kilometros");
		
		
		Vehiculo carro = new Vehiculo();
		
		carro.pasajeros = 4;
		
		System.out.println("Mumero de pasajeros en carro es: " + carro.pasajeros);
	}

}

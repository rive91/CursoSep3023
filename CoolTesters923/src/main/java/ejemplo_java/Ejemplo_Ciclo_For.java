package ejemplo_java;

public class Ejemplo_Ciclo_For {

	public static void main(String[] args) {
		
		int y = 5;
		
		//bucle FOR comienza cuando x = 0, X es una variable "local" dentro del bucle FOR
		for (int x = 0; x <= y; x++) { // el bucle se ejecuta hasta que x es igual o menor a y
			System.out.println("Valor de x: " + x);
		}
	}

}

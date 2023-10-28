package ejemplo_java;

public class Ejemplo_Arreglo_Unidimensional {

	public static void main(String[] args) {
		
		//Ambos ejemplos son declaracion validas de arreglos
		int intArray[];
		int [] intArray2;
		
		//declarar array de strings
		String[] arr;
		
		//asignando memeoria/posiciones para 5 enteros
		arr = new String[5];
				
		//Iniicializar y asignar el primer elemento del arreglo
		arr[0] = "cero";
		
		arr[1] = "uno";
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";
		
		System.out.println("El valor de la posicion dos en el arreglo es: " + arr[2]);
		

		//acceder a todos los elementos del arreglo
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Elemento en la posicion " + i + " : " + arr[i]);
		}

	}

}

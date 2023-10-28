package ejemplo_java;

public class Ejemplo_Metodo {

	public static void main(String[] args) {
		
		int resultadoSuma = suma(40,50);
		
		System.out.println(resultadoSuma);
		
		int resultadoSuma3 = suma(40,50,90);
		
		System.out.println(resultadoSuma3);

	}
	
	public static int suma(int a, int b) {
		
		int c = a + b;
		
		return c;
	}
	
	public static int suma(int a, int b, int c) {
		
		int d = a + b + c;
		
		return d;
	}

}

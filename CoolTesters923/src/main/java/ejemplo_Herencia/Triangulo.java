package ejemplo_Herencia;

public class Triangulo extends Dosdimensiones{
	
	String estilo;
	
	double area() {
		return base * altura/2;
	}
	
	void mostrarEstilo() {
		System.out.println("Triangulo es: " + estilo);
	}

}

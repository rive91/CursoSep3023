package ejemplo_java;

public class Ejemplo_Switch {

	public static void main(String[] args) {

		int i = 2;
		
		switch (i) {
		
		case 0:
			System.out.println("i es cero");
			break;
		case 1:
			System.out.println("i es uno");
			break;
		case 2:
			System.out.println("i es dos");
			break;
		default:
			System.out.println("i es mayor que 2.");
			break;
		}

	}

}

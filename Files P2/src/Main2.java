
public class Main2 {
	public static void main(String[] args) {
		String texto ="Hola Mundo";
		int x=5;
		try {
			System.out.println("La letra en "+x+" es "+texto.charAt(x));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("Esa posicion es invalida");
		}
	}
	
	
}

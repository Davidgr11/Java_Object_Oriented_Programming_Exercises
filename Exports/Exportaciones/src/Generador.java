import java.util.Random;

public class Generador {

	private static final String[] BARCOS = {"Victoria", "Libertad", "Alba", "Tempestad", "Zafiro", "Perla", "Aventura", "Fortuna"};
	private static final String[] AVIONES = {"Airbus 300 B4", "Airbus 00 B4", "Boeing 747", "Boeing 757", "AN 225", "AN 124", "IL 76", "AN 12" };
	
	public static final String generaPlaca() {
		Random rand = new Random();
		char letra = (char) (rand.nextInt(26) + 'A');
		return letra+"-"+rand.nextInt(1000,9999);
	}
	
	public static final String generaNombreBarco() {
		Random rand = new Random();
		return BARCOS[rand.nextInt(BARCOS.length)];
	}
	public static final String generaModeloAvion() {
		Random rand = new Random();
		return AVIONES[rand.nextInt(AVIONES.length)];
	}
}

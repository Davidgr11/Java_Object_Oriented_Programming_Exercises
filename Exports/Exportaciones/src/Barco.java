
public class Barco extends Vehiculo{
	private String nombre;
	
	public Barco() {
		super(5);
		nombre = Generador.generaNombreBarco();
	}
	
	public String toString() {
		return "Barco "+nombre;
	}
	
}

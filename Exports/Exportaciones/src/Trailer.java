
public class Trailer extends Vehiculo{
	private String placas;
	
	public Trailer() {
		super(2);
		placas = Generador.generaPlaca();
	}
	
	public String toString() {
		return "Trailer placas["+placas+"]";
	}

}

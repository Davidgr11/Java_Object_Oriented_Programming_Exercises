
public class Avion extends Vehiculo{
	private String modelo;
	
	public Avion() {
		super(3);
		modelo = Generador.generaModeloAvion();
	}
	
	public String toString() {
		return "Avión modelo "+modelo;
	}
	
}

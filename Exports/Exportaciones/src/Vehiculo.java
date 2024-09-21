
public class Vehiculo {
	protected int capacidad, totalCargado;

	public Vehiculo(int capacidad) {
		super();
		this.capacidad = capacidad;
		totalCargado = 0;
	}
	
	public boolean agregarCargamento() {
		totalCargado++;
		if(totalCargado >= capacidad)
			return true;
		return false;
	}
	
}

import java.io.Serializable;

public class Coche implements Serializable{
	//atributos
	private int velocidad;
	private int placa;
	
	public Coche(int velocidad, int placa) {
		this.velocidad=velocidad;
		this.placa=placa;
	}
	
	public String toString() {
		return "Velocidad: " +velocidad+"km/h Placa: "+placa;
	}
	public int getVelocidad() {
		return velocidad;
	}
}

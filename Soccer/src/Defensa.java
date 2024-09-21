
public class Defensa extends Jugador{
	//atributos
	private int robos;

	//constructor
	public Defensa(String nombre, String apellido, int numero) {
		super(nombre, apellido, numero);
		robos=0;
	}
	
	//setters y getters
	public int getRobos() {
		return robos;
	}
	public void setRobos(int robos) {
		this.robos = robos;
	}
	public String toString() {
		return nombre+" "+apellido+" ("+numero+") robos: "+robos+" puntos: "+obtienePuntos(robos, 25);
	}
}

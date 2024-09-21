
public class Delantero extends Jugador{
	//atributos
	private int goles;

	//constructor
	public Delantero (String nombre, String apellido, int numero) {
		super(nombre, apellido, numero);
		goles=0;
	}
	
	//setters y getters
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles = goles;
	}
	public String toString() {
		return nombre+" "+apellido+" ("+numero+") goles: "+goles+" puntos: "+obtienePuntos(goles, 100);
	}
}

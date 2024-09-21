
public class Portero extends Jugador{
	//atributos
	private int atajadas;

	//constructor
	public Portero(String nombre, String apellido, int numero) {
		super(nombre, apellido, numero);
		atajadas=0;
	}
	
	//setters y getters
	public int getAtajadas() {
		return atajadas;
	}
	public void setAtajadas(int atajadas) {
		this.atajadas = atajadas;
	}
	public String toString() {
		return nombre+" "+apellido+" ("+numero+") atajadas: "+atajadas+" puntos: "+obtienePuntos(atajadas, 50);
	}
}
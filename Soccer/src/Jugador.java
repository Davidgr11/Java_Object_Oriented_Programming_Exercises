
public class Jugador {
	//atributos
	protected String nombre, apellido;
	protected int numero;
	
	//constructor
	public Jugador(String nombre, String apellido, int numero) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numero = numero;
	}
	
	public int obtienePuntos(int valor, int puntos) {
		return valor*puntos;
	}
	//setters y getters
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getNumero() {
		return numero;
	}
	public String toString() {
		return nombre+" "+apellido+" ("+numero+")";
	}
	
}

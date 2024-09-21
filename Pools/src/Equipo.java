//Gonzalez Robles David Alejandro
public class Equipo {
	//atributos
	private String nombre;
	private int goles;
	
	//constructor
	public Equipo(String nombre, int goles) {
		this.nombre=nombre;
		this.goles=goles;
	}
	//setters y getters
	public String getNombre() {
		return nombre;
	}
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles = goles;
	}
	
	
}

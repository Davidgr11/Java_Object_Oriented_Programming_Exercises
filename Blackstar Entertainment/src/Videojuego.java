
public class Videojuego extends VyP {//extiende al padre
	
	//Atributos exclusivos de los videojuegos
	private String clasificacionESRB;
	private int numJugadores;
	
	//Constructor
	public Videojuego(String nombre, double precio, int anio, String clasificacionESRB, int numJugadores, int existencias, int genero) {
		super(nombre, precio, anio, existencias, genero);//manda al constructor del padre
		this.clasificacionESRB = clasificacionESRB;
		this.numJugadores = numJugadores;
	}
	
	public String toString(){
		return "Videojuego"+"\n Nombre: "+nombre+"\n Precio: "+precio+"\n Año: "+anio+"\n Clasificacion ESRB: "+clasificacionESRB+"\n Jugadores: "+numJugadores+"\n Exitencias: "+existencias+"\n Genero: "+Genero.getGenero(genero);
	}

}
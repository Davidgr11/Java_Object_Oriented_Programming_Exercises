public class Peliculas extends VyP {//extiende al padre
	
	//Atributos exclusivos de las peliculas
	private String clasificacionMPAA;
	private int duracion;//en minutos
	private String paisO;
	
	//Constructor
	public Peliculas(String nombre, double precio, int anio, String clasificacionMPAA, int duracion, String paisO, int existencias, int genero) {
		super(nombre, precio, anio, existencias, genero);
		this.paisO = paisO;
		this.clasificacionMPAA=clasificacionMPAA;
		this.duracion=duracion;
	}

	public String toString(){
		return "Película "+"\n Nombre: "+nombre+"\n Precio: "+precio+"\n Año: "+anio+"\n Clasificacion MPAA: "+clasificacionMPAA+"\n Duracion: "+duracion+" minutos\n Pais: "+paisO+"\n Exitencias: "+existencias+"\n Genero: "+Genero.getGenero(genero);
	}
	
}
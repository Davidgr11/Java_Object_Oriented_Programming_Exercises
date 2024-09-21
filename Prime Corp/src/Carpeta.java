
public class Carpeta {
	//atributos
	private String nombre;
	private Fecha fechaC;
	private Carpeta padre;
	
	//constructor
	public Carpeta(String nombre, Fecha fechaC, Carpeta padre) {
		this.nombre=nombre;
		this.fechaC=fechaC;
		this.padre=padre;
	}
}

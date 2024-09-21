public class VyP {//Clase padre
	//Atributos
	protected String nombre;
	protected double precio;
	protected int anio;
	protected int existencias;
	protected int genero;
	
	//Constructor
	public VyP(String nombre, double precio, int anio, int existencias, int genero) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.anio = anio;
		this.existencias=existencias;
		this.genero=genero;
	}
	
	//SyG
	public String getNombre(){
		return nombre;
	}
	public double getPrecio() {
		return precio;
	}
}

public class Producto {
	//atributos
	protected String nombre;
	protected double precio;
	
	//constructor
	public Producto(String nombre, double precio) {
		this.nombre=nombre;
		this.precio=precio;
	}
	public String getNombre() {
		return nombre;
	}
	public double getPrecio() {
		return precio;
	}
}

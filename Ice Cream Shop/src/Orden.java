
public class Orden {
	//atributos
	private int cantidad;
	Producto producto;
	Sabor sabor;
	Fecha date;
	
	public Orden(Producto producto, Sabor sabor, int cantidad, Fecha date) {
		this.producto=producto;
		this.sabor=sabor;
		this.cantidad=cantidad;
		this.date=date;
		
	}
	//metodos
	public double getCosto() {
		return (producto.getPrecio())*cantidad;
	}
}

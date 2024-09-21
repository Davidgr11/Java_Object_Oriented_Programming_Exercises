
public class Orden {
	private Producto prod;
	private Sabor sabor;
	private int cant;
	
	public Orden(Producto prod, Sabor sabor, int cant) {
		this.prod = prod;
		this.cant = cant;
		this.sabor = sabor;
	} 
	
	public double getCosto() {
		return cant*prod.getPrecio();
	}
	
	public String toString() {
		return prod.getNombre()+" "+sabor.getNombre()+"\t$"+prod.getPrecio()+"\tcant: "+cant;
	}
}

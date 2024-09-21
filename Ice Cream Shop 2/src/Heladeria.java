
public class Heladeria {
	private Sabor[] sabores = new Sabor[3];
	private Producto[] productos = new Producto[4];
	
	public Heladeria() {
		sabores[0] = new Sabor("Chocolate");
		sabores[1] = new Sabor("Vainilla");
		sabores[2] = new Sabor("Fresa");
		
		productos[0] = new Helado();
		productos[1] = new HeladoDoble();
		productos[2] = new Malteada();
		productos[3] = new BananaSplit();
	}
	
	public void imprimeSabores() {
		int i;
		for(i=0; i<sabores.length; i++) {
			System.out.println((i+1)+") "+sabores[i].getNombre());
		}
	}
	
	public void imprimeProductos() {
		int i;
		for(i=0; i<productos.length; i++) {
			System.out.println((i+1)+") "+productos[i].getNombre());
		}
	}
	
	public int getSaboresTotal() {
		return sabores.length;
	}
	
	public int getProductosTotal() {
		return productos.length;
	}
	
	public Sabor getSabor(int i) {
		return sabores[i];
	}
	public Producto getProducto(int i) {
		return productos[i];
	}
}

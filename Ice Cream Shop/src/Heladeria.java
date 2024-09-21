
public class Heladeria {
	//atributos
	Producto[] products=new Producto[4];
	Sabor[] sabores=new Sabor[3];
	
	//constructor
	public Heladeria() {
		products[0]=new Helado("Helado sencillo", 10.0);
		products[1]=new HeladoDoble("Helado doble", 17.5);
		products[2]=new Malteada("Malteada", 24.5);
		products[3]=new BananaSplit("Banana split", 32.0);
		sabores[0]=new Sabor("Chocolate");
		sabores[1]=new Sabor("Fresa");
		sabores[2]=new Sabor("Vainilla");
		
	}
	//metodos
	public void imprimeSabores() {
		for(int i=0;i<3;i++) {
			System.out.println((i+1)+")"+sabores[i].getNombre());
		}
	}
	public void imprimeProductos() {
		for(int i=0;i<4;i++) {
			System.out.println((i+1)+")"+products[i].getNombre());
		}
	}
	public Sabor getSabor(int i) {
		return sabores[i];
	}
	public Producto getProducto(int i) {
		return products[i];
	}
	public int getSaboresTotal() {
		return 3;
	}
	public int getProductosTotal() {
		return 4;
	}
}

public class Carrito {
	//Atributos
	private VyP[] productos=new VyP[10];
  	private int total;//TOTAL DE PRODUCTOS
	
  	//Constructor
  	public Carrito(){
    	total=0;
  	}
	
  	//Metodos
  	public void agregarProducto(VyP producto) {
  		this.productos[total]=producto;
  		total++;
  	}
  	public void imprimirCarrito() {
  		int i=1;
  		System.out.println("-----RESUMEN DE COMPRA-----");
  		double montoFinal=0;
  		for(int j=0;j<total;j++){
        	System.out.println("PRODUCTO AGREGADO "+i);
        	if(productos[j] instanceof Videojuego){
        		System.out.print("Videojuego: ");
        	}
        	else {
        		System.out.print("Pelicula: ");
        	}
  			System.out.println(productos[j].getNombre()+" | $"+productos[j].getPrecio());
  			montoFinal=montoFinal+(productos[j].getPrecio());
  			System.out.println("----------------------");
  		    i++;
  		}
  		System.out.println("**********************************\nPrecio total de la compra: "+montoFinal);
  	}
  	
  	//SyG
	public void setTotal(int total){
    	this.total=total;
  	}	
	public int getTotal(){
		return total;
	}
	public String getPN(int i) {
		i--;
		return productos[i].nombre;
	}
	public void setProducto(int i) {
		i--;
		productos[i]=null;
	}
	
}
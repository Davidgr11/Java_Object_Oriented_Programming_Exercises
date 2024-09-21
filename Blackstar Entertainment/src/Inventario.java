import java.util.Random;

public class Inventario {
  //ATRIBUTOS
	private VyP[] productos=new VyP[10];
  
  //CONSTRUCTOR
	public Inventario(){
  		Random rand=new Random();
		productos[0]=new Peliculas("Harry Potter", 400, 1997, "PG-Guia paternal sugerida", 120, "Inglaterra", rand.nextInt(1,4), 1);
		productos[1]=new Peliculas("El conjuto", 700, 2014, "NC-17-Sin admitir audiencias de menor de edad y 17", 100, "Irlanda", rand.nextInt(1,4), 1);
		productos[2]=new Peliculas("Batman", 1000, 2022, "PG-13-Guia paternal estricta", 180, "Estados Unidos", rand.nextInt(1,4), 3);
		productos[3]=new Peliculas("Shrek", 500, 2001, "G-Todas las audiencias", 135, "Canada", rand.nextInt(1,4), 2);
		productos[4]=new Peliculas("Jurasic World 3", 850, 2022, "R-Restringido", 150, "Francia", rand.nextInt(1,4), 3);
		productos[5]=new Videojuego("FIFA", 1200, 2022, "Todos", 2, rand.nextInt(1,4), 1);
		productos[6]=new Videojuego("Call of duty", 750, 2003, "Mayores de 17 anios", 10, rand.nextInt(1,4), 3);
		productos[7]=new Videojuego("Fornite", 500, 2018, "Mayores de 10 anios", 15, rand.nextInt(1,4), 3);
		productos[8]=new Videojuego("Miniom Rush", 300, 2011, "Mayores de 13 anios", 7, rand.nextInt(1,4), 2);
		productos[9]=new Videojuego("El príncipe de Persia y Farah", 600, 2013, "Solo adultos", 4, rand.nextInt(1,4), 2);
		
	}

	//Metodos
	public void imprimeProductos(int tipo){
	    int i=1;
	    if(tipo==-1){//impresion de todos los productos de manera general
	  		for(VyP pr:productos){
	        	System.out.println("PRODUCTO "+i);
	        	if(pr instanceof Videojuego){
	        		System.out.print("Videojuego: ");
	        	}
	        	else {
	        		System.out.print("Pelicula: ");
	        	}
	  			System.out.println(pr.getNombre());
	  			System.out.println("----------------------");
	  		    i++;
	  		}
	    }
	    else{
	      	System.out.println(productos[tipo]);//impresion completa del producto seleccionado
	    }
	}
	
	public void imprimeDisponibles(int tipo) {
		int i=1;
	    if(tipo==-1){//impresion de todos los productos de manera general
	  		for(VyP pr:productos){
	        	System.out.println("PRODUCTO "+i);
	        	if(pr.existencias>0) {
		        	if(pr instanceof Videojuego){
		        		System.out.print("Videojuego: ");
		        	}
		        	else {
		        		System.out.print("Pelicula: ");
		        	}
		  			System.out.println(pr.getNombre());
		  			System.out.println("Existencias: "+pr.existencias);
		  			System.out.println("----------------------");
		  		    
	  			}
	        	else {
	        		System.out.println("LO SENTIMOS, ESTE PRODUCTO YA ESTA AGOTADO");
	        		System.out.println("----------------------");
	        	}
	        	i++;
	  		}
	    }
	    else{
	      	System.out.println(productos[tipo]);//impresion completa del producto seleccionado
	    }
	}

	public int getPE(int i) {
		return productos[i].existencias;
	}	
	public void setPE(int i, int valor) {
		productos[i].existencias+=valor;
	}
	public VyP getProducto(int i) {
		return productos[i];
	}
	public String getPN(int i) {
		return productos[i].nombre;
	}
}
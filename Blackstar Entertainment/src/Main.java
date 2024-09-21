/*
	Practica 2: Blackstar Entertainment
	Equipo:
		Caballero Angeles Karina
  		Garcia Aguilar Ruben
  		Gonzalez Robles David Alejandro
 */
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		System.out.println("*******************************************\n***BIENVENIDO A BLACKSTAR ENTERTAINMENT****\n*******************************************");
		//DECLARACIONES 
    	Inventario inv=new Inventario();//creacion manual de productos
		Carrito car=new Carrito();
		int opc, imprimir=0, agregar;
		Scanner scan=new Scanner(System.in);

		//CICLO PRINCIPAL
		do{
			System.out.println("\n1. Ver productos \n2. Vender productos \n3. Salir");
			opc=scan.nextInt();
			switch(opc){
				case 1: 
					imprimir=-1;
              		inv.imprimeProductos(imprimir);//impresion de productos de manera general
	                System.out.println("*******************************\nElige un producto para imprimir su información completa [1-10] o elige 0 sino deseas ver ninguno");
	                imprimir=scan.nextInt();
	                //ciclo para validar rango
			        if(imprimir<11 && imprimir>0){
			        	imprimir--;
	              		inv.imprimeProductos(imprimir);//impresion del producto seleccionado
			        }
		            else{
	                	if(imprimir!=0)
		          	    	System.out.println("Error de rango");
	            	}
					break;
					
				case 2:
					int eleccion=0;
					do {
						System.out.println("---------------PRODUCTOS DISPONIBLES---------------");
						imprimir=-1;
	              		inv.imprimeDisponibles(imprimir);//impresion general de disponibles
						if(car.getTotal()<10){
							System.out.println("\n¿Que producto deseas agregar al carrito? [1-10]");
							agregar=scan.nextInt();
							if(agregar<11 && agregar>0){//validacion de rango
								agregar--;
								inv.getPE(agregar);
								if(inv.getPE(agregar)>0) {
									inv.setPE(agregar, -1);//quitamos una existencia
									System.out.println("Actualizacion de productos disponibles");
									inv.imprimeDisponibles(imprimir);
									car.agregarProducto(inv.getProducto(agregar));//agregamos el producto
									System.out.println("Producto agregado y lista actualizada con exito\n Cantidad de productos en el carrito: "+car.getTotal());
								}
								else {
									System.out.println("El producto que seleccionaste esta agotado");
								}
							}
							else{
			            	if(imprimir!=0)
			            		System.out.println("Error de rango, vuelve a intentarlo");
							}
						}
						else {
							System.out.println("EL CARRITO ESTA LLENO :)");//ya hay 10 productos
						}
						//validacion de eleccion
						System.out.println("************************************");
						System.out.println("¿Que deseas realizar?\n 1)Continuar comprando\n 2)Finalizar compra\n 3)Interrumpir y cancelar compra");
						eleccion=scan.nextInt();
					}while(eleccion==1);
					if(eleccion==2) {//finalizo compra, muestra carrito y precio total
						car.imprimirCarrito();
					}
					if(eleccion==3) {//interrumpio o cancelo la compra
						int cantidad=car.getTotal();
						for(cantidad=cantidad; cantidad!=0;cantidad--) {
							for(int i=0;i<10;i++) {
								if((inv.getPN(i)).equals(car.getPN(cantidad))){
									inv.setPE(i, 1);
								}
							}
						}
						cantidad=car.getTotal();
						for(cantidad=cantidad; cantidad!=0;cantidad--) {
							car.setProducto(cantidad);
						}
						car.setTotal(cantidad);
						System.out.println("Los productos regresaron al inventario de manera exitosa\nEl carrito se vacio de manera exitosa");
					}
          
					break;
				case 3:
					System.out.println("Vuelva pronto a su tienda favorita");
					break;
				default:
					System.out.println("Opcion invalida");
					break;
			}
		}while(opc!=3);
		scan.close();
	}
}
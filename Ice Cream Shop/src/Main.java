import java.util.Scanner;
//David Gonzalez
public class Main {

	public static void main(String[] args) {
		System.out.println("________________________________________");
		System.out.println("---BIENVENIDO A LA HELADERIA HIMALAYA---\n");
		Scanner scan=new Scanner(System.in);
		int opc, opc2, producto, sabor, cantidad, orden=0, venta=0;
		Heladeria hela=new Heladeria();
		Orden[] ordenes=new Orden[100];
		Venta[] ventas=new Venta[100];
		
		//ciclo de ventas
		do {
			//ciclo de ordenes
			do {
			System.out.println("Selecciona una opcion de nuestro menu\n");
			
			//eleccion de producto
			hela.imprimeProductos();
			producto=scan.nextInt();
			while(producto>4 || producto<1) {
				System.out.println("Opcion fuera de rango, favor de seleccionar nuevamente");
				hela.imprimeProductos();
				producto=scan.nextInt();
			}
			//eleccion de sabor
			hela.imprimeSabores();
			sabor=scan.nextInt();
			while(sabor>3 || sabor<1) {
				System.out.println("Opcion fuera de rango, favor de seleccionar nuevamente");
				hela.imprimeSabores();
				sabor=scan.nextInt();
			}
			//eleccion de cantidad
			System.out.println("Cuantos desea comprar?");
			cantidad=scan.nextInt();
			
			Fecha date=new Fecha();
			ordenes[orden]=new Orden(hela.getProducto(producto-1), hela.getSabor(sabor-1), cantidad, date);
			System.out.println("Desea otro producto?\n 1)Si   Otro)No");
			opc=scan.nextInt();
			if(opc==1) {
				orden++;
			}
			for(int i=0;i<orden;i++) {
				ventas[venta].agregaOrden(ordenes[orden]);
			}
			}while(opc==1);
			
		
			System.out.println("Quieres registrar otra venta?\n 1)Si   Otro)No");
			opc2=scan.nextInt();
			if(opc2==1) {
				venta++;
			}
		}while(opc2==1);
		
		
	}

}

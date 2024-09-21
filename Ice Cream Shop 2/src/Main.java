import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Heladeria heladeria = new Heladeria();
		int opc, prod, sabor, cant;
		Scanner scan = new Scanner(System.in);
		
		do {
			Venta venta = new Venta();
			do {
				do {
					System.out.println("Que quieres comprar? ");
					heladeria.imprimeProductos();
					prod = scan.nextInt();
				}while(prod<=0 || prod > heladeria.getProductosTotal());
				do {
					System.out.println("De que sabor lo quieres? ");
					heladeria.imprimeSabores();
					sabor = scan.nextInt();
				}while(sabor<=0 || sabor > heladeria.getSaboresTotal());
				do {
					System.out.print("Cuantos quieres comprar? ");
					cant = scan.nextInt();
				}while(cant<=0);
				venta.agregaOrden(new Orden(heladeria.getProducto(prod-1), heladeria.getSabor(sabor-1), cant));
				System.out.println("Quieres otro producto? 1) Si 0) No");
				opc = scan.nextInt();
			}while(opc!= 0);
			venta.imprimeVenta();
			venta.exportaVenta();
			
			System.out.println("\nQuieres registrar otra venta?\n1) Si 0) No");
			opc = scan.nextInt();
		}while(opc!=0);
		scan.close();
	}

}

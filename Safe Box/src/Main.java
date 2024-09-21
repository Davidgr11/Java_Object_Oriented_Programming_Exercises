import java.util.Scanner;

//González Robles David Alejandro

public class Main {

	public static void main(String[] args) {
		System.out.println("Ejercicio: CAJA FUERTE");
		//Declaración de variables
		CajaFuerte caja=new CajaFuerte(12345, false);
		int opc;
		String contenido;
		Scanner scan=new Scanner(System.in);
		do {
			System.out.println("\n¿Qué deseas realizar?");
			System.out.println("1) Guardar\n2) Sacar\n3) Abrir\n4) Cerrar \n5)Salir del programa");
			opc=scan.nextInt();
			switch(opc) {
				case 1: System.out.println("Dime el contenido a ingresar");
						contenido=scan.next();
						caja.guardar(contenido);
						break;
				case 2: caja.sacar();
						break;
				case 3: caja.abrir();
						break;
				case 4: caja.cerrar();
						break;
				case 5: System.out.println("Adios");
						break;
				default: System.out.println("Opcion invalida");
						break;
			}
		}while(opc!=5);
		scan.close();
	}

}

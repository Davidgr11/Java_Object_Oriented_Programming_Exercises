import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Vehiculo[] vehiculos = new Vehiculo[3];
		vehiculos[0] = new Trailer();
		vehiculos[1] = new Barco();
		vehiculos[2] = new Avion();
		Scanner scan = new Scanner(System.in);
		
		int opc;
		Exportacion export;
		
		do {
			System.out.println("El envío es urgente?\n1) Si 0) No");
			opc = scan.nextInt();
			if(opc >=1) {
				export = new ExportaAvion();
				if(export.exportar(vehiculos[2])) {
					vehiculos[2] = new Avion();
				}
			}else {
				System.out.println("El envío es nacional?\n1) Si 0) No");
				opc = scan.nextInt();
				if(opc >=1) {
					export = new ExportaTrailer();
					if(export.exportar(vehiculos[0]))
						vehiculos[0] = new Trailer();
				}else{
					export = new ExportaBarco();
					if(export.exportar(vehiculos[1]))
						vehiculos[1] = new Barco();
				}
			}
			System.out.println("Preparar otro envio?\n1) Si 0) No");
			opc = scan.nextInt();
		}while(opc != 0);
		scan.close();

	}

}

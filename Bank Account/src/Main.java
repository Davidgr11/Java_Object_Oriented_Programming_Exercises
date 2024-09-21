import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int opc;
		double cant; 
		
		CuentaDebito cuenta;
		System.out.println("Que tipo de cuenta quieres?");
		System.out.println("1) Basica\n2) Plus\n3) Nomina");
		opc = scan.nextInt();
		switch(opc) {
			case 1: 
				cuenta = new Basica( rand.nextInt(10000, 100000) );
			break;
			case 2: 
				cuenta = new Plus( rand.nextInt(10000, 100000) );
			break;
			default:
				cuenta = new Nomina( rand.nextInt(10000, 100000) );
			break;
		}
		System.out.println("Tu cuenta con numero: "+cuenta.getNumero()+ " ha sido creada");
		do {
			System.out.println("Que quieres hacer?");
			System.out.println("1) Depositar\n2) Retirar\n3) Ver saldo\n0) Salir");
			opc = scan.nextInt();
			switch(opc) {
				case 1:
					System.out.println("Cuanto quieres depositar?");
					
					cuenta.depositar(scan.nextDouble());
					break;
				case 2:
					System.out.println("Cuanto quieres retirar?");
					cant = scan.nextDouble();
					cuenta.retirar(cant);
					break;
				case 3:
					System.out.println("Tu saldo es: $"+cuenta.getSaldo());
					break;
			}
		}while(opc!=0);
		scan.close();
	}

}

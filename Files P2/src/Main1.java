import java.util.Scanner;

public class Main1 {
	
	public static void main1(String[] args) {
		int x, y, total;
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Dame X");
			x=Integer.parseInt(scan.next());
			System.out.println("Dame Y");
			y=scan.nextInt();
			total = x/y;
			System.out.println("X/Y= "+total );	
		}catch( ArithmeticException e ) {
			System.out.println("No puedes dividir entre 0");
		}catch( NumberFormatException e2 ) {
			System.out.println("Debes escribir numeros");
		}catch(Exception e) {
			System.out.println("Ocurrio algo malo");
			//e.printStackTrace();
		}
		System.out.println("Otra instruccion");
		/*
		System.out.println("Dame Z");
		double z=scan.nextDouble();
		double raiz = Math.sqrt(z);
		System.out.println("Raiz= "+raiz);*/
		
	}

}

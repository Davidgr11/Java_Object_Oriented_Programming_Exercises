import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Ejercicio: Concatenacion");
		
		//Declaración de variables
		Scanner scan=new Scanner(System.in);
		String nombre="", oracion="";
		char x=52, y=51, z=49, w=48;//les asigno el numero ASCII

		//ciclo base
		do
		{
			System.out.println("Ingresa una palabra:");
			nombre=scan.nextLine().toLowerCase(); //lee una palabra y la hace minúsculas
			oracion= oracion+nombre+" ";

		}while(nombre!="");	//while(nombre.length()!=0);	
		scan.close();
		
		System.out.print(oracion.replace('a', x).replace('e', y).replace('i', z).replace('o', w));
	}

}

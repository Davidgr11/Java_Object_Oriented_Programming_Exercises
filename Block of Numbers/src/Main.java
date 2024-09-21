import java.util.Scanner;
//Gonzalez Robles David Alejandro

public class Main {

	public static void main(String[] args) {
		System.out.println("Ejercicio: BLOQUE DE NUMEROS");
		
		//declaración de variables
		int num=0, opc, cont, bloque=1;
		Scanner scan=new Scanner (System.in);
		
		//ciclo que avanza de 50 en 50
		do {
			System.out.println("Bloque "+bloque);
			bloque++;
			for(cont=0;cont<50;cont++) {
				num++;//sigue aumentando, nunca vuelve a cero
				System.out.println(num);
			}
			System.out.println("Deseas continuar con el siguiente bloque?\n1)Si Otro)No");
			opc=scan.nextInt();
		}while(num<1000 && opc==1);
		
		//Mensajes según la forma en que terminó el programa
		if(num==1000)
			System.out.println("Has llegado al limite de numeros");
		if(opc!=1 ||num==1000)
			System.out.println("Hasta luego :)");
		scan.close();
	}

}

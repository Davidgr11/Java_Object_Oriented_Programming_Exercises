import java.util.Scanner;
//González Robles David Alejandro

public class Main {

	public static void main(String[] args) {
		System.out.println("Ejercicio: Serie ULAM");
		
		//Declaración de variables
		Scanner scan=new Scanner(System.in);
		int num=0, cont=1;
		
		//Validación de número natural
		while(num<1){
			System.out.println("Dame un numero natural");
			num=scan.nextInt();
		}
		System.out.print(num);
		
		while(num!=1){//mientras no llegue a 1, se repite
			if(num%2==0) {
				num=num/2;
			}else {
				num=(num*3)+1;
			}
			System.out.print("\n"+num);
			cont++;
		}
		scan.close();
		System.out.println("\nTotal de terminos obtenidos: "+cont);
	}

}
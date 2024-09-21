/*
Integrantes del equipo
    Gonzalez Robles David Alejandro
    Reyna Alvarez Aldo Uriel
    Hinojosa Amaya Emilio Isaac
*/
import java.util.Scanner;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
    System.out.println("Ejercicio: Piedra, papel o tijera.");
    
    //Declaracion de variables
    Elemento[] el=new Elemento[3];
    int opc, i, num, pc, vidaus=3, vidapc=3, validar;
    //las vidas no las tiene el elemento, sino el usuario o la pc en el juego
    Scanner scan=new Scanner(System.in);
    String nom, nom2, ven, vi;
    Random rand=new Random();

    //Se crean los objetos y se van al constructor
    //Mando uno por uno porque el contenido es diferente
    el[0]=new Elemento("Piedra", "Tijeras");
    el[1]=new Elemento("Papel", "Piedra");
    el[2]=new Elemento("Tijeras", "Papel");
    System.out.println("Vidas usuario: "+vidaus);
    System.out.println("Vidas PC: "+vidapc);

    //ciclo base
    do{
    	System.out.println();
	      System.out.println("Opciones:");
	      
	      //impresion de las opciones
	      for(i=0;i<3;i++){
	        System.out.print(i+" Objeto: ");
	        nom=el[i].getNombre();
	        //uso nom para almacenar temporalmente el nombre
	        System.out.print(nom);
	        System.out.print("  Vence a: ");
	        ven=el[i].getVence();
	        System.out.print(ven);
	        System.out.println();
	        /*PARA YA NO NECESITAR EL GET
	        public void imprimeDatos(int i) {
	    		System.out.println(i+") "+ nombre+ " vence a "+venceA);
	    	}*/
	      }
	      
	      //seleccion para el usuario
	      System.out.println("Elige el objeto");
	      num=scan.nextInt();
	      while(num>2 || num<0){
	        System.out.println("Error de rango, ingresa un objeto 0-2");
	        num=scan.nextInt();
	      }
	      
	      //seleccion para la pc
	      pc=rand.nextInt(0,2);
	      
	      //confirmacion de seleccion
	      nom=el[num].getNombre();//uso num para indicar el objeto que eligió
	      System.out.print("El usuario eligio: "+nom);
	      System.out.println();
	      nom2=el[pc].getNombre();
	      ven=el[pc].getVence();
	      //uso ven para guardar de manera temporar a quien vence la pc
	      System.out.print("La PC eligio: "+nom2);
	      System.out.println("\n");
	      /*OTRA FORMA
	       System.out.println(elem[opc].getNombre()+" vs "+elem[pc].getNombre());
	       */
	      
	      //Valida empate
	      if((validar=el[num].validaEmpate(nom2))==1) {
	    	  System.out.println("EMPATE");
	      }
	      
	      //Valida victoria
	      if((validar=el[num].validaVictoria(nom2,ven))==1) {
	    	  System.out.println("Gana el usuario");
	    	  vidapc--;
	      }else {
	    	  if((validar=el[num].validaVictoria(nom2,ven))==0) {
	    		  System.out.println("Gana la PC");
	    		  vidaus--;
	    	  }
	      }
	      /*INTERESANTE OTRA FORMA CON METODOS BOOLEANS
	       if(elem[opc].validaEmpate(elem[pc])) {
				System.out.println("Es un empate");
			}else if(elem[opc].validaVictoria(elem[pc])){
				System.out.println("Ganaste!");
			}else {
				System.out.println("Perdiste!");
			}
	       */
	      System.out.println("Vidas usuario: "+vidaus);
	      System.out.println("Vidas PC: "+vidapc);
	      
	    }while(vidaus!=0 && vidapc!=0);
    if(vidaus==0) {
    	System.out.println("PERDIO EL USUARIO");
    }else
    	System.out.println("PERDIO LA PC");
  }
}
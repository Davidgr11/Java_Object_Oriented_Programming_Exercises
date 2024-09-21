import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
         System.out.println("HUERTO DE LIMONES");
         Scanner scan = new Scanner(System.in);
 	    Random rand = new Random();
 	    int aux,j,i;
 	     float prom=0,ben;
 	    float cost=13.5f;
 	    int max,men;
 	
 	    int [] dias = new int [7];
 	    
 	   for(i=0; i<7; i++)
 	    {
 	       dias[i]= rand.nextInt(100,200);
 	       
 	       prom=prom+dias[i];
 	    }
 	    
 	   for(i=0; i<7; i++)
 	   {
 		   System.out.print(dias[i]+" ");
 	   }
 	  System.out.println("");
 	   prom=prom/7;
 	 
 	   System.out.println("Promedio diario: "+Math.round(prom*1d)/1d);
 	    ben=prom*30*cost;
 	   System.out.println("Beneficios esperados: $"+Math.round(ben*100d)/100d);
 	    
 	   max=dias[0];
 	   
 	   for(i=1; i<7; i++)
 	   {
 		   if(dias[i]>max)
 		   {
 			   max=dias[i];
 		   }
 	   }
 	   
 	   for(i=0; i<7; i++)
 	   {
 		   if(max==dias[i])
 		   {
 			  System.out.println("El día que recolectó más limones fue el #"+i);
 		   }
 	   }
 	   
 	  men=dias[0];
	   
	   for(i=1; i<7; i++)
	   {
		   if(dias[i]<men)
		   {
			   men=dias[i];
		   }
	   }
 	   
	   for(i=0; i<7; i++)
 	   {
 		   if(men==dias[i])
 		   {
 			  System.out.println("El día que recolectó menos limones fue el #"+i);
 		   }
 	   }
 	   
 	 
 	    
 	    
 	    
 	    
 	    
 	    
 	    
	}

}

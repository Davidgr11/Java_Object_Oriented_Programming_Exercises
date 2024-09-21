import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;

//Gonzalez Robles David Alejandro
/*
	Creas el binario y vas creando los de texto al mismo tiempo
	De texto para las placas
	el binario guarda a todos los coches y al mismo tiempo uno de texto que va a guardar la multa
	El radar guarda las placas de los coches que pasan el límite
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Bienvenido al radar de velocidad");
		Random rand=new Random();
		Coche[] car=new Coche[100];
		int velT=0, total=0;
		//Generador de coches
		for(int i=0; i<100;i++) {
			car[i]=new Coche(rand.nextInt(20, 101), rand.nextInt(1000, 10000)); 
			System.out.print("Coche: "+(i+1)+" ");
			System.out.println(car[i]);
			velT+=car[i].getVelocidad();
		}
		velT=velT/100;
		System.out.println("Velocidad promedio: "+velT);
		//escritura
		try { FileOutputStream fileOut = new FileOutputStream("cochesFast.bin");
			ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
			for(int i=0;i<100;i++) {
				if((car[i].getVelocidad())>80) {
					objOut.writeObject(car[i]);
					total++;
				}
			}
			fileOut.close();
			objOut.close();
		}catch(FileNotFoundException fnfe) {
	    System.out.println("No encontre el archivo");
		}catch(IOException ioe) {
	    System.out.println("Error al abrir el archivo"); 
		}
		System.out.println("El total de carros multados fueron: "+total);
		//lectura
		try { FileInputStream fileIn = new FileInputStream("cochesFast.bin");
	    	ObjectInputStream objIn = new ObjectInputStream(fileIn);
	    	int i=0;
		    do {
		    	System.out.println("Coche "+(i+1));
		    	Coche multado=(Coche)objIn.readObject();
		    	System.out.println(multado);
		    	i++;
		    }while(i!=total);
		    fileIn.close();
		    objIn.close();   
		}catch(FileNotFoundException fnfe) {
		    System.out.println("No encontre el archivo");
		}catch(IOException ioe) {
		    System.out.println("Error al abrir el archivo"); 
		}catch(ClassNotFoundException cnfe) {
			System.out.println("La clase no existe");
		}
		/*for(int i=0;i<100;i++) {
			if((car[i].getVelocidad())>80) {
				try { FileOutputStream fileOut = new FileOutputStream("cochesFast.bin", true);
					ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
					objOut.writeObject(car[i]);
					fileOut.close();
					objOut.close();
				}catch(FileNotFoundException fnfe) {
				    System.out.println("No encontre el archivo");
				}catch(IOException ioe) {
				    System.out.println("Error al abrir el archivo"); 
				}
				
			}
		}*/
		
		/*try { FileInputStream fileOut = new FileInputStream("cochesFast.bin");
	    ObjectInputStream objOut = new ObjectInputStream(fileOut);
	    do {
	    	int i=0;
	    	Coche car2[i]=(Coche)objOut.readObject();
	    	System.out.println(car2[i]);
	    	i++;
	    }while(car2!=null);
	    fileOut.close();
	    objOut.close();   
		}catch(FileNotFoundException fnfe) {
		    System.out.println("No encontre el archivo");
		}catch(IOException ioe) {
		    System.out.println("Error al abrir el archivo"); 
		}*/
		
	}
}

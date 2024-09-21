import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;

public class Archivos3 {

	public static void main(String[] args) {
		Random rand = new Random();
		//int num = rand.nextInt(10,20);
		try {
			FileOutputStream fileOut = new FileOutputStream("objeto.txt");
			ObjectOutputStream dataOut = new ObjectOutputStream(fileOut);//<--
			dataOut.writeObject(new Materia("programacion", "Alejandro", 4.5));//<--
			
			fileOut.close();
			dataOut.close();
		}catch(FileNotFoundException fnfe) {
			System.out.println("No encontre el archivo");
		}catch(IOException ioe) {
			System.out.println("Error al abrir el archivo");
		}
		System.out.println("Fin escritura---");
		try {
			FileInputStream fileOut = new FileInputStream("objeto.txt");
			ObjectInputStream dataOut = new ObjectInputStream(fileOut);//<--
			Materia mat = (Materia)dataOut.readObject();//<--
			System.out.println(mat);
			
			fileOut.close();
			dataOut.close();
		}catch(FileNotFoundException fnfe) {
			System.out.println("No encontre el archivo");
		}catch(IOException ioe) {
			System.out.println("Error al abrir el archivo");
		}catch(ClassNotFoundException cnfe) {
			System.out.println("La clase no existe");
		}
		System.out.println("Fin");


	}

}


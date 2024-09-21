import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Archivos2 {

	public static void main(String[] args) {
		int num = 94;
		try {
			FileOutputStream fileOut = new FileOutputStream("numeros.txt");
			DataOutputStream dataOut = new DataOutputStream(fileOut);
			dataOut.writeInt(num);
			dataOut.writeInt(num*2);
			fileOut.close();
			dataOut.close();
		}catch(FileNotFoundException fnfe) {
			System.out.println("No encontre el archivo");
		}catch(IOException ioe) {
			System.out.println("Error al abrir el archivo");
		}
		System.out.println("Fin");
		
		try {
			FileInputStream fileOut = new FileInputStream("numeros.txt");
			DataInputStream dataOut = new DataInputStream(fileOut);
			System.out.println(dataOut.readInt());
			System.out.println(dataOut.readInt());
			System.out.println(dataOut.readInt());
			fileOut.close();
			dataOut.close();
		}catch(FileNotFoundException fnfe) {
			System.out.println("No encontre el archivo");
		}catch(IOException ioe) {
			System.out.println("Error al abrir el archivo");
		}
		System.out.println("Fin");


	}

}


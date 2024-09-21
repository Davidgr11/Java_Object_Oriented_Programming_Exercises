
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos1 {

	public static void main(String[] args) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("prueba.txt"));
			writer.write("Hola\n");
			writer.write("En el archivo");
			writer.close();
		}catch(FileNotFoundException fnfe) {
			System.out.println("No encontre el archivo");
		}catch(IOException ioe) {
			System.out.println("Error al abrir el archivo");
		}
		System.out.println("Fin de escritura");
		try {
			BufferedReader reader = new BufferedReader(new FileReader("prueba.txt"));
			String linea;
			while( (linea=reader.readLine()) != null ) {
				System.out.println(linea);
			}
		} catch (FileNotFoundException e) {
			System.out.println("No encontre el archivo");
		}catch(IOException ioe) {
			System.out.println("Error al abrir el archivo");
		}
		
	}

}

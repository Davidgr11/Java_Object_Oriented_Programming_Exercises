//SE IMPORTA TODO LO QUE SE REQUIERE
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;

public class Archivos1 {
  public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
	  String[] nombres=new String[5];//ARREGLO DE NOMBRES
	  String aux;
	  int i;
	  for(i=0;i<5;i++) {//SE PIDEN LOS NOMBRES AL USUARIO
		  System.out.println("Dame el nombre "+(i+1));
		  nombres[i]=scan.next();
	  }
	  for(int j=0;j<5;j++) {
		  for(i=0;i<4;i++) {//SE ORDENAN LOS NOMBRES
			  if(nombres[i].compareTo(nombres[i+1])>0){
				  aux=nombres[i];
				  nombres[i]=nombres[i+1];
				  nombres[i+1]=aux;
			  }
		  }
	  }

	 try{
		 BufferedWriter writer= new BufferedWriter(new FileWriter("prueba.txt"));
		 for(i=0;i<5;i++) {
			 writer.write(nombres[i]+"\n");
		 }
		 writer.close();
	 } catch(FileNotFoundException fnfe){
		 System.out.println("No encontre el archivo");
	 } catch(IOException ioe){
		 System.out.println("Error al abrir archivo");
	 }
	 System.out.println("Fin de la escritura");

	 try{
		 BufferedReader reader = new BufferedReader(new FileReader("prueba.txt"));
		String linea;
		while((linea=reader.readLine()) != null){
			System.out.println(linea);
		}
	 } catch(FileNotFoundException e){
		 System.out.println("No encontre el archivo");
	 } catch(IOException ioe){
		 System.out.println("Error al abrir archivo");
	 }
	 scan.close();
  }
}
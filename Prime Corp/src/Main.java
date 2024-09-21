/*
	Archivos y carpetas
	Cada carpeta puede tener más archivos y carpetas
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		System.out.println("_____________________________");
		System.out.println("   Bienvenido a Prime Corp   ");
		System.out.println("_____________________________");
		Carpeta ca=new Carpeta("Raiz", new Fecha(27, 03, 2022), null);
		System.out.println("1)Listar contenido\n2)Ver archivo\n3)Agregar archivo\n4)Borrar archivo\n5)Crear carpeta\n6)Cambiar carpeta\n7)Subir de nivel\n8)Salir");
		System.out.println("Hora actual->  "+LocalTime.now());
	}

}

import java.io.Serializable;

public class Persona implements Serializable{

	private static final long serialVersionUID = 1L;
	private String nombre, apellido;
	private int edad;
	
	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}
	
	public String toString() {
		return nombre+" "+apellido+"Edad: "+edad;
	}
}

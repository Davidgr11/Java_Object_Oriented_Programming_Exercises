
public class Paciente {
	private String nombre;
	private Fecha fechaNac;
	
	public Paciente(String nombre, Fecha fechaNac) {
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Fecha getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Fecha fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	public int getEdad() {
		return 2022-fechaNac.getAnho();
	}
	
	public String toString() {
		return nombre+" ["+getEdad()+"]";
	}
}

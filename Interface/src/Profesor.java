
public class Profesor {
	private String nombre;
	private String materia;
	
	
	public Profesor(String nombre, String materia) {
		super();
		this.nombre = nombre;
		this.materia = materia;
	}


	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", materia=" + materia + "]";
	}
	
	
}

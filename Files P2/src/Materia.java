import java.io.Serializable;

public class Materia implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1098598929090336852L;
	private String nombre, profesor;
	private double horas;
	
	public Materia(String nombre, String profesor, double horas) {
		super();
		this.nombre = nombre;
		this.profesor = profesor;
		this.horas = horas;
	}
	
	public String toString() {
		return nombre+" profesor:"+profesor+" "+horas+"hrs.";
	}
	
}
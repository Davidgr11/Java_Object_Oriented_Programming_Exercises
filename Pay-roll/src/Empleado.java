
public class Empleado {
	private String nombre, apellidos;
	private int clave, faltas;
	private String puesto;
	public Empleado(String nombre, String apellidos, int clave, int faltas, int puesto) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.clave = clave;
		this.faltas = faltas;
		switch(puesto) {
		case 1: this.puesto="Vendedor";
		break;
		case 2: this.puesto="Supervisor";
		break;
		case 3: this.puesto="Gerente";
		break;
		default: this.puesto="Vendedor";
		break;
		}
	}
	
}

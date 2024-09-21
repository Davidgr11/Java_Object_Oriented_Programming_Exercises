
public class Cita {
	private Paciente paciente;
	private Fecha fecha;
	private double estatura;
	private int peso;
	
	
	public Cita(Paciente paciente, Fecha fecha, double estatura, int peso) {
		this.paciente = paciente;
		this.fecha = fecha;
		this.estatura = estatura;
		this.peso = peso;
	}


	public Paciente getPaciente() {
		return paciente;
	}


	public Fecha getFecha() {
		return fecha;
	}


	public double getEstatura() {
		return estatura;
	}


	public int getPeso() {
		return peso;
	}
}

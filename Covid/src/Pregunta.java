
public class Pregunta {
	//atributos
	private String texto;
	private int puntuacion;
	
	//constructor
	public Pregunta(String texto, int puntuacion) {
		this.texto=texto;
		this.puntuacion=puntuacion;
	}
	
	//syg
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	//toString
	public String toString() {
		return texto;
	}
}

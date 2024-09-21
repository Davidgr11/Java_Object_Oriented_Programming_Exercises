
public class Entrenador extends Seleccionado{
	private int partidosJugados, partidosGanados;
	
	public Entrenador(String nombre, String apellido) {
		super(nombre, apellido);
		partidosJugados=0;
		partidosGanados=0;
	}
	
	public int getPartidosJugados() {
		return partidosJugados;
	}
	public void setPartidosJugados(int partidosJugados) {
		this.partidosJugados = partidosJugados;
	}
	public int getPartidosGanados() {
		return partidosGanados;
	}
	public void setPartidosGanados(int partidosGanados) {
		this.partidosGanados = partidosGanados;
	}
	public String toString() {
		if(partidosJugados>0) {
			return "Eficiencia: "+(partidosGanados/(double)partidosJugados)+"\n"+"Partidos: GANADOS "+partidosGanados+" JUGADOS "+partidosJugados;
		}
		else {
			return "No se han jugado partidos";
		}
	}
}

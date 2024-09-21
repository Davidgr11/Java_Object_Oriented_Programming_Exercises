
public class Equipo {
	private String nombre;
	private Entrenador entrenador;
	private Jugador[] jugadores=new Jugador[11];
	private int total;
	
	public Equipo(String nombre) {
		this.nombre=nombre;
		total=0;
	}
	public boolean hayPortero() {
		int i;
		for(i=0;i<total;i++) {
			if(jugadores[i] instanceof Portero) {
				return true;
			}
		}
		return false;
	}
	public void creaPortero(String nombre, String apellido, int num) {
		if(total<11) {
			if(hayPortero()==false) {
				jugadores[total]=new Portero(nombre, apellido, num);
				total++;
			}
			else {
				System.out.println(("YA HAY PORTERO"));
			}
		}
	}
	public void creaDefensa(String nombre, String apellido, int num) {
		if(total<11) {
			jugadores[total]=new Defensa(nombre, apellido, num);
			total++;
		}
	}
	public void creaDelantero(String nombre, String apellido, int num) {
		if(total<11) {
			jugadores[total]=new Delantero(nombre, apellido, num);
			total++;
		}
	}
	public void imprimeJugadores() {
		System.out.println(nombre);
		for(Jugador jug: jugadores) {//para cada elemento de jugadores guarga en jug
			System.out.println(jug);
		}
	}
}

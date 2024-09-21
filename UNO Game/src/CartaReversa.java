
public class CartaReversa extends Carta{
	private String nombre;

	public CartaReversa(String color) {
		super(color);
		this.nombre = "reversa";
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public boolean jugadaValida(Carta cartaMesa) {
		if(cartaMesa.getColor().equals(color) || cartaMesa instanceof CartaReversa ){
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "["+nombre+" "+color+"]"; 
	}
	
	@Override
	public int siguienteTurno(int jugadorSig, int dir) {
		jugadorSig=(jugadorSig+dir)%Juego.NUM_JUGADORES;
		if(jugadorSig<0) {
			jugadorSig = Juego.NUM_JUGADORES+jugadorSig;
		}
		return jugadorSig;
	}

	@Override
	public int siguienteDireccion(int dir) {
		return 0-dir;
	}

}


public class CartaNum extends Carta{
	private int num;
	
	public CartaNum(String color, int num) {
		super(color);
		this.num = num;
	}

	
	public int getNum() {
		return num;
	}


	public boolean jugadaValida(Carta cartaMesa) {
		if(cartaMesa.getColor() == this.color || 
				(cartaMesa instanceof CartaNum && ((CartaNum)cartaMesa).num == num)
		) {
			return true;
		}
		return false;
	}
	
	
		
	public String toString() {
		return "["+num+" "+color+"]"; 
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
		return dir;
	}

}

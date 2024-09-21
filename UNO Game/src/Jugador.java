public abstract class Jugador {
	protected String nombre;
	protected int cartasTotal;
	protected Carta cartas[];
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.cartasTotal = 0;
		this.cartas = new Carta[10];
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCartasTotal() {
		return cartasTotal;
	}
	
	public Carta quitaCarta(int pos) {
		Carta carta = this.cartas[pos];
		for(int i=pos+1; i<cartasTotal; i++) {
			this.cartas[i-1] =this.cartas[i]; 
		}
		cartasTotal--;
		this.cartas[cartasTotal] = null;
		return carta;
	}
	
	public void tomaCarta(Carta carta) {
		this.cartas[cartasTotal] = carta;
		cartasTotal++;
	}
	
	public abstract int validarCarta(Carta cartaMesa);
	
	public String toString() {
		return nombre+" - "+cartasTotal+" cartas";
	}
}

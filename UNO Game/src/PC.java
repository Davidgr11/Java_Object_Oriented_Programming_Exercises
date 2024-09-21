public class PC extends Jugador {

	public PC(String nombre) {
		super(nombre);
	}
	
	public int validarCarta(Carta cartaMesa) {
		for(int i=0; i<cartasTotal; i++) {//Revisa jugadas vlidas
			if(cartas[i].jugadaValida(cartaMesa)) {
				return i;
			}
		}
		return -1;//no puede jugar
	}
	

}

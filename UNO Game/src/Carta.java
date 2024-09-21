
public abstract class Carta {
	protected String color;
	public static final String[] COLORES = {"rojo", "azul", "verde", "amarillo"};
	
	public Carta(String color) {
		this.color = color;
	}
	
	
	public String getColor() {
		return color;
	}
	
	public abstract boolean jugadaValida(Carta cartaMesa);
	public abstract int siguienteTurno(int jugadorSig, int dir);
	public abstract int siguienteDireccion(int dir);
	
	
}


public class Punto {
	protected int x, y;

	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public double distancia(int x, int y) {
		System.out.println("Distancia 2D");
		double raiz = Math.pow(this.x-x, 2)+Math.pow(this.y-y, 2);
		return Math.sqrt(raiz);
	}
	
	public double distancia(Punto otroPunto) {
		return distancia(otroPunto.x, otroPunto.y);
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
}

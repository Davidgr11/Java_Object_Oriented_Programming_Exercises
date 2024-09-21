
public class Punto3D extends Punto{
	private int z;

	public Punto3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public double distancia(int x, int y, int z) {
		System.out.println("Distancia 3D");
		double raiz = Math.pow(this.x-x, 2)+Math.pow(this.y-y, 2)+Math.pow(this.z-z, 2);
		return Math.sqrt(raiz);
	}
	
	public double distancia(Punto3D otroPunto) {
		return distancia(otroPunto.x, otroPunto.y, otroPunto.z);
	}
	
	public String toString() {
		return "("+x+","+y+","+z+")";
	}
}

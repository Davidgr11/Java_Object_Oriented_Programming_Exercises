
public class Linea {
	private Punto puntoI, puntoF;

	public Linea(Punto puntoI, Punto puntoF) {
		super();
		this.puntoI = puntoI;
		this.puntoF = puntoF;
	}

	public Punto getPuntoI() {
		return puntoI;
	}

	public void setPuntoI(Punto puntoI) {
		this.puntoI = puntoI;
	}

	public Punto getPuntoF() {
		return puntoF;
	}

	public void setPuntoF(Punto puntoF) {
		this.puntoF = puntoF;
	}
	
	public double magnitud() {
		if(puntoI instanceof Punto3D) {
			return ((Punto3D)puntoI).distancia(((Punto3D)puntoF));
		}
		return puntoI.distancia(puntoF);
		
		/* Esto esta mal porque los 2 son Punto
		if(puntoI instanceof Punto) {
			return puntoI.distancia(puntoF);			
		}
		return ((Punto3D)puntoI).distancia(((Punto3D)puntoF));
		*/
	}
	
	public String toString() {
		return puntoI+" "+puntoF;
	}
}

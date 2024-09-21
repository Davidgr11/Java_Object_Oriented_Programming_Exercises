
public class Poligono {
	private Punto[] puntos;
	private int numPuntos;
	private int total;
	
	public Poligono(int numPuntos) {
		puntos = new Punto[numPuntos];
		this.numPuntos = numPuntos;
		total = 0;
	}
	
	public void agregaPunto(Punto punto) {
		puntos[total] = punto;
		total++;
	}
	
	public double perimetro() {
		int i;
		double sum=0;
		for(i=0; i<numPuntos; i++) {
			if(puntos[i] instanceof Punto3D) {
				sum+= ((Punto3D)puntos[i]).distancia( ((Punto3D)puntos[(i+1)%numPuntos]) );
			}else {
				sum+= puntos[i].distancia( puntos[(i+1)%numPuntos] );
			}
		}
		return sum;
	}
	
	public String toString() {
		int i;
		String res="";
		for(i=0; i<numPuntos; i++) {
			res+=puntos[i];
		}
		return res;
	}

	public Punto[] getPuntos() {
		return puntos;
	}

	public void setPuntos(Punto[] puntos) {
		this.puntos = puntos;
	}

	public int getNumPuntos() {
		return numPuntos;
	}

	public void setNumPuntos(int numPuntos) {
		this.numPuntos = numPuntos;
	}

	public int getTotal() {
		return total;
	}
}

import java.util.Random;

public class Pila {
	public static final int MAX_CARTAS = 8*4+4+4;
	private Carta[] pila;
	int totalCartas;
	
	public Pila() {
		int i, j;
		pila = new Carta[MAX_CARTAS];
		totalCartas=0;
		for(i=0; i<8; i++) {
			for(j=0; j<Carta.COLORES.length; j++) {
				pila[totalCartas] = new CartaNum(Carta.COLORES[j], i+1);
				totalCartas++;
			}
		}
		
		for(j=0; j<Carta.COLORES.length; j++) {
			pila[totalCartas] = new CartaSalto(Carta.COLORES[j]);
			totalCartas++;
		}
		for(j=0; j<Carta.COLORES.length; j++) {
			pila[totalCartas] = new CartaReversa(Carta.COLORES[j]);
			totalCartas++;
		}
	}
	
	public void revuelveCartas() {
		Random rand = new Random();
		Carta aux;
		int i, j, veces;
		
		for(veces=0; veces<30; veces++) {
			i=rand.nextInt(0,MAX_CARTAS);
			do {
				j=rand.nextInt(0,MAX_CARTAS);
			}while(j==i);
			aux = pila[i];
			pila[i] = pila[j];
			pila[j] = aux;
		}
	}
	
	public Carta obtieneCarta() {
		totalCartas--;
		return pila[totalCartas];
	}

	public int getTotalCartas() {
		return totalCartas;
	}
	
	
}

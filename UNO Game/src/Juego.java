import java.util.Random;
import java.util.Scanner;

public class Juego {
	private Pila pila;
	private Carta mesa;
	private Jugador[] jugadores;
	public static final int NUM_JUGADORES = 4;
	

	
	public Juego() {
		jugadores = new Jugador[NUM_JUGADORES];
		
		jugadores[0] = new Humano("Persona");
		for(int i=1; i<NUM_JUGADORES; i++) {
			jugadores[i] = new PC("PC"+i);
		}
		pila = new Pila();
	}
	
	
	
	public void jugar() {
		int jugadorSig, jugadorActual;
		int dir;
		boolean gano=false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Como te llamas?");
		String nombre = scan.nextLine();
		
		jugadores[0].setNombre(nombre);
		pila.revuelveCartas();
		
		int j, c;
		for(j=0; j<NUM_JUGADORES; j++) {
			for(c=0; c<5; c++) {//5 cartas a cada jugador
				jugadores[j].tomaCarta(pila.obtieneCarta());
			}
		}
		
		mesa = pila.obtieneCarta();
		
		jugadorSig = 0;//rand.nextInt(0, NUM_JUGADORES);
		dir = 1;//1 o -1
		do {
			jugadorActual = jugadorSig;
			System.out.println("\nCarta en la mesa: "+mesa);
			
			System.out.println(jugadores[jugadorActual]);
			if(jugadores[jugadorActual] instanceof Humano) {//Si es humano imprime las cartas que tiene
				((Humano)jugadores[jugadorActual]).imprimeCartas();
			}else{
				scan.nextLine();
			}
			
			//Pide carta, devuelve a posicila carta a jugar o -1 si se va a robar
			int pos=jugadores[jugadorActual].validarCarta(mesa);
			if(pos >= 0) {
				mesa = jugadores[jugadorActual].quitaCarta(pos);
				
				dir = mesa.siguienteDireccion(dir);//Calcula siguiente direccin
				jugadorSig = mesa.siguienteTurno(jugadorSig, dir);//Calcula siguiente turno
				
				System.out.println(jugadores[jugadorActual].getNombre()+" usa carta "+mesa);
				
			}else if(pila.getTotalCartas() > 0){//no hay jugada pero quedan cartas, se puede robar
				if(jugadores[jugadorActual].getCartasTotal()<10) {//el jugador tiene menos de 10 cartas en la mano
					jugadores[jugadorActual].tomaCarta(pila.obtieneCarta());
					System.out.println(jugadores[jugadorActual].getNombre()+" roba carta");
				}else {
					System.out.println("No puedes robar mas cartas");
				}
				//Siguiente turno
				jugadorSig=(jugadorSig+dir)%NUM_JUGADORES;
				if(jugadorSig<0) {
					jugadorSig = NUM_JUGADORES+jugadorSig;
				}
				
			}else {//no se puede robar ms
				System.out.println("No hay ms cartas para robar =(");
			}
			
			//Si el jugador actual se qued sin cartas gan
			if(jugadores[jugadorActual].getCartasTotal() == 0) {
				System.out.println("Gan "+jugadores[jugadorActual].getNombre());
				gano=true;
			}
			
		}while(pila.getTotalCartas()>0 && !gano);
		if(!gano) {
			System.out.println("Se acabron las cartas, todos pierden");
		}
	}
}

import java.util.Scanner;

public class Humano extends Jugador {

	public Humano(String nombre) {
		super(nombre);
	}

	@Override
	public int validarCarta(Carta cartaMesa) {
		int pos;
		Scanner scan = new Scanner(System.in);
		do {
			do {
				System.out.println("Elige una carta para jugar (1 a "+cartasTotal+") o 0 para robar: ");
				pos = scan.nextInt();
			}while(pos<0 || pos>cartasTotal);
			if(pos == 0) {//roba
				//scan.close();
				return -1;
			}
			pos--;
			if(!cartas[pos].jugadaValida(cartaMesa)) {
				System.out.println("No puedes jugar esa carta");
			}
		}while(!cartas[pos].jugadaValida(cartaMesa));
		//scan.close();
		return pos;
	}
	
	public void imprimeCartas() {
		for(int i=0; i<cartasTotal; i++) {
			System.out.print((i+1)+""+cartas[i]+" | ");
		}
		System.out.print("\n");
	}
}

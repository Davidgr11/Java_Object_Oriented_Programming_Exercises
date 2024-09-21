import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Equipo eq=new Equipo("PSG");
		eq.creaPortero("Gianluigi", "Donnarumma", 1);
		eq.creaDefensa("Achraf", "Hakimi", 3);
		eq.creaDefensa("Presnel", "Kimpembe", 5);
		eq.creaDefensa("Sergio", "Ramos", 4);
		eq.creaDefensa("Juan", "Bernat", 6);
		eq.creaDefensa("Marquinhos", "Mendes", 2);
		eq.creaDelantero("Marco", "Verratti", 8);
		eq.creaDelantero("Angel Di", "Maria", 7);
		eq.creaDelantero("Lionel", "Messi", 10);
		eq.creaDelantero("Neymar", "Jr", 11);
		eq.creaDelantero("Kylian", "Mbappe", 9);
		eq.creaDelantero("Guillermo", "Ochoa", 1);
		eq.imprimeJugadores();
		/*Portero portero=new Portero("Guillermo", "Ochoa", 1);
		Delantero delantero=new Delantero("Raul", "Jimenez", 9);
		Defensa defensa=new Defensa("Rafa", "Marquez", 4);
		Entrenador entrenador=new Entrenador("Piojo", "Herrera");
		
		Random rand=new Random();
		portero.setAtajadas(rand.nextInt(5, 11));
		defensa.setRobos(rand.nextInt(10, 31));
		delantero.setGoles(rand.nextInt(0, 6));
		entrenador.setPartidosJugados(5);
		entrenador.setPartidosGanados(rand.nextInt(0, 6));
		
		System.out.println(portero);
		System.out.println(defensa);
		System.out.println(delantero);
		System.out.println(entrenador);*/
	}
}

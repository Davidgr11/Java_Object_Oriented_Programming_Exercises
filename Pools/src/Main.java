//Gonzalez Robles David Alejandro
public class Main {

	public static void main(String[] args) {
		
		Quiniela quin = new Quiniela();//Crea los 8 equipos
		quin.generaPartidos();
		//Revuelve los equipos y genera 4 partidos aleatorios
		quin.pidePredicciones();
		//Imprime partidos y pregunta quien va a ganar cada uno, L V E
		quin.iniciaTemporada();
		//Simula los partidos, genera goles e imprime los partidos con los goles realizados
		System.out.println("Tuviste "+quin.getAciertos()+" aciertos!");
		//Cuenta las predicciones correctas
		
	}

}
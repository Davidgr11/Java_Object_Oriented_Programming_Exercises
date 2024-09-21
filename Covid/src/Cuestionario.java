import java.util.ArrayList;

public class Cuestionario {
	//atributos
	ArrayList<Pregunta> lista=new ArrayList<Pregunta>();//afuera el array de tipo pregunta
	private int total;
	
	//constructor
	public Cuestionario() {
		total=0;
		lista.add(new Pregunta("Has tenido tos?", 1));
		lista.add(new Pregunta("Has tenido dolor de cabeza?", 1));
		lista.add(new Pregunta("Has tenido dificultad para respirar?", 2));
		lista.add(new Pregunta("Has tenido dolor o ardor de garganta?", 2));
		lista.add(new Pregunta("Has tenido perdida del olfalto o gusto?", 3));
		lista.add(new Pregunta("Has estado en contacto con un paciente positivo a COVID19?", 3));
	}
	
	//metodos
	public Pregunta siguientePregunta(int i) {
		return lista.get(i);
	}
	public int getPuntos() {
		return total;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int i) {
		total=total+(lista.get(i).getPuntuacion());
	}
	
	
}

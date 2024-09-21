//Gonzalez Robles David Alejandro
public class Quiniela {
	//atributos
	private Equipo [] equipos;
	private Partido [] partidos;
	private int aciertos;
	
	//constructor
	public Quiniela() {
		equipos=new Equipo[8];
		equipos[0]=new Equipo("America", 0);
		equipos[1]=new Equipo("Chivas", 0);
		equipos[2]=new Equipo("Pumas", 0);
		equipos[3]=new Equipo("Tigres", 0);
		equipos[4]=new Equipo("Monterrey", 0);
		equipos[5]=new Equipo("Leon", 0);
		equipos[6]=new Equipo("Toluca", 0);
		equipos[7]=new Equipo("Cruz Azul", 0);
		aciertos=0;
	}
	
	//metodos
	private void revuelveEquipos() {
		System.out.println("Revolver equipos esta en mantenimiento");
	}
	public void generaPartidos() {
		revuelveEquipos();
		partidos=new Partido[4];
		partidos[0]= new Partido(equipos[0], equipos[1]);
		partidos[1]= new Partido(equipos[2], equipos[3]);
		partidos[2]= new Partido(equipos[4], equipos[5]);
		partidos[3]= new Partido(equipos[6], equipos[7]);
	}
	public void pidePredicciones() {
		for(int i=0;i<4;i++) {
			partidos[i].imprimePartido(false);
		}
	}
	public void iniciaTemporada() {
		//Simula los partidos, genera goles e imprime los partidos con los goles realizados
		for(int i=0;i<4;i++) {
			partidos[i].simulaPartido();
		}
	}
	public int getAciertos() {
		for(int i=0;i<4;i++) {
			if(partidos[i].prediccionAcertada()) {
				aciertos++;
			}
		}
		return aciertos;
	}
	//setters y getters
	
}

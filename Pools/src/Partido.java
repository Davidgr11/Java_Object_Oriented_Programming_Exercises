import java.util.Random;
import java.util.Scanner;

//Gonzalez Robles David Alejandro

public class Partido {
	//atributos
	private Equipo equipoLocal;
	private Equipo equipoVisita;
	private String prediccion;
	Scanner scan=new Scanner(System.in);
	
	//constructor
	public Partido(Equipo equipoLocal, Equipo equipoVisita) {
		this.equipoLocal=equipoLocal;
		this.equipoVisita=equipoVisita;
	}
	
	//metodos
	public void imprimePartido(boolean goles) {
		if(goles==false) {
			System.out.println(equipoLocal.getNombre()+"(L) vs "+equipoVisita.getNombre()+"(V)");
			System.out.println("Quien crees que gane? L V E");
			//do {
				prediccion=scan.next();
				prediccion.toUpperCase();
				//System.out.println(prediccion);
			//}while(prediccion.equals("L") || prediccion.equals("V") || prediccion.equals("E"));
			setPrediccion(prediccion);
		}
		else {
			System.out.println(equipoLocal.getNombre()+"["+equipoLocal.getGoles()+"] vs "+equipoVisita.getNombre()+"["+equipoVisita.getGoles()+"]");
		}
	}
	public void setPrediccion(String prediccion) {
		this.prediccion=prediccion;
	}
	public void simulaPartido() {
		Random rand=new Random();
		int num;
		num=rand.nextInt(0,4);
		equipoLocal.setGoles(num);
		num=rand.nextInt(0,4);
		equipoVisita.setGoles(num);
		imprimePartido(true);
	}
	public boolean prediccionAcertada() {
		if(prediccion.equals("L") && equipoLocal.getGoles()>equipoVisita.getGoles()) {
			return true;
		}
		else {
			if(prediccion.equals("V") && equipoLocal.getGoles()<equipoVisita.getGoles()) {
				return true;
			}
			else {
				if(prediccion.equals("E") && equipoLocal.getGoles()==equipoVisita.getGoles()) {
					return true;
				}
				else {
					return false;
				}
			}
		}
	}
}

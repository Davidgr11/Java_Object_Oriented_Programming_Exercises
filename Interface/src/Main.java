import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Producto> lista = new ArrayList<>();
		lista.add(new Producto("Tele", 1500));
		lista.add(new Producto("Cuaderno", 15));
		
		for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		ArrayList<Profesor> lista2 = new ArrayList<>();
		lista2.add(new Profesor("Aaaa", "XXXXX"));
		lista2.add(new Profesor("BBBBB", "YYYYY"));
		
		for(int i=0; i<lista2.size(); i++) {
			System.out.println(lista2.get(i));
		}
		
	}

}

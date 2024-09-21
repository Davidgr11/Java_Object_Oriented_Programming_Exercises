import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Persona> map=new HashMap<>();
		
		map.put(202293, new Persona("Julio"));
		map.put(202173, new Persona("Fer"));
		map.put(202005, new Persona("Caballero"));
		map.put(201002, new Persona("Vale"));
		
		for(Integer key:map.keySet()) {
			System.out.println(map.get(key));
		}
		
	}

}

/*
import java.util.HashMap;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) {
		HashMap<Integer, Persona> map = new HashMap<>();
		
		map.put(202293, new Persona("Julio"));
		map.put(202005, new Persona("Fer"));
		map.put(200567, new Persona("Caballero"));
		map.put(201002, new Persona("Vale"));
		//map.put(201002, new Persona("Repetido"));
		
		for(Integer key:map.keySet()) {
			System.out.println(map.get(key));
		}
	}
}

*/
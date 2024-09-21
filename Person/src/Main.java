
public class Main {

	public static void main(String[] args) {
		Persona pers=new Persona();
		Persona pers2=new Persona();
		pers.saludar();
		pers.nombrar("Jose", "Pepe");
		pers.saludar();
		pers2.nombre="Fernanda";
		pers2.saludar();
		pers2.pruebaThis("David");
	}

}

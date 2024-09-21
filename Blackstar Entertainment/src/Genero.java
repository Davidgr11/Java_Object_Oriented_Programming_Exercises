
public class Genero {
	//Atributos
	private final static int SUS=1;
	private final static int ROM=2;
	private final static int ACC=3;

  //Metodos
  public static String getGenero(int tipo){
	  String genero;
    switch(tipo){
		case Genero.SUS:
			genero="Suspenso";
			break;
		case Genero.ROM:
			genero="Romance";
			break;
		default:
			genero="Accion";
			break;
	}
	  return genero;
  }
}

public class Fecha {
	//atributos
	private int dia;
	private int mes;
	private int anho;
	
	//constructor
	public Fecha(int dia, int mes, int anho) {
		this.dia = dia;
		this.mes = mes;
		this.anho = anho;
	}
	
	//getters
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAnho() {
		return anho;
	}
	
	//impresion
	public String toString() {
		//return dia+"/"+mes+"/"+anho;
		return agregaCero(dia)+"/"+agregaCero(mes)+"/"+anho;
		//return Integer.parseInt(fecha);//Recibe String y convierte a entero
	}
	private String agregaCero(int num) {
		if(num<10)
			return "0"+num;
		return num+"";
	}
}


public class Fecha {
	private int dia;
	private int mes;
	private int anho;
	
	public Fecha(int dia, int mes, int anho) {
		this.dia = dia;
		this.mes = mes;
		this.anho = anho;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAnho() {
		return anho;
	}
	
	public String toString() {//Se llama automticamente
		return dia+"/"+mes+"/"+anho;
	}

	private String agregaCero(int num) {
		if(num<10)
			return "0"+num;
		return num+"";
	}
	
	public int toInt() {
		String fecha = anho+agregaCero(mes)+agregaCero(dia);//20220301
		return Integer.parseInt(fecha);//Recibe String y convierte a entero
	}
}

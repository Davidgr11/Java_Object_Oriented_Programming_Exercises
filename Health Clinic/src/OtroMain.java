
public class OtroMain {
	public static void main(String[] args) {
		Fecha[] fechas = new Fecha[3];
		int i;
		fechas[0] = new Fecha(1,1,2001);
		fechas[1] = new Fecha(1,2,2002);
		fechas[2] = new Fecha(1,3,2003);
		
		Fecha fechaOtra = fechas[1];
		for(i=0; i<3; i++) {
			if(fechaOtra == fechas[i]) {
				System.out.println("Son iguales"+fechaOtra+" vs "+fechas[i]);
			}else {
				System.out.println("Pues no son iguales: "+fechaOtra+" vs "+fechas[i]);
			}
		}
		
	}

}

//GONZALEZ ROBLES DAVID ALEJANDRO
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//declaraciones
		Scanner scan=new Scanner(System.in);
		int resultado, opc;
		Cuestionario cuest=new Cuestionario();
		HashMap<String, Integer> map=new HashMap<>();
		
		map.put("Normal", 0);
		map.put("Sospecha", 0);
		map.put("Riesgo", 0);
		
		System.out.println("---EVALUACION COVID---");
		System.out.println("1)Contestar cuestionario\n2)Ver estadisticas\n3)Salir");
		opc=scan.nextInt();
		do {
		switch(opc) {
			case 1:	int i=0;
					cuest=new Cuestionario();
					while(i<6) {
						System.out.println(cuest.siguientePregunta(i)+" 1)Si 2)No");
						resultado=scan.nextInt();
						while(resultado!=1 && resultado!=2) {
							System.out.println("Opcion invalida, intenta de nuevo.");
							resultado=scan.nextInt();
						}
						if(resultado==2) {
							cuest.lista.get(i).setPuntuacion(0);
						}
						cuest.setTotal(i);
						i++;
					}	
					System.out.println("Total: "+cuest.getPuntos());
					if(cuest.getPuntos()==0 || cuest.getPuntos()==1){
						System.out.println("RESULTADO: NORMAL");
						map.put("Normal", (map.get("Normal"))+1);
					}
					if(cuest.getPuntos()>1 && cuest.getPuntos()<5){
						System.out.println("RESULTADO: SOSPECHA");
						map.put("Sospecha", (map.get("Sospecha"))+1);
					}
					if(cuest.getPuntos()>5){
						System.out.println("RESULTADO: RIESGO");
						map.put("Riesgo", (map.get("Riesgo"))+1);
					}
					break;
			case 2: System.out.println("Estadísticas\nPersonas con esos resultados");
					for(String key:map.keySet()) {
						System.out.println(key+ " = " + map.get(key));
					}
					//System.out.println(map);
					break;
			default: System.out.println("adios");
			break;
		}
		System.out.println("\n1)Contestar cuestionario\n2)Ver estadisticas\n3)Salir");
		opc=scan.nextInt();
		}while(opc!=3);
		
		
	}
}

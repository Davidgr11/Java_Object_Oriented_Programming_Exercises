import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			Paciente[] pacientes = new Paciente[5];
			Cita[] citas = new Cita[20];
			int opc, pacTotal = 0, citaTotal=0;
			int pac;
			
			do {
				System.out.println("Que quieres hacer?\n1) Crear paciente\n2) Agendar Cita\n3) Ver historial\n0)Salir");
				opc = scan.nextInt();
				switch(opc) {
					case 1://crear
						if(pacTotal < 5) {
							System.out.println("Escribe el nombre:");
							scan.nextLine();
							String nombre = scan.nextLine();
							System.out.println("Escribe el dia de nacimiento:");
							int dia = scan.nextInt();
							System.out.println("Escribe el mes de nacimiento:");
							int mes = scan.nextInt();
							System.out.println("Escribe el ano de nacimiento:");
							int anho = scan.nextInt();
							pacientes[pacTotal]  = new Paciente(nombre, new Fecha(dia, mes, anho) );
							pacTotal++;
						}else {
							System.out.println("No se pueden crear mas pacientes");
						}
					break;
					case 2:
						for(int i=0; i<pacTotal; i++) {
							System.out.println(i+") "+pacientes[i]);
						}
						System.out.println("Escribe el paciente:");
						pac = scan.nextInt();
						
						boolean repetida;
						Fecha fechaCita;
						do {
							System.out.println("Escribe el dia de la cita:");
							int dia = scan.nextInt();
							System.out.println("Escribe el mes de la cita:");
							int mes = scan.nextInt();
							System.out.println("Escribe el ano de la cita:");
							int anho = scan.nextInt();
							fechaCita = new Fecha(dia,mes,anho);
							repetida = false;
							for(int j=0; j<citaTotal; j++) {
								if( fechaCita.toString().equals( citas[j].getFecha().toString() )  ) {
									repetida = true;
								}
							}
						}while(repetida == true);
						
						System.out.println("Escribe el peso del paciente:");
						int peso = scan.nextInt();
						System.out.println("Escribe la estatura del paciente:");
						double est = scan.nextDouble();
						
						citas[citaTotal] = new Cita(pacientes[pac], fechaCita, est, peso);
						citaTotal++;
					break;
					case 3:
						for(int i=0; i<pacTotal; i++) {
							System.out.println(i+") "+pacientes[i]);
						}
						System.out.println("Escribe el paciente:");
						pac = scan.nextInt();
						
						for(int i=0; i<citaTotal; i++) {
							for(int j=i; j<citaTotal; j++){
								if(citas[i].getFecha().toInt() > citas[j].getFecha().toInt()) {
									Cita aux =citas[i];
									citas[i] = citas[j];
									citas[j] = aux;
								}
							}
						}
						for(int i=0; i<citaTotal; i++) {
							if(pacientes[pac] == citas[i].getPaciente()) {
								double imc = IMC.calculaIMC(citas[i].getEstatura(), citas[i].getPeso());
								System.out.println(citas[i].getFecha()+" IMC:"+imc+" "+IMC.getNivel(imc));
							}
						}
						
					break;
				}
			}while(opc!=0);
		}

	}

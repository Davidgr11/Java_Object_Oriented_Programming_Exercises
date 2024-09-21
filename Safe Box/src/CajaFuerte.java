import java.util.Scanner;

//González Robles David Alejandro

public class CajaFuerte {
	Scanner scan=new Scanner(System.in);
	//Atributos
	public int combinacion, i=0, band, prueba;
	public boolean estado=true;
	public String [] contenido=new String[10];
	
	
	//Constuctores
	public CajaFuerte(int combinacion) {//solo recibe combinacion
		this.combinacion=combinacion;
		estado=true;//establece el estado como abierta
		System.out.println("Caja fuerte creada con exito.");
		System.out.println("Combinacion: "+combinacion);
		for(int x=0;x<10;x++){
			contenido[x]="";//inicializo
		}
		if(estado==true)
			System.out.println("Estado: ABIERTA");
		else
			System.out.println("Estado: CERRADA");
	}
	
	public CajaFuerte(int combinacion, boolean estado) {//recibe 2 parametros
		this.combinacion=combinacion;
		this.estado=estado;
		System.out.println("Caja fuerte creada con exito.");
		System.out.println("Combinacion: "+combinacion);
		for(int x=0;x<10;x++){
			contenido[x]="";
		}
		if(estado==true) 
			System.out.println("Estado: ABIERTA");
		else
			System.out.println("Estado: CERRADA");
	}
	
	
	//Métodos
	public void guardar(String contenido) {
		//solo guarda si la caja esta abierta y no esta llena
		if(estado==true) {
			if(i<10) {
				this.contenido[i]=contenido;
				System.out.println("Contenido ingresado correctamente");
				i++;
			}else {
				System.out.println("La caja fuerte esta llena");
			}
		}else {
			System.out.println("La caja fuerte esta cerrada, primero abrela");
		}
	}
	
	public void sacar() {
		//imprime el utimo item y lo quita de la lista
		//Solo saca si esta abierta y tiene algo
		if(estado==true) {
			if(i==0) {
				System.out.println("Aun no hay contenido en la caja fuerte");
			}else {
				System.out.println("Contenido a sacar: "+contenido[i-1]);
				contenido[i]=""; //O =null;
				i--;
				System.out.println("Proceso exitoso");
			}
		}else {
			System.out.println("La caja fuerte esta cerrada, primero abrela");
		}
	}
	
	public void abrir() {
		//solicita combinación y la valida. O muestra que ya estaba abierta
		if(estado==true) {
			System.out.println("La caja fuerte ya se encuentra abierta.");
		}
		else {
			System.out.println("Ingresa la combinacion");
			prueba=scan.nextInt();
			while(prueba!=combinacion) {
				System.out.println("Combinacion incorrecta, intenta nuevamente.");
				prueba=scan.nextInt();
			}
			estado=true;
			System.out.println("La caja fuerte se abrio correctamente.");
			
		}
	}
	
	public void cerrar() {
		//Cierra la caja o muestra que ya estaba cerrada
		if(estado==false) {
			System.out.println("La caja fuerte ya se encuentra cerrada");
		}
		else {
			estado=false;
			System.out.println("La caja fuerte se cerro correctamente");
		}
	}
}

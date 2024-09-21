/* 
INTEGRANTES:
  Caballero Angeles Karina
  Garcia Aguilar Ruben
  Gonzalez Robles David
*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    //PRIMERO SE REALIZAN LAS CREACIONES

    //CREACION DE AEROLINEAS
    Aerolinea[] aero=new Aerolinea [2];
    aero[0]=new Aerolinea("Aeromexico", "Mexico");
    aero[1]=new Aerolinea("British Airways", "Reino Unido");

    //CREACION DE AVIONES
    Avion[] aviones=new Avion[4];
    //avion 1
    aviones[0]=new Avion("Boeing", "747", 6, aero[0]);
    aviones[0].setCostoAsientos(1, 4, 1500);
    aviones[0].setCostoAsientos(5, 6, 1200);
    //avion 2
    aviones[1]=new Avion("Boeing", "747", 6, aero[0]);
    aviones[1].setCostoAsientos(1, 2, 2100);
    aviones[1].setCostoAsientos(3, 6, 1800);
    //avion 3
    aviones[2]=new Avion("Boeing", "747", 3, aero[1]);
    aviones[2].setCostoAsientos(1, 3, 3000);
    //avion 4
    aviones[3]=new Avion("Boeing", "747", 5, aero[1]);
    aviones[3].setCostoAsientos(1, 2, 1900);
    aviones[3].setCostoAsientos(3, 4, 1700);
    aviones[3].setCostoAsientos(5, 5, 1300);

    //CREACION DE VUELOS 
    Vuelo[] vuelos=new Vuelo[4];
    //vuelo 1
    vuelos[0]=new Vuelo("Mexico", "Berlin", aviones[0], new Fecha(6, 3, 2022));
    //vuelo 2
    vuelos[1]=new Vuelo("Paris", "Los Angeles", aviones[1], new Fecha(22, 5, 2022));
    //vuelo 3
    vuelos[2]=new Vuelo("Nueva York", "Amsterdam", aviones[2], new Fecha(30, 7, 2022));
    //vuelo 4
    vuelos[3]=new Vuelo("Polonia", "Madrid", aviones[3], new Fecha(14, 9, 2022));

    //PROGRAMA BASE
    //Declaracion de variables
    int opc, i;
    Scanner scan=new Scanner(System.in);
    do
    {
      do
      {
        //impresion de vuelos
        System.out.println("Selecciona un vuelo");
        for(i=0;i<4;i++){
          System.out.println((i+1)+") "+vuelos[i].infoVuelo());
        }
        //Seleccion y validacion de vuelo
        do{
          opc=scan.nextInt();
        }while(opc<1 || opc>4);
        opc--; 
      
      }while(vuelos[opc].getAvion().estaLleno());
      //si esta lleno se repite      

      if(opc>=0){
        Avion avionElegido=vuelos[opc].getAvion();
        int fila, num, opc2;
        do
        {
          do
          {
            System.out.println(vuelos[opc].infoVuelo());
            do
            {
              System.out.println("Revisa los asientos disponibles");
              avionElegido.imprimirAsientos();
              System.out.println("Elige una fila 1-"+avionElegido.getFilas());
              fila=scan.nextInt();
              System.out.println("Elige un asiento 1-"+avionElegido.getAsientos());
              num=scan.nextInt();
              if(avionElegido.asOcupado(fila, num)){
                System.out.println("El asiento ["+fila+","+num+"] ya esta ocupado");
              }
            }while(avionElegido.asOcupado(fila, num));

            System.out.println("El costo del asiento es de $"+avionElegido.getCostoAsiento(fila, num)+" ¿deseas comprarlo?\n1)Si 0)Cancelar");
            opc2=scan.nextInt();
          }while(opc2!=1);
          avionElegido.ocupaAsiento(fila, num);
          System.out.println("Asiento comprado\nComprar otro asiento del mismo vuelo?\n1)Si 0)No");
          opc2=scan.nextInt();
        }while(opc2==1);
      }
      System.out.println("Deseas ver los vuelos?\n1)Si 0)No");
      opc=scan.nextInt();
    }while(opc==1);
    scan.close();
	}
}

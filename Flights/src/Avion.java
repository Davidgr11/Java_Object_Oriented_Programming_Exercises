public class Avion{
  //ATRIBUTOS
  private String marca;
  private String modelo;
  private int filas;
  public final int ASIENTO_FILA= 6;
  public final int FILAS_MAX= 10;
  private Aerolinea aero;
  private Asiento[][] asientos;

  //CONSTRUCTOR 
  public Avion(String marca, String modelo, int filas, Aerolinea aero){
    this.marca=marca;
    this.modelo=modelo;
    this.filas=validaNum(filas, 1, FILAS_MAX);
    this.aero=aero;
    this.asientos=new Asiento[filas][ASIENTO_FILA];
    for(int i=0;i<filas;filas++){
      for(int j=0;j<ASIENTO_FILA;j++){
        this.asientos[i][j]=new Asiento(i,j);
      }
    }
  }

  //SETTERS Y GETTERS
  public void setMarca(String marca){
    this.marca=marca;
  }
  public String getMarca(){
    return marca;
  }
  public void setModelo(String modelo){
    this.modelo=modelo;
  }
  public String getModelo(){
    return modelo;
  }
  public void setAerolinea(Aerolinea aero){
    this.aero=aero;
  }
  public Aerolinea getAerolinea(){
    return aero;
  }
  public int getFilas(){
    return filas;
  }
  public Asiento[][] getAsientos(){
    return asientos;
  }

  //METODOS
  public int asientosTotal(){
    return filas*ASIENTO_FILA;
  }
  private int validaNum(int num, int min, int max){
    if(num<min){
      return min;
    }
    if(num>max){
      return max;
    }
    return num;
  }
  public void ocupaAsiento(int fila, int num){
    fila=validaNum(fila, 1, this.filas)-1;
    num=validaNum(num, 1, ASIENTO_FILA)-1;
    asientos[fila][num].setOcupado(true);
  }
  public boolean asOcupado(int fila, int num){
    fila=validaNum(fila, 1, this.filas)-1;
    num=validaNum(num, 1, ASIENTO_FILA)-1;
    return asientos[fila][num].getOcupado();
  }
  public boolean estaLleno(){
    for(int i=0;i<filas;filas++){
      for(int j=0;j<ASIENTO_FILA;j++){
        if(!asientos[i][j].getOcupado()){
          return false;
        }
      }
    }
    return true;
  }
  public void setCostoAsientos(int fi, int ff, double costo){
	fi=validaNum(fi, 1, this.filas)-1;
	ff=validaNum(ff, fi, this.filas)-1;
    for(int i=fi;i<=ff;i++){
      for(int j=0;j<ASIENTO_FILA;j++){
          asientos[i][j].setCosto(costo);
        }
      }
  }
  public double getCostoAsiento(int fila, int num){
    fila=validaNum(fila, 1, this.filas)-1;
    num=validaNum(num, 1, ASIENTO_FILA)-1;
    return asientos[fila][num].getCosto();
  }
  public void imprimirAsientos(){
    System.out.println("\tFilas");
    for(int j=0;j<ASIENTO_FILA;j++){
      for(int i=0;i<filas;filas++){
        if(i==0){
          System.out.print("Num\t");
        }
        if(asientos[i][j].getOcupado()){
          System.out.print("[0] ");
        }
        else{
          System.out.print("[ ] ");
        }
      }
      System.out.println();
      if(j==ASIENTO_FILA/2-1){//mitad:pasillo
        System.out.println();
      }
    }
  }
}

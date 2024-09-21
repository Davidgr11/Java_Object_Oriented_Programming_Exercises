public class Asiento {
  //ATRIBUTOS
	private int fila, numero;
	private double costo;
  private boolean ocupado;

  //CONSTRUCTORES
  public Asiento (int fila,int numero,int costo)
  {
    this.fila=fila;
    this.numero=numero;
    this.costo=costo;
    this.ocupado=false;
  }
  public Asiento(int fila, int numero){
    this(fila, numero, 1000);
    //poliformismo:sobrecarga de metodos
  }
  
//SETTERS Y GETTERS
  /*public void setFila(int fila) {
		this.fila = fila;
	}*/
  public int getFila() {
		return fila;
	}
	/*public void setNumero(int numero) {
		this.numero = numero;
	}*/
	public int getNumero() {
		return numero;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
  public double getCosto() {
		return costo;
	}
  public void setOcupado(boolean ocupado){
    this.ocupado=ocupado;
  }
  public boolean getOcupado(){
    return ocupado;
  }
}

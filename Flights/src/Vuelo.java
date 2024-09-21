public class Vuelo {
  //ATRIBUTOS
	private String origen;
	private String destino;
  private Fecha fecha;
  private Avion aviones;
  
  //CONSTRUCTOR
  public Vuelo(String origen, String destino, Avion aviones, Fecha fecha){
    this.origen=origen;
    this.destino=destino;
    this.aviones=aviones;
    this.fecha=fecha;
  }

  //GETTERS
  public String getOrigen() {
		return origen;
	}
	public String getDestino() {
		return destino;
	}
  public Avion getAvion(){
    return aviones;
  }
  public Fecha getFecha(){
    return fecha;
  }
  //METODOS
  public String infoVuelo(){
    String texto=fecha.fechaTexto()+" | Origen: "+origen+" | Destino: "+destino+" | "+aviones.getAerolinea().getNombre();
    if(aviones.estaLleno()){
      texto+=" LLENO";
    }
    return texto;
  }
}

public class Aerolinea {
	//ATRIBUTOS
	private String nombre;
	private String pais;
  
  //CONSTRUCTOR
  public Aerolinea (String nombre, String pais)
  {
      this.nombre=nombre;
      this.pais=pais;
  }
  
  //SETTERS Y GETTERS
  public String getNombre() {
		return nombre;
	}
	public String getPais() {
		return pais;
  }
}


public class Elemento {

	//Atributos
	  private String nombre, venceA;
	  
	  //Constructor
	  public Elemento(String nombre, String venceA){
	    this.nombre=nombre;
	    this.venceA=venceA;
	  }
	  
	  //Setters y Getters
	  public String getNombre() {
	    return nombre;
		}
	  public String getVence(){
	    return venceA;
	  }
	  
	public void setVenceA(String venceA) {
		this.venceA = venceA;
	}

	  //Métodos
	  public int validaEmpate(String nom2){
	    if(nombre.equals(nom2)) {
	    	return 1;
	    }else {
	    	return 0;
	    }
	  }
	  
	  public int validaVictoria(String nom2, String ven){
	    if(venceA.equals(nom2)) {
	    	return 1;
	    }else {
	    	if(ven.equals(nombre)) {
	    		return 0;
	    	}
	    	else
	    		return 2;
	    }
	  }
	  /* INTERESANTE OTRA FORMA
	   	public boolean validaEmpate(Elemento otro) {
		//if(this.nombre.equalsIgnoreCase(otro.nombre) ) {
		if(!this.validaVictoria(otro) && !otro.validaVictoria(this)) {//Yo no le gano a PC y PC no me gana = empate
			return true;
		}
		return false;
	}
	
	public boolean validaVictoria(Elemento otro) {
		if(this.venceA.equalsIgnoreCase(otro.nombre) ) {
			return true;
		}
		return false;
	}
	   */
}

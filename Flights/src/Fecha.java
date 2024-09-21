public class Fecha {
  //ATRIBUTOS
	private int dia;
	private int anio;
	private int mes;

  //CONSTRUCTOR
  public Fecha(int dia,int mes,int anio)
  {
     this.dia=dia;
     this.mes=mes;
     this.anio=anio;
  }

  //SETTERS Y GETTERS
  public void setDia(int dia){
    this.dia=dia;
  }
  public int getDia() {
		return dia;
	}
  public void setMes(int mes){
    this.mes=mes;
  }
  public int getMes() {
		return mes;
	}
  public void setAnio(int anio){
    this.anio=anio;
  }
	public int getAnio() {
		return anio;
	}

  //METODOS
  public String cerosIni(int num){
    String textos="";
    if(num<10){
      textos="0";
    }
    return textos+num;
  }
  public String nombreMes(int mes){
    switch(mes){//darle un string al int
      case 1: return "Enero";
      case 2: return "Febrero";
      case 3: return "Marzo";
      case 4: return "Abril";
      case 5: return "Mayo";
      case 6: return "Junio";
      case 7: return "Julio";
      case 8: return "Agosto";
      case 9: return "Septiembre";
      case 10: return "Octubre";
      case 11: return "Noviembre";
    }
    return "Diciembre";
  }
  //Formatos de fecha
  public String fechaDDMMYYYY(){
    return cerosIni(dia)+"/"+cerosIni(mes)+"/"+anio;
  }
	public String fechaYYYYMMDD(){
    return anio+"/"+cerosIni(mes)+"/"+cerosIni(dia);
  }
  public String fechaTexto(){
    return dia+" de "+nombreMes(mes)+" de "+anio;
  }
}

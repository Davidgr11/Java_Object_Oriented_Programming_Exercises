
public class Persona {
	//Atributos
	public String nombre="", apodo="";
	public int peso, edad;
	public double estatura;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	//Métodos
	public void saludar() {
		System.out.println("Hola, me llamo "+nombre+" me dicen "+apodo);
	}
	//Recibe strings y se los asigna a la estructura
	public void nombrar(String nombre, String apodo) {
		this.nombre=nombre;
		this.apodo=apodo;
	}
	public void pruebaThis(String nombre) {
		System.out.println(nombre);
	}

}

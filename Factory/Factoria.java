public class Factoria{
	public static Transporte crear(char type){
		/*if(type.equals("Avion"))
			return new Avion();
		else if (type.equals("Barco"))
			return new Barco();
		else if (type.equals("Bici"))
			return new Bici();
		else if (type.equals("Carro"))
			return new Carro();
		else if (type.equals("Moto"))
			return new Moto();
		else if (type.equals("Tren"))
			return new Tren();
		else return null;*/
		switch(type){
			case 'A': return new Avion();
			case 'B': return new Barco();
			case 'I': return new Bici();
			case 'C': return new Carro();
			case 'M': return new Moto(); 
			case 'T': return new Tren();
		}
		return null;
	}
}

public class IMC {
	public static double BAJO = 18.5;
	public static double NORMAL = 25.0;
	public static double SOBREPESO = 30.0;
	
	public static double calculaIMC(double estatura, int peso) {
		return peso/(estatura*estatura);
	}
	
	public static String getNivel(double imc) {
		if(imc < BAJO) {
			return "Bajo peso";
		}
		if(imc < NORMAL) {
			return "Normal";
		}
		if(imc < SOBREPESO) {
			return "Sobrepeso";
		}
		return "Obesidad";
		
	}
}

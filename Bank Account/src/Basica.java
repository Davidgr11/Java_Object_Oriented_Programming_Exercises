
public class Basica extends CuentaDebito{

	public Basica(int numero) {
		super(numero);
	}
/*Retiro: 10%, pero si es mayor a 1000: 15%
Depositos mayores a 1000: 5%, si no 0%*/

	//@Override
	public void retirar(double cant) {
		double cantComision = cant;
		//Cuanto me cobrar extra?
		if(cant > 1000) {
			cantComision = cant*1.15;
		}else {
			cantComision = cant*1.1;
		}
		
		if(cantComision <= saldo) {//tengo dinero?
			saldo -= cantComision;
			System.out.println("Se reitro: $"+cant+" Se cobro $"+cantComision);
		}else {
			System.out.println("No hay saldo suficiente");
		}
		
	}

	//@Override
	public void depositar(double cant) {
		if(cant>1000) {
			saldo += cant*0.95;//Solo llega el 95%
		}else {
			saldo += cant;
		}
		
	}
		
}

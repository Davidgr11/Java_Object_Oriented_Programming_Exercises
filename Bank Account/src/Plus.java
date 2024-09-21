
public class Plus extends CuentaDebito{

	public Plus(int numero) {
		super(numero);
	}
/*Retiro si el saldo actual es mayor a 1000: 0%, si no 5%
Depositos: 0%*/

	//@Override
	public void retirar(double cant) {
		double cantComision = cant;
		//Cuanto me cobrar extra?
		if(saldo > 1000) {
			cantComision = cant;
		}else {
			cantComision = cant*1.05;
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
		saldo += cant;
	}
		
}









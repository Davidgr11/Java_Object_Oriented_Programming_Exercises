
public class Nomina extends CuentaDebito{

	public Nomina(int numero) {
		super(numero);
	}
/*Retiro: 0%
Depositos: 0%*/

	//@Override
	public void retirar(double cant) {
		if(cant <= saldo) {//tengo dinero?
			saldo -= cant;
			System.out.println("Se retiro: $"+cant);
		}else {
			System.out.println("No hay saldo suficiente");
		}
		
	}

	//@Override
	public void depositar(double cant) {
		saldo += cant;
	}
		
}





public abstract class CuentaDebito {
	protected double saldo;
	protected int numero;
	
	public CuentaDebito(int numero) {
		super();
		this.numero = numero;
		saldo = 0;
	}
	public double getSaldo() {
		return saldo;
	}
	public int getNumero() {
		return numero;
	}
	public abstract void retirar(double cant);
	public abstract void depositar(double cant);
		
}
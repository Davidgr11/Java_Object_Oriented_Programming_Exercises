
public abstract class Exportacion {
	public boolean exportar(Vehiculo vehiculo) {
		preparar();
		if(cargar(vehiculo)) {
			enviar(vehiculo);
			return true;
		}
		return false;
	}
	
	public abstract void preparar();
	public abstract boolean cargar(Vehiculo vehiculo);
	public abstract void enviar(Vehiculo vehiculo);
}

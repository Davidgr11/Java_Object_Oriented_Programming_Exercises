
public class ExportaTrailer extends Exportacion{
	
	@Override
	public void preparar() {
		System.out.println("El env�o se prepara para partir por tierra");
		
	}

	@Override
	public boolean cargar(Vehiculo vehiculo) {
		System.out.println("El env�o se est� cargando en las bodegas");
		return vehiculo.agregarCargamento();
	}

	@Override
	public void enviar(Vehiculo vehiculo) {
		System.out.println(vehiculo+" est� lleno y partiendo por tierra");
	}
	

}

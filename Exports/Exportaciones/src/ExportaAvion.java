
public class ExportaAvion extends Exportacion{
	
	@Override
	public void preparar() {
		System.out.println("El envío se prepara para partir por aire");
	}

	@Override
	public boolean cargar(Vehiculo vehiculo) {
		System.out.println("El envío se está cargando en los hangares");
		return vehiculo.agregarCargamento();
	}

	@Override
	public void enviar(Vehiculo vehiculo) {
		System.out.println(vehiculo+" está lleno y partiendo por aire");
	}
	

}

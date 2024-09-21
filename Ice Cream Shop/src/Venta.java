
public class Venta {
	//metodos
	Orden orders;
	private double getVentaTotal() {
		return 0.1;
	}
	public void agregaOrden(Orden orden) {
		orders=orden;
	}
	public void imprimeVenta() {
		System.out.println(orders);
	}
	public void exportaVenta() {
		//archivo
	}
}

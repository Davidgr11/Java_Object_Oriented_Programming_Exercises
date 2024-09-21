import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class Venta {
	private ArrayList<Orden> orden = new ArrayList<>();
	
	public void agregaOrden(Orden orden) {
		this.orden.add(orden);
	}
	
	private double getVentaTotal() {
		double total = 0;
		for(Orden ord:this.orden) {
			total+= ord.getCosto();
		}
		return total;
	}
	
	public void imprimeVenta() {
		System.out.println("\n-- Desglose de venta --");
		for(Orden ord:this.orden) {
			System.out.println(ord);
		}
		System.out.println("Total: $"+getVentaTotal());
	}
	
	public void exportaVenta() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("venta_"+Fecha.getFecha()+".txt"));
			writer.write("-- Desglose de venta --\n");
			for(Orden ord:this.orden) {
				writer.write(ord+"\n");
			}
			writer.write("Total: $"+getVentaTotal());
			writer.close();
		}catch(Exception e) {
			System.out.println("Error al leer archivo");
			//e.printStackTrace();
		}
	}
}

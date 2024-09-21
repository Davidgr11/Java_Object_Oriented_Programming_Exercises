import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String nombre;
		int resp;
		do {
			nombre = JOptionPane.showInputDialog("Escribe tu nombre");
			System.out.println(nombre);
			resp = JOptionPane.showConfirmDialog(null, "Estas seguro?");
			System.out.println(resp);
		}while(resp == 1);
		if(resp == 0) {
			JOptionPane.showMessageDialog(null, "Bienvenido "+nombre);
		}
	}

}

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {

	public static void main(String[] args) {
		Cliente c = new Cliente();
	}
	
	public Cliente() {
		Socket server;
		try {
			server = new Socket("200.13.89.14", 40008);

			ObjectOutputStream out;
			try {
				out = new ObjectOutputStream(server.getOutputStream());
				out.writeObject(new Persona("Alejandro", "Lara", 15));
				out.writeObject(new Persona("Ana", "Lopez", 30));
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			//server.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

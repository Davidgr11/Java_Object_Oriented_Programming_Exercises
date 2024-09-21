import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		Server s = new Server();
	}
	
	public Server() {
		ServerSocket server;
		try {
			server = new ServerSocket(40008);
			System.out.println("Servidor listo, esperando conexion...");
			//while(true) {//Espera clientes infinitos
				Socket client = server.accept();
				System.out.println("Cliente conectado");
				
				Persona per = null;
				ObjectInputStream in;
				try {
					in = new ObjectInputStream(client.getInputStream());
					per =  (Persona)in.readObject();
					System.out.println("Recibi: "+per);
					per =  (Persona)in.readObject();
					System.out.println("Recibi: "+per);
				} catch (IOException | ClassNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("Errro al leer");
					e.printStackTrace();
				}
				
				client.close();
			//}
		} catch (IOException e) {
			System.out.println("Error al crear socket");
			e.printStackTrace();
		}
	}
}
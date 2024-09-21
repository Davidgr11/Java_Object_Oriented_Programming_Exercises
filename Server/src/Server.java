import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		Server s=new Server();
	}
	
	public Server() {
		ServerSocket server;
		try {
			server = new ServerSocket(40008);
			System.out.println("Servidor listo, esperandoconexion...");
			
			while(true) {
				Socket client = server.accept();
				System.out.println("Cliente conectado");
				Comando cmd=new Comando(client);
				cmd.escribir("Hola buenos dias");
				Persona per=cmd.leerPersona();
				System.out.println("Recibi: "+per);
				client.close();
			}
		}catch(IOException e) {
			System.out.println("Error al crear socket");
			e.printStackTrace();
		}
	}
	
	public void escribir(Socket socket, String texto) {
		try {
			OutputStreamWriter out = new OutputStreamWriter(socket.getOutputStream());
			BufferedWriter writer = new BufferedWriter(out);
			writer.write(texto);
			writer.close();
		}catch(IOException io) {
			io.printStackTrace();
		}
	}
}

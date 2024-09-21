import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.rmi.UnknownHostException;

public class Cliente {

	public static void main(String[] args) {
		Cliente c=new Cliente();
	}
	
	public Cliente() {
		Socket server;
		try {
			server = new Socket("200.13.89.14",40008);
			//System.out.println(leer(server));
			Comando cmd=new Comando(server);
			System.out.println(cmd.leer());
			cmd.escribirPersona(new Persona("David", "Gonzalez", 21));
			server.close();
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public String leer(Socket socket) {
		try {
			InputStreamReader in=new InputStreamReader(socket.getInputStream());
			BufferedReader reader = new BufferedReader(in);
			String str = reader.readLine();
		}catch(IOException io) {
			io.printStackTrace();
		}
		return "";
	}
}

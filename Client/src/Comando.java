import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Comando {
	private Socket socket;
	
	public Comando(Socket socket) {
		super();
		this.socket=socket;
	}
	
	public void escribir(String texto) {
		try {
			OutputStreamWriter out = new OutputStreamWriter(socket.getOutputStream());
			BufferedWriter writer = new BufferedWriter(out);
			writer.write(texto);
			writer.close();
		}catch(IOException io) {
			io.printStackTrace();
		}
	}
	
	public String leer() {
		try {
			InputStreamReader in=new InputStreamReader(socket.getInputStream());
			BufferedReader reader = new BufferedReader(in);
			String str = reader.readLine();
			return str;
		}catch(IOException io) {
			io.printStackTrace();
		}
		return "";
	}
	
	public void escribirPersona(Persona per) {
		ObjectOutputStream out;
		try {
			out=new ObjectOutputStream(socket.getOutputStream());
			out.writeObject(per);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public Persona leerPersona() {
		ObjectInputStream in;
		try {
			in=new ObjectInputStream(socket.getInputStream());
			return (Persona)in.readObject();
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}

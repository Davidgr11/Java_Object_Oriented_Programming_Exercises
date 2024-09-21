import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static Conexion con;
	public static Connection connect;
	
	private Conexion() {
		
		try {
			Class.forName("org.sqlite.JDBC");
			connect = DriverManager.getConnection("jdbc:sqlite:prueba.db");
		}catch(SQLException sqle) {
			System.out.println("Error de conexi�n");
		}catch(ClassNotFoundException cnfe) {
			System.out.println("JDBC no encontrado");
		}
	}
	
	public static Conexion getInstance() {
		if(con == null) {
			con = new Conexion();
		}
		return con;
	}
}

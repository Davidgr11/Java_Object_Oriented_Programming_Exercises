import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static Conexion con;
	public Connection connect;
	
	private Conexion() {
		try {
			Class.forName("org.sqlite.JDBC");
			connect = DriverManager.getConnection("jdbc:sqlite:EjemploSQL.db");
			}catch(SQLException sqle) {
			System.out.println("Error de conexión");
			}catch(ClassNotFoundException cnfe) {
			System.out.println("JDBC no encontrado");
		}
	}
	
	public static Conexion getInstance() {
		if(con==null) {
			con=new Conexion();//si no había ninguna, creo una
		}
		return con;//si ya tenia una, me regresa la que había
	}
}

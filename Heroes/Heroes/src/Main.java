import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Connection con = Conexion.getInstance().connect;
		Scanner scan = new Scanner(System.in);
		int opc;
		
		do {
			System.out.println("Que quieres hacer?");
			System.out.println("1) Insertar");
			System.out.println("2) Seleccionar");
			System.out.println("3) Borrar");
			System.out.println("4) Actualizar");
			System.out.println("0) Salir");
			opc = scan.nextInt();
			
			switch(opc) {
				case 1: //Insertar
					String nom, ap;
					int clave;
					System.out.println("Dame el nombre");
					nom = scan.next();
					System.out.println("Dame el apellido");
					ap = scan.next();
					System.out.println("Dame la clave");
					clave = scan.nextInt();
					try {
						String sql = "INSERT INTO Ninho (id, nombre, apellido) VALUES (?,?,?)";
						PreparedStatement ps = con.prepareStatement(sql);
						ps.setInt(1, clave);
						ps.setString(2, nom);
						ps.setString(3, ap);
						ps.executeUpdate();
						
					}catch(Exception e) {
						System.out.println("Error");
					}
					
					break;
				case 2: //Seleccionar
					
					try {
						String sql = "SELECT * FROM Ninho";
						PreparedStatement ps = con.prepareStatement(sql);
						ResultSet res = ps.executeQuery();
						while(res.next()) {
							System.out.println(res.getInt("id")+" "+res.getString("nombre")+" "+res.getString("apellido"));
						}
						res.close();
						
					}catch(Exception e) {
						System.out.println("Error");
					}
					
					break;
				case 3: //Borrar
					break;
				case 4: //Actualizar
					break;
			}
		}while(opc!=0);

	}

}

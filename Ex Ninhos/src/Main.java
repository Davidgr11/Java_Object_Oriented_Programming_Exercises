import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
//GONZALEZ ROBLES DAVID ALEJANDRO

public class Main {

	public static void main(String[] args) {
		Connection con=Conexion.getInstance().connect;
		Scanner scan=new Scanner(System.in);
		int opc;
		do {
			System.out.println("Que quieres hacer?");
			System.out.println("1) Insertar");
			System.out.println("2) Seleccionar");
			System.out.println("3) Borrar");
			System.out.println("4) Actualizar");
			System.out.println("0) Salir");
			opc=scan.nextInt();
			switch(opc) {
			case 1: //Insertar
					String nom, ap;
					int clave;
					System.out.println("Dame el nombre");
					nom=scan.next();
					System.out.println("Dame el apellido");
					ap=scan.next();
					System.out.println("Dame la clave");
					clave=scan.nextInt();
					try {
						String sql="INSERT INTO Ninho(Id, Nombre, Apellido) VALUES(?,?,?)";
						PreparedStatement ps=con.prepareStatement(sql);
						ps.setInt(1, clave);
						ps.setString(2, nom);
						ps.setString(3, ap);
						ps.executeUpdate();
					}catch(Exception e) {
						System.out.println("Error");
					}
				break;
			case 2://Seleccionar
					try {
						String sql="SELECT * FROM Ninho";
						PreparedStatement ps=con.prepareStatement(sql);
						ResultSet res=ps.executeQuery();
						while(res.next()) {
							System.out.println(res.getInt("Id")+" "+res.getString("Nombre")+" "+res.getString("Apellido"));
						}
						res.close();
					}catch(Exception e) {
						System.out.println("Error");
					}
				break;
			case 3://Borrar
					System.out.println("Dame la clave");
					clave=scan.nextInt();
					try {
						String sql="DELETE FROM Ninho WHERE Id="+clave;
						PreparedStatement ps=con.prepareStatement(sql);
						ps.executeUpdate();
					}catch(Exception e) {
						System.out.println("Error");
					}
					break;
			case 4://Actualizar
					System.out.println("Dame la clave");
					clave=scan.nextInt();
					System.out.println("Dame el nuevo nombre");
					nom=scan.next();
					System.out.println("Dame el nuevo apellido");
					ap=scan.next();
					try {
						String sql="UPDATE Ninho SET Nombre=\""+nom+"\", Apellido=\""+ap+"\" WHERE Id="+clave;
						//System.out.println(sql);
						PreparedStatement ps=con.prepareStatement(sql);
						//ps.setString(1, ap);
						ps.executeUpdate();
					}catch(Exception e) {
						System.out.println("Error");
					}
				break;
			case 0: System.out.println("Hasta luego");
				break;
			}
		}while(opc!=0);
		scan.close();
	}

}

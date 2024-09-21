import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.Scanner;
//David Alejandro Gonzalez Robles
public class Main {

	public static void main(String[] args) {
		System.out.println("----------------------------");
		System.out.println("----- Cinema EL DORADO -----");
		System.out.println("----------------------------");
		Scanner scan=new Scanner(System.in);
		int opc, fila, asiento, cantidad;
		//matrices
		//fun fact: hubiera sido mejor hacer un cubo
		String[][] sitP1=new String[4][6];
		String[][] sitP2=new String[4][6];
		String[][] sitP3=new String[4][6];
		String[][] sitP4=new String[4][6];
		//inicializo matrices
		for(int r=0;r<4;r++) {
			for(int c=0;c<6;c++) {
				sitP1[r][c]="-";
				sitP2[r][c]="-";
				sitP3[r][c]="-";
				sitP4[r][c]="-";
			}
		}
		/*int[] sitP2=new int[24];
		int[] sitP3=new int[24];
		int[] sitP4=new int[24];*/
		Connection con=Conexion.getInstance().connect;//conexion
		
		//ciclo base
		do {
			System.out.println("Que pelicula quieres ver?");
			
			//consultamos la db para ver las opciones de peliculas
			try {
				String sql="SELECT * FROM Pelicula";
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet res=ps.executeQuery();
				while(res.next()) {//solo mostramos el nombre y el id
					System.out.println(res.getInt("id")+") "+res.getString("nombre"));
				}
				res.close();
			}catch(Exception e) {
				System.out.println("Error");
			}
			System.out.println("0) Salir");
			
			//se escanea la opcion requerida
			opc=scan.nextInt();
			
			//si me da 0 es porque quiere salir
			if(opc!=0) {
				while(opc<1 || opc>4) {//hice esto porque no me salia el SQLException
					System.out.println("Error al consultar la BD");
					System.out.println("Dame un numero de pelicula valido por favor");
					opc=scan.nextInt();
				}
				
				//consultamos en la base de datos
				try {
					String sql="SELECT * FROM Pelicula WHERE id="+opc;
					PreparedStatement ps=con.prepareStatement(sql);
					ResultSet res=ps.executeQuery();
					while(res.next()) {
						System.out.println(res.getInt("id")+") "+res.getString("nombre")+" "+res.getString("clasificacion")+" "+res.getInt("duracion")+" "+res.getString("hora"));
					}
					res.close();
				}catch(SQLException sqle) {
					System.out.println("Error al consultar la BD");
				}
				System.out.println("Filas (1-4) Asientos (1-6)");
				switch(opc) {
					case 1: System.out.println("  1 2 3 4 5 6");
							for(int r=0;r<4;r++) {
								System.out.print(r+1);
								for(int c=0;c<6;c++) {
									System.out.print(" "+sitP1[r][c]);
								}
								System.out.println();
							}
						break;
					case 2: System.out.println("  1 2 3 4 5 6");
							for(int r=0;r<4;r++) {
								System.out.print(r+1);
								for(int c=0;c<6;c++) {
									System.out.print(" "+sitP2[r][c]);
								}
								System.out.println();
							}
						break;
					case 3: System.out.println("  1 2 3 4 5 6");
							for(int r=0;r<4;r++) {
								System.out.print(r+1);
								for(int c=0;c<6;c++) {
									System.out.print(" "+sitP3[r][c]);
								}
								System.out.println();
							}
						break;
					case 4: System.out.println("  1 2 3 4 5 6");
							for(int r=0;r<4;r++) {
								System.out.print(r+1);
								for(int c=0;c<6;c++) {
									System.out.print(" "+sitP1[r][c]);
								}
								System.out.println();
							}
						break;
						
				}
				System.out.println("Que fila quieres?");
				fila=scan.nextInt();
				fila--;
				System.out.println("Que asiento?");
				asiento=scan.nextInt();
				asiento--;
				System.out.println("Cuantos asientos?");
				cantidad=scan.nextInt();
				
				//actualizacion de asientos
				System.out.println("Actualizacion de asientos");
				switch(opc) {
				case 1: //llenar asientos
						for(int i=0;i<cantidad;i++) {
							for(int r=0;r<4;r++) {
								System.out.print(r+1);
								for(int c=0;c<6;c++) {
									if(fila==r && asiento==c) {
										if(sitP1[r][c]=="-") {
											sitP1[r][c]="O";
										}
									}
								}
							}
							asiento++;
						}
						System.out.println("  1 2 3 4 5 6");
						for(int r=0;r<4;r++) {
							System.out.print(r+1);
							for(int c=0;c<6;c++) {
								System.out.print(" "+sitP1[r][c]);
							}
							System.out.println();
						}
					break;
				case 2: //llenar asientos
					for(int i=0;i<cantidad;i++) {
						for(int r=0;r<4;r++) {
							System.out.print(r+1);
							for(int c=0;c<6;c++) {
								if(fila==r && asiento==c) {
									if(sitP2[r][c]=="-") {
										sitP2[r][c]="O";
									}
								}
							}
						}
						asiento++;
					}
					System.out.println("  1 2 3 4 5 6");
					for(int r=0;r<4;r++) {
						System.out.print(r+1);
						for(int c=0;c<6;c++) {
							System.out.print(" "+sitP2[r][c]);
						}
						System.out.println();
					}
					break;
				case 3: //llenar asientos
					for(int i=0;i<cantidad;i++) {
						for(int r=0;r<4;r++) {
							System.out.print(r+1);
							for(int c=0;c<6;c++) {
								if(fila==r && asiento==c) {
									if(sitP3[r][c]=="-") {
										sitP3[r][c]="O";
									}
								}
							}
						}
						asiento++;
					}
					System.out.println("  1 2 3 4 5 6");
					for(int r=0;r<4;r++) {
						System.out.print(r+1);
						for(int c=0;c<6;c++) {
							System.out.print(" "+sitP3[r][c]);
						}
						System.out.println();
					}
					break;
				case 4: //llenar asientos
					for(int i=0;i<cantidad;i++) {
						for(int r=0;r<4;r++) {
							System.out.print(r+1);
							for(int c=0;c<6;c++) {
								if(fila==r && asiento==c) {
									if(sitP4[r][c]=="-") {
										sitP4[r][c]="O";
									}
								}
							}
						}
						asiento++;
					}
					System.out.println("  1 2 3 4 5 6");
					for(int r=0;r<4;r++) {
						System.out.print(r+1);
						for(int c=0;c<6;c++) {
							System.out.print(" "+sitP4[r][c]);
						}
						System.out.println();
					}
					break;
					
			}
				
			}
			
			
		}while(opc!=0);
		System.out.println("Adios");
	}

}

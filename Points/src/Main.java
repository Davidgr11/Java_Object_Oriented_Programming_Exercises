import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x1, x2, y1, y2, z1, z2;
		int opc, dim, lados;
		Linea lin;
		Poligono poli;
		x1= x2= y1= y2= z1= z2=dim=0;
		do {
			System.out.println("Que quieres hacer?\n1)Crear Linea\n2)Crear Poligono\n0)Salir");
			opc = scan.nextInt();
			if(opc!=0) {
				System.out.println("Cuantas dimensiones? 2 o 3?");
				dim = scan.nextInt();
			}
			switch(opc) {
				case 1:
					System.out.println("Dame la x1");
					x1 = scan.nextInt();
					System.out.println("Dame la y1");
					y1 = scan.nextInt();
					if(dim>=3) {
						System.out.println("Dame la z1");
						z1 = scan.nextInt();
					}
					System.out.println("Dame la x2");
					x2 = scan.nextInt();
					System.out.println("Dame la y2");
					y2 = scan.nextInt();
					if(dim>=3) {
						System.out.println("Dame la z2");
						z2 = scan.nextInt();
						
						lin = new Linea(new Punto3D(x1,y1,z1), new Punto3D(x2,y2,z2) );
					}else {
						lin = new Linea(new Punto(x1,y1), new Punto(x2,y2) );
					}
					System.out.println("Magnitud: "+lin.magnitud());
					System.out.println(lin);
				break;
				case 2:
					do {
						System.out.println("Cuantos lados? 3 a 6");
						lados = scan.nextInt();
					}while(lados<3 || lados>6);
					poli = new Poligono(lados);
					for(int i=0; i<lados; i++) {
						System.out.println("Dame la x"+(i+1));
						x1 = scan.nextInt();
						System.out.println("Dame la y"+(i+1));
						y1 = scan.nextInt();
						if(dim>=3) {
							System.out.println("Dame la z"+(i+1));
							z1 = scan.nextInt();
							poli.agregaPunto(new Punto3D(x1,y1,z1));
						}else {
							poli.agregaPunto(new Punto(x1,y1));
						}
						System.out.println("--"+poli+" total:"+poli.getTotal());
					}
					System.out.println("Perimetro: "+poli.perimetro());
					System.out.println(poli);
			}
		}while(opc!=0);
	}

}

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Animal[] anim = new Animal[5];
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int opc;
		
		anim[0] = new Gato("gato");
		anim[1] = new Pato("pato");
		anim[2] = new Perro("perro");
		anim[3] = new Puerco("puerco");
		anim[4] = new Vaca("vaca");
		do {
			anim[rand.nextInt(5)].sonido();
			System.out.println("Otro animal? 1) Si 0) No");
			opc = scan.nextInt();
		}while(opc!=0);
		scan.close();
	}

}

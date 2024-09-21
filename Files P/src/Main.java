import java.util.Scanner;

class Main {
  public static void main(String[] args) {
	  int x, y, total;
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Dame x");
	  x=scan.nextInt();
	  System.out.println("Dame y");
	  y=scan.nextInt();
	  
	  //caso a probar
	  try{
		  total=x/y;
		  System.out.println("X/Y= "+total);
	  }
	  //El catch atrapa excepciones
	  /*catch(ArithmeticException e) {//excepcion aritmetica
		  System.out.println("No puedes dividir entre cero");
	  }
	  catch(ArithmeticException e2) {//excepcion numerica
		  System.out.println("Debes escribir numeros");
	  }*/
	  catch(Exception e) {//excepcion cualquiera
		  System.out.println("Ocurrio algo malo");
		  e.printStackTrace();
	  }
	  /*System.out.println("Otra instruccion");
	  System.out.println("Dame la z");
	  double z=scan.nextDouble();
	  double raiz=Math.sqrt(z);
	  System.out.println("");*/
	  scan.close();
  }
}

import java.util.Scanner;

public class Main
{
    
	public static void main(String[] args) {
	    
	     int numA,numB;
	     
	     Scanner leer = new Scanner(System.in);
	     
	     System.out.println("Ingrese un numero:");
	     numA = leer.nextInt();
	     
	     System.out.println("Ingrese un numero:");
	     numB = leer.nextInt();
	     
	     if ((numA > 0 && numB > 0) || (numA < 0 && numB < 0)) {
         System.out.println("true");
      }
	     
	}
}

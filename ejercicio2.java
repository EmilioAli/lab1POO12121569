
import java.util.Scanner;

public class Main
{
    
	public static void main(String[] args) {
	    
	     int numero;
	     
	     Scanner leer = new Scanner(System.in);
	     
	     System.out.println("Ingrese un numero:");
	     numero = leer.nextInt();
	     
	     if(numero > 0 && numero%2 !=0){
	        System.out.println("true");
	     }
	     
    // Respuesta: no imprime nada  
	}
}

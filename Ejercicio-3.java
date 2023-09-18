import java.util.Scanner; 

public class Main 
{ 
    public static void main(String[] args) { 

        double cantidad_euros, tasaConversion, pesetas; 
        Scanner s = new Scanner(System.in); 

        System.out.println("Ingrese la cantidad de euros:"); 
        cantidad_euros = s.nextDouble(); 

        tasaConversion = 166.386; 
        pesetas = cantidad_euros * tasaConversion; 

        System.out.println(cantidad_euros + " euros equivalen a " + pesetas + " pesetas."); 
    } 
} 
import java.util.Scanner; 

public class Main 
{ 
    public static void main(String[] args) { 

        double cantidad_soles, tasaConversion, euros; 
        Scanner s = new Scanner(System.in); 

        System.out.println("Ingrese la cantidad de soles:"); 
        cantidad_soles = s.nextDouble(); 

        tasaConversion = 0.25; 
        euros = cantidad_soles * tasaConversion; 

        System.out.println(cantidad_soles + " euros equivalen a " + euros + " euros."); 
    } 
} 
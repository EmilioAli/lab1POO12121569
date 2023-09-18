import java.util.Scanner; 
import java.lang.Math; 

public class Main { 
    public static void main(String[] args) { 
        double g, altura, tiempo; 
        Scanner s = new Scanner(System.in); 

        System.out.print("Ingrese la altura de donde cae el objeto en metros: "); 
        altura = s.nextDouble(); 

        g = 9.81; 

        tiempo = Math.sqrt((2 * altura) / g); 
        System.out.println("El tiempo que tardará en caer es: " + tiempo); 
    } 
} 
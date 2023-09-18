import java.util.Scanner; 

public class Main 
{ 
    public static void main(String[] args) { 

        int x, y, sum, res, div, multi; 
        Scanner s = new Scanner(System.in); 

        System.out.println("Ingrese el valor de x: "); 
        x = s.nextInt(); 

        System.out.println("Ingrese el valor de x: "); 
        y = s.nextInt(); 

        sum = x + y; 
        res = x - y; 
        div = x / y; 
        multi = x + y; 
  
        System.out.println("La suma de x e y es: " + sum); 
        System.out.println("La resta de x e y es: " + res);
        System.out.println("La division de x e y es: " + div);
        System.out.println("La multiplicacion de x e y es: " + multi);
    } 
} 
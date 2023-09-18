import java.util.Scanner; 
public class Main { 
    public static void main(String[] args) { 
        int limiteSuperior, divisor;  
        Scanner s = new Scanner(System.in); 

        System.out.print("Ingrese el límite superior (número entero positivo): "); 
        limiteSuperior = s.nextInt(); 

        System.out.print("Ingrese el divisor (número entero positivo diferente de 0): "); 
        divisor = s.nextInt(); 

        if (divisor <= 0) { 
            System.out.println("El divisor debe ser un número entero positivo diferente de 0."); 
            return; 
        } 

        System.out.println("Números enteros positivos menores a " + limiteSuperior + " que no son divisibles por " + divisor + ":"); 

        for (int i = 1; i < limiteSuperior; i++) { 
            if (i % divisor != 0) { 
                System.out.println(i); 
            } 
        } 
    } 
} 
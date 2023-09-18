import java.util.Scanner; 
public class Main { 
    public static void main(String[] args) { 
        int numero, num_abs, num_dig; 

        Scanner s = new Scanner(System.in); 

        System.out.print("Ingrese un número entero de hasta 5 dígitos: "); 
        numero = s.nextInt(); 

        num_abs = Math.abs(numero); 

        if (num_abs < 10) { 
            num_dig = 1; 
        } else if (num_abs < 100) { 
            num_dig = 2; 
        } else if (num_abs < 1000) { 
            num_dig = 3; 
        } else if (num_abs < 10000) { 
            num_dig = 4; 
        } else { 
            num_dig = 5; 
        } 

        System.out.println("El número " + numero + " tiene " + num_dig + " dígitos."); 
    } 
} 
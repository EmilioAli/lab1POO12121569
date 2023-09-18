import java.util.Scanner; 

public class Main { 
    public static void main(String[] args) { 
        int numero; 
        boolean Par, div_entre5; 

        Scanner s = new Scanner(System.in); 

        System.out.print("Ingrese un número: "); 
        numero = s.nextInt(); 

        Par = numero % 2 == 0; 
        div_entre5 = numero % 5 == 0; 

        if (Par && div_entre5) { 
            System.out.println(numero + " es par y divisible entre 5."); 
        } else if (Par) { 
            System.out.println(numero + " es par pero no divisible entre 5."); 
        } else if (div_entre5) { 
            System.out.println(numero + " no es par pero es divisible entre 5."); 
        } else { 
            System.out.println(numero + " no es par ni divisible entre 5."); 
        } 
    } 
} 
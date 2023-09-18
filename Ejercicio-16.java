import java.util.Scanner; 
public class Main { 
    public static void main(String[] args) { 
        int positivos, negativos, numero;  
        Scanner s = new Scanner(System.in); 

        positivos = 0; 
        negativos = 0; 

        for (int i = 1; i <= 10; i++) { 
            System.out.print("Ingrese el número " + i + ": "); 
            numero = s.nextInt(); 

            if (numero > 0) { 
                positivos++; 
            } else if (numero < 0) { 
                negativos++; 
            } 
        } 

        System.out.println("Cantidad de números positivos: " + positivos); 
        System.out.println("Cantidad de números negativos: " + negativos); 
    } 
} 
import java.util.Scanner; 
public class Main { 
    public static void main(String[] args) { 
        long numero, sumaDigitosPares, digito;  
        Scanner s = new Scanner(System.in); 

        System.out.print("Ingrese un número entero positivo: "); 
        numero = s.nextLong(); 

        sumaDigitosPares = 0; 
        String digitosParesEnOrden = ""; 

        while (numero != 0) { 
            digito = numero % 10;  

            if (digito % 2 == 0) { 
                sumaDigitosPares += digito; 
                digitosParesEnOrden = digito + " " + digitosParesEnOrden; 
            } 

            numero /= 10;  
        } 

        if (digitosParesEnOrden.isEmpty()) { 
            System.out.println("No se encontraron dígitos pares en el número."); 
        } else { 
            System.out.println("Dígitos pares en orden (de izquierda a derecha): " + digitosParesEnOrden); 
            System.out.println("Suma de los dígitos pares: " + sumaDigitosPares); 
        } 
    } 
} 
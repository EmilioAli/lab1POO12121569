import java.util.Scanner; 
public class Main { 
    public static void main(String[] args) { 
        int numero, contadorNumeros, sumaImpares, mayorPares;  
        Scanner s = new Scanner(System.in); 

        contadorNumeros = 0; 
        sumaImpares = 0; 
        mayorPares = Integer.MIN_VALUE; 

        System.out.println("Introduzca números (introduzca un número negativo para finalizar):"); 

        while (true) { 
            numero = s.nextInt(); 

            if (numero < 0) { 
                break; 
            } 

            contadorNumeros++; 

            if (numero % 2 != 0) { 
                sumaImpares += numero; 
            } else { 
                if (numero > mayorPares) { 
                    mayorPares = numero; 
                } 
            } 
        } 

        if (contadorNumeros == 0) { 
            System.out.println("No se ha introducido ningún número."); 
        } else { 
            double mediaImpares = (double) sumaImpares / contadorNumeros; 
            System.out.println("Se han introducido " + contadorNumeros + " números."); 
            System.out.println("La media de los números impares es: " + mediaImpares); 

            if (mayorPares != Integer.MIN_VALUE) { 
                System.out.println("El mayor de los números pares es: " + mayorPares); 
            } else { 
                System.out.println("No se han introducido números pares."); 
            } 
        } 
    } 
} 
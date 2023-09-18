import java.util.Scanner; 
public class Main { 
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in); 

        final int combinacionCajaFuerte = 1234; 
        final int intentosMaximos = 4; 
        int intentos = 0; 

        while (intentos < intentosMaximos) { 
            System.out.print("Introduzca la combinación de la caja fuerte (4 cifras): "); 
            int intento = s.nextInt(); 

            if (intento == combinacionCajaFuerte) { 
                System.out.println("La caja fuerte se ha abierto satisfactoriamente."); 
                break; 
            } else { 
                System.out.println("Lo siento, esa no es la combinación."); 
                intentos++; 
            } 
        } 

        if (intentos == intentosMaximos) {  
            System.out.println("Se han agotado las oportunidades. La caja fuerte permanece cerrada."); 
        } 
    } 
} 
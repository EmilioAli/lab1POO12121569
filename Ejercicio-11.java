import java.util.Scanner; 

public class Main { 
    public static void main(String[] args) { 
        int hora, minutos, segundos_medianoche; 
        Scanner s = new Scanner(System.in); 

        System.out.print("Ingrese la hora (0-23): "); 
        hora = s.nextInt(); 

        System.out.print("Ingrese los minutos (0-59): "); 
        minutos = s.nextInt(); 

        if (hora < 0 || hora > 23 || minutos < 0 || minutos > 59) { 
            System.out.println("Hora o minutos ingresados no válidos."); 
        } else { 
            segundos_medianoche = (23 - hora) * 3600 + (59 - minutos) * 60; 

            System.out.println("Faltan " + segundos_medianoche + " segundos para llegar a la medianoche."); 
        } 
    } 
} 
import java.util.Scanner; 

public class Main  
{ 
    public static void main(String[] args) { 
        double notaPrimerExamen, mediaDeseada,notaSegundoExamen; 

        Scanner s = new Scanner(System.in); 

        System.out.print("Ingrese la nota del primer examen: "); 
        notaPrimerExamen = s.nextDouble(); 

        System.out.print("¿Que nota quieres sacar en el trimestre?: "); 
        mediaDeseada = s.nextDouble(); 

        notaSegundoExamen = (mediaDeseada - (notaPrimerExamen * 0.4)) / 0.6; 
        System.out.println("Para tener un " + mediaDeseada + " en el trimestre necesitas sacar un " + notaSegundoExamen + " en el segundo examen. "); 
    } 
} 
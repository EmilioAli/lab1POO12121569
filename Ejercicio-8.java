import java.util.Scanner; 

public class Main  
{ 
    public static void main(String[] args) { 
        int hora; 
        Scanner s = new Scanner(System.in); 

        System.out.print("Ingrese la hora: "); 
        hora = s.nextInt(); 

        String saludo; 
        if (hora >= 6 && hora <= 12) { 
            saludo = "Buenos días"; 
        } else if (hora >= 13 && hora <= 20) { 
            saludo = "Buenas tardes"; 
        } else if ((hora >= 21 && hora <= 23) || (hora >= 0 && hora <= 5)) { 
            saludo = "Buenas noches"; 
        } else { 
            saludo = "Hora no válida"; 
        } 

        System.out.println(saludo); 
    } 
} 
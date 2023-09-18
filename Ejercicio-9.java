import java.util.Scanner; 

public class Main  
{ 
    public static void main(String[] args) { 
         Scanner s = new Scanner(System.in); 

        System.out.print("Ingrese el número de horas trabajadas: "); 
        int horasTrabajadas = s.nextInt(); 

        double tarifaHoraOrdinaria = 12.0;  
        double tarifaHoraExtra = 16.0;     

        double salarioSemanal; 

        if (horasTrabajadas <= 40) { 
            salarioSemanal = horasTrabajadas * tarifaHoraOrdinaria; 
        } else { 
            int horasOrdinarias = 40; 
            int horasExtras = horasTrabajadas - horasOrdinarias; 
            salarioSemanal = (horasOrdinarias * tarifaHoraOrdinaria) + (horasExtras * tarifaHoraExtra); 
        } 

        System.out.println("El salario semanal del trabajador es: " + salarioSemanal + " soles"); 
    } 
} 
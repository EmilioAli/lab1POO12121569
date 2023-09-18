import java.util.Scanner; 

public class Main 
{ 
    public static void main(String[] args) { 

        double horas_trabajadas, tasa_porhora, salario; 
        Scanner s = new Scanner(System.in); 

        System.out.println("Ingrese la cantidad de horas trabajadas:"); 
        horas_trabajadas = s.nextDouble(); 

        tasa_porhora = 12; 
        salario = horas_trabajadas * tasa_porhora; 

        System.out.println("El salario semanal del empleado en euros es:" + salario); 
    } 
} 
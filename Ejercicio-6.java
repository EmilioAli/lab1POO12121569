import java.util.Scanner;  
public class Main  
{  
    public static void main(String[] args) {  

        double Megabytes, Kilobytes;  

        Scanner s = new Scanner(System.in);  

        System.out.println("Ingresa la cantidad en Megabytes (Mb): ");  

        Megabytes = s.nextDouble();  
        Kilobytes = Megabytes * 1024; 

        System.out.println(Megabytes + " Mb equivalen a " + Kilobytes + " Kb.");  

    }  

} 
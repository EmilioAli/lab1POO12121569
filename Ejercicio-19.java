import java.util.Scanner; 
public class Main { 
    public static void main(String[] args) { 
        int altura, longitudPaloHorizontal;  
        Scanner s = new Scanner(System.in); 

        System.out.print("Ingrese la altura de la letra L: "); 
        altura = s.nextInt(); 

        longitudPaloHorizontal = altura / 2 + 1; 

        for (int i = 1; i <= altura; i++) { 
            for (int j = 1; j <= longitudPaloHorizontal; j++) { 

                if (j == 1 || i == altura) { 
                    System.out.print("*"); 
                } else { 
                    System.out.print(" "); 
                } 
            } 
            System.out.println(); 
        } 
    } 
} 
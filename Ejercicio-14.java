import java.util.Scanner; 
public class Main { 
    public static void main(String[] args) { 
        int hora, minutos, minutosHastaFinDeSemana, dias, horasRestantes, minutosRestantes; 
        Scanner s = new Scanner(System.in); 

        System.out.print("Ingrese el día de la semana (lunes a viernes): "); 
        String diaSemana = s.next().toLowerCase(); 

        System.out.print("Ingrese la hora (0-23): "); 
        hora = s.nextInt(); 
        System.out.print("Ingrese los minutos (0-59): "); 
        minutos = s.nextInt(); 
        
        minutosHastaFinDeSemana = 0; 

        if (diaSemana.equals("lunes")) { 
            minutosHastaFinDeSemana = (4 * 24 * 60) + (15 * 60) - (hora * 60 + minutos); 
        } else if (diaSemana.equals("martes")) { 
            minutosHastaFinDeSemana = (3 * 24 * 60) + (15 * 60) - (hora * 60 + minutos); 
        } else if (diaSemana.equals("miércoles")) { 
            minutosHastaFinDeSemana = (2 * 24 * 60) + (15 * 60) - (hora * 60 + minutos); 
        } else if (diaSemana.equals("jueves")) { 
            minutosHastaFinDeSemana = (1 * 24 * 60) + (15 * 60) - (hora * 60 + minutos); 
        } else if (diaSemana.equals("viernes")) { 
            if (hora < 15) { 
                minutosHastaFinDeSemana = (15 * 60) - (hora * 60 + minutos); 
            } else { 
                System.out.println("Ya es viernes después de las 15:00, el fin de semana ha comenzado."); 
                return; 
            } 
        } 

        dias = minutosHastaFinDeSemana / (24 * 60); 
        horasRestantes = (minutosHastaFinDeSemana % (24 * 60)) / 60; 
        minutosRestantes = minutosHastaFinDeSemana % 60; 

        System.out.println("Faltan " + dias + " días, " + horasRestantes + " horas y " + minutosRestantes + " minutos para el fin de semana."); 
    } 
} 
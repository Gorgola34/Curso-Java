package Condictions;
import java.util.Scanner;
public class Translator {

    public static String scannerBy(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduzca día de la semana");
        String day=scanner.nextLine();
        scanner.close();
        return day;
    }

    public static void main(String[] args) {
        String day=scannerBy();
        switch(day.toLowerCase()){
            case "lunes":
            System.out.println("Monday");
            break;
            case "martes":
            System.out.println("Tuesday");
            break;
            case "miercoles":
            System.out.println("Wednesday");
            break;
            case "miércoles":
            System.out.println("Wednesday");
            break;
            default:
            System.out.println("No hay clase");

        }
    }


    
}

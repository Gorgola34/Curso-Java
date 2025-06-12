package Condictions;
import java.util.Scanner;
public class TranslatorWeek {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce día");
        String day=scanner.nextLine();
        scanner.close();
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
            default:
            System.out.println("No hay clase");
        }
    }


    
}

package Conditions;
import java.util.*;
public class WeekTranslator {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String day=scanner.nextLine();
        scanner.close();

    switch(day.toLowerCase()){
        case "monday":
            System.out.println("lunes");
            break;
        case "tuesday":
            System.out.println("martes");
            break;
        case "wednesday":
            System.out.println("miércoles");
            break;
        case "thursday":
            System.out.println("jueves");
            break;
        case "friday":
            System.out.println("viernes");
            break;
        case "saturday":
            System.out.println("sábado");
            break;
        case "sunday":
        System.out.println("domingo");
            break;
        default:
        System.out.println("no hay mas días");

        
    }
    
    }


    

}


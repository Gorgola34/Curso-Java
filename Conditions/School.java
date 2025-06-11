package Conditions;
import java.util.*;
public class School {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduzca su edad:");
        int age=scanner.nextInt();
        scanner.close();
        String[] messages={
            "Lunes y Miercoles de 16:00 a 17:00 Kinder",
            "Martes y Jueves de 16:30 a 17:30 1st year",
            "Martes y jueves de 17:30 a 19 2nd year",
            "Lunes y Miercoles de 17:00 a 18:30 3er year",
            "Error"
        };
        int index;

        if(age>=0&&age<=6){
           index=0;
        }else if(age>=7&&age<=8){
            index=1;
        }else if(age>=9&&age<=10){
            index=2;
        }else if(age>=11&&age<=13){
            index=3;
        }else {
            index=4;
        }
        System.out.println(messages[index]);
    }

    
}

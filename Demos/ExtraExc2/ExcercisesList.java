package Demos.ExtraExc2;
import java.util.*;
public class ExcercisesList {

    public static void main(String[] args) {
        List<String> days= new ArrayList<>();
        days.add("LUNES");
        days.add("Lunes");
        days.add("Martes");
        days.add("Miercoles");
        days.add("Jueves");
        days.add("Viernes");
        days.add("Sabado");
        days.add("Domingo");
        days.add(4,"Juernes");
        

        List<String> days2= new ArrayList<>();
        days2.addAll(days);
        System.out.println(days.get(3));
        System.out.println(days.get(4));
        System.out.println(days.getFirst());
        System.out.println(days.getLast());
        days.remove("Juernes");

        for(String day:days){
            System.out.println(day);
        }
        if((days.contains("Lunes"))|| (days.contains("LUNES"))){
            System.out.println("Existe lunes");
            Collections.sort(days);
        System.out.println(days);
        }
        
        }
        //days.clear();
        }
        



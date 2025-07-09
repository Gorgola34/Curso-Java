package Demos.ExtraExc2;

import java.time.LocalDateTime;

public class ExBufferDates {

    public static void dates(){
        LocalDateTime d= LocalDateTime.now();
        System.out.println("Day: " + d.getDayOfMonth());
        System.out.println("Month " + d.getMonthValue());
        System.out.println("Year " + d.getYear());
    }
    public static void buffer(){
        StringBuffer b= new StringBuffer("Hellow");
        b.replace(3,5,"xa");
        System.out.println(b);
        b.reverse();
        System.out.println(b);
    }

    public static void main(String[] args) {
        dates();
        buffer();
    }

}

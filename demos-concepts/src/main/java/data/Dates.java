package data;
import java.time.LocalDateTime;
public class Dates {

    public void calendar(){
    
        LocalDateTime date=  LocalDateTime.now();
        System.out.println("Day: " + date.getDayOfMonth());
        System.out.println("Month: " + date.getMonthValue());
        System.out.println("Year: " + date.getYear());
    }

    public static void main(String[] args) {
        Dates d= new Dates();
        d.calendar();
        
    }
    
}

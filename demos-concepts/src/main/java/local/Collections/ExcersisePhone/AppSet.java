package local.Collections.ExcersisePhone;
import java.util.*;
public class AppSet {

    public static void main(String[] args) {

        Set<Employee> note= new HashSet<>();

        note.add(new Employee("Salvador Abbott", "651345789","@h"));
        note.add(new Employee("Marcos Hermoso", "623456812", "@z"));
        note.add(new Employee("Maria Buste", "652862341", "@g"));

        for(Employee not:note){
            System.out.println(not);
        }



        
    }

    



}

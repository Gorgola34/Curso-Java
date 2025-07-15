package local.Collections.ExcersisePhone;
import java.util.*;
public class App {


    public static void main(String[] args) {

        Employee e1= new Employee("Pedro Perez","652345678","@g");
        Employee e2=new Employee("Sara Gutierrez", "645231456", "@h");
        Employee e3= new Employee("Pepito Garcia", "564567892", "@r");

        Map<Integer,Employee> notes= new HashMap<>();
        notes.put(1,e1);
        notes.put(2, e2);
        notes.put(3,e3);
        
       System.out.println(notes.entrySet());
       System.out.println(notes.get(3));
    

        }
        



    }

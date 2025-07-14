package local.Collections.ExcersisePhone;
import java.util.*;
public class App {


    public static void main(String[] args) {

        Employer e1= new Employer("Pedro Perez","652345678","@g");
        Employer e2=new Employer("Sara Gutierrez", "645231456", "@h");
        Employer e3= new Employer("Pepito Garcia", "564567892", "@r");

        Map<Integer,Employer> notes= new HashMap<>();
        notes.put(1,e1);
        notes.put(2, e2);
        notes.put(3,e3);
        
       System.out.println(notes.entrySet());
       System.out.println(notes.get(3));
    

        }
        



    }

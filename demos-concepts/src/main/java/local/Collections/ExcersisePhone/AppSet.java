package local.Collections.ExcersisePhone;
import java.util.*;
public class AppSet {

    public static void main(String[] args) {

        Set<Employer> note= new HashSet<>();

        note.add(new Employer("Salvador Abbott", "651345789","@h"));
        note.add(new Employer("Marcos Hermoso", "623456812", "@z"));
        note.add(new Employer("Maria Buste", "652862341", "@g"));

        for(Employer not:note){
            System.out.println(not);
        }



        
    }

    



}

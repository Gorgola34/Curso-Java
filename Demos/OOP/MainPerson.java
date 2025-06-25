package Demos.OOP;
import java.util.*;
public class MainPerson {

    public static void  showArrayList(){
        ArrayList<Person> x= new ArrayList<>();
        x.add(new Person("Maria", 45));
        x.add(new Person("Enrique", 30));
        x.add(new Person("Daniel", 34));
        
        for(Person p:x){
           System.out.println("""
                   Id:    %s
                   Name:  %s
                   Age:   %s
                   """.formatted(p.getId(),p.getName(),p.getAge()));
    }
    
    }

    public static void main(String[] args) {
        showArrayList();
        

       

        
        }

        
    }
    


package local.Collections;

import java.util.*;

public class SetPerson {

    public static void main(String[] args) {

    Person p1= new Person("Alice", "Mc", 20);
    Person p2= new Person("Daniel", "Garcia", 30);
    Person p3= new Person("Sara", "Rodriguez", 8);

    Set<Person> x= new TreeSet<>();
    x.add(p1);
    x.add(p2);
    x.add(p3);
    
    for(Person p:x){
        System.out.println(p.getName());
        System.out.println(p.getSurname());
        System.out.println(p.getAge());
    }



        
    }

    
}

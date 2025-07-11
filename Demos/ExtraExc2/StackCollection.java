package Demos.ExtraExc2;
import java.util.*;
public class StackCollection {

    public static void main(String[] args) {
        Stack<String> x= new Stack<>();
        x.add("Emilia");
        x.add("Salvador");
        x.add("Pepe");
        
        if(x.contains("Emilia")){
            System.out.println("Existe emilia");
        }
        System.out.println(x.firstElement());
        System.out.println(x.lastElement());
        System.out.println(x.isEmpty());
        //System.out.println(x.pop());
        System.out.println(x.peek());
        System.out.println(x.size());
        }

    }

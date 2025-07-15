package Demos.ExtraExc2;
import java.util.*;
public class StackReverse {


    public static void main(String[] args) {
        Stack<Integer> list= new Stack<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for(Integer row:list){
            System.out.println(row);
        }
        
        Collections.reverse(list);
        System.out.println(list);
        
        
    }
    
}

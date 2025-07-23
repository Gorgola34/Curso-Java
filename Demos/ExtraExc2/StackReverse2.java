package data.Generics;
import java.util.*;
public class StackReverse2 {

    public static Stack<Integer> pila=new Stack<>();
    public static List<Integer> list= new ArrayList<>();

    public static void showStack(){
        pila.add(1);
        pila.add(2);
        pila.add(3);
        pila.add(4);
        System.out.println(pila);
    }
    public static void reverse(){
        while(!pila.isEmpty()){
            list.add(pila.pop());
            System.out.println(list);
        }
    }
    public static void main(String[] args) {
        showStack();
        reverse();
        // Collections.reverse(list);
        // System.out.println(list);
    }


}

package Demos.ExtraExc2;
import java.util.*;
public class StackRev {

    public static Stack<Integer> createStack(){
        Stack<Integer> x= new Stack<>();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        return x;
    }
    public static void showStack(Stack<Integer> x){
        for(int row:x){
            System.out.println(row);
        }
    }
    public static void showInvertedStack(Stack<Integer> x){
        Collections.reverse(x);
        System.out.println(x);
    }
    public static void main(String[] args) {
        Stack<Integer> x=createStack();
        showStack(x);
        showInvertedStack(x);

    }
    
}

package Demos.ExtraExc2;
import java.util.*;
public class ExcerciseStackPalin {

    public static String name="Holaaaaaa";


    public static String reverse(){
        String result="";
        for(int i=name.length()-1;i>=0;i--){
            result+=name.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Stack<String> s= new Stack<>();
        String name=reverse();
        s.add(name);
        for(String row:s){
            System.out.println(row);
        }
    }

}

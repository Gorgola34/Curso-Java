package local.Collections;
import java.util.*;
public class ListDemo {

    public static void main(String[] args) {

    List<Integer> arrayList= new ArrayList<>();
    List<Integer> linkedList= new LinkedList<>();
    List<Integer> vector= new Vector<>();
    List<Integer> stack= new Stack<>();

    for(int i=0;i<=50;i+=10){
        arrayList.add(i);
        linkedList.add(i);
        vector.add(i);
        stack.add(i);
    }
    for(int a:arrayList){
        System.out.println(a);
    }
    System.out.println("-------");
    for(int l:linkedList){
        System.out.println(l);
    }
    System.out.println("--------");
    for(int s:stack){
        System.out.println(s);
    }
        
    }

    //List: ArrayList, LinkedList, Vector, Stack,

   
    



}

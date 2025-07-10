package local.Collections;
import java.util.*;
public class CollectionDemo {

   

    public static void main(String[] args) {

         List<Integer> coll= new ArrayList<>();
         coll.add(2);
         coll.add(34);
         coll.add(23);
         System.out.println("Tamaño: " + coll.size());
         System.out.println("Vacio?: " + coll.isEmpty());
         System.out.println("Contiene?: " + coll.contains(2));
         coll.remove(2);
        for(int l:coll){
        System.out.println(l);
         }

         Set<String> set= new HashSet<>();
         set.add("Paco");
         set.add("Pedro");
         set.add("Maria");
         System.out.println("Size " + set.size());
         System.out.println("Empty " + set.isEmpty());

         for(String s:set){
            System.out.println(s);
         }
        
        
        }



}

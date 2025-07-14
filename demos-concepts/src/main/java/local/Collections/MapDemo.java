package local.Collections;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {

         Map<Character,String> x=new HashMap<>();
         x.put('A',"Alpha");
         x.put('B', "Betta");
         x.put('C', "Charlie");

         x.put('A', "Alfa");
         x.replace('B',"Beta");
         x.replace('Z',"Zebra");
         x.remove('A');
         x.remove('Z');

         System.out.println(x.keySet());
         System.out.println(x.values());
         System.out.println(x.get('B'));
         System.out.println(x.get("R"));
         System.out.println(x.entrySet());

         
       
            
         }


         }



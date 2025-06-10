package Operators;

public class EvenOdds {

    public static void mode1(String[] args){
         if(args.length==0){
            System.out.println("Tienes que añadir numero");
            return;
          }
          int even=Integer.valueOf(args[0]);
          if(even%2==0){
            String result="Par";
            System.out.println("El numero es" + result);
          }else {
            String result ="Impar";
            System.out.println("El numero es" + result);
          }
    }      

    public static void main(String[] args) {
        mode1(args);
        int x=23;
        int y=40;
        System.out.println(x<y?"SI":"NO");
          
          
        }

    } 
        
    
    

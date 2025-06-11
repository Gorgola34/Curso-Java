package Operators;
import java.util.*;
public class AgeGreeting {

    public static int getAgeByScanner(){
        Scanner scanner=new Scanner(System.in);
            System.out.println("Introduzca edad");
            int age=scanner.nextInt();
            scanner.close();
            return age;
    }
    public static void main(String[] args) {

         if(args.length==0) {
        System.out.println("Se acabo, dime la edad");
        return;
         }
        int age=Integer.valueOf(args[0]);  
        
        if(age>=0&&age<18){
            System.out.println("Niño");
        }else if(age>=18&&age<33){
            System.out.println("Joven");
        }else if(age>=33&&age<65){
            System.out.println("Adulto");
        }else{
            System.out.println("Jubilado");
        }
}       //int age=getAgeByScanner();                     
}       






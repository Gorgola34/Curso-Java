package Demos.ExtraExercises;
import java.util.*;
public class Calculator {

    public static int scannerby(){
        Scanner scanner= new Scanner(System.in);
        int a=scanner.nextInt();
        return a;
    }
    public static int scannerBy2(){
        Scanner scanner= new Scanner(System.in);
        int b=scanner.nextInt();
        return b;
    }

    public static int divide(int a,int b){
        int result=0;
        try{
         result=a/b;
        }catch(ArithmeticException e){
            System.out.println("No dividir entre 0");
        }finally{
            System.out.println("Operacion iniciada");
        }
        return result;
    }
   
    public static void main(String[] args) {
        int a=scannerby();
        int b=scannerBy2();
        System.out.println(divide(a, b));

    }
        
    
}

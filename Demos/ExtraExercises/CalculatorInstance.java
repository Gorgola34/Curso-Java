package Demos.ExtraExercises;
import java.util.*;
public class CalculatorInstance {

    public static int scannerby(){
        Scanner scanner= new Scanner(System.in);
        int a=scanner.nextInt();
        return a;
    }
    public static int scannerBy(){
        Scanner scanner= new Scanner(System.in);
        int b=scanner.nextInt();
        return b;
    }

    public static int add(int a,int b){
        int result= a+b;
        return result;
    }

    public int multiply(int a,int b){
        int result=a*b;
        return result;
    }
    public static void main(String[] args) {
        int a=scannerBy();
        int b=scannerby();
        int result=0;
        CalculatorInstance c= new CalculatorInstance();
        System.out.println("El resultado es: " + add(a,b));
        System.out.println("El resultado es: " +c.multiply(a,b));
    }


    
}

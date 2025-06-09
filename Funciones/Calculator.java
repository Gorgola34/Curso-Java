package Funciones;
import java.util.*;
public class Calculator {

    public static int add(int num1,int num2){
        int result=num1+num2;
        return result;

    }
    public static int subtraction(int num1,int num2){
        int result=num1-num2;
        return result;
    }
    public static int multiply(int num1,int num2){
        int result=num1*num2;
        return result;
        
    }
    public static int division(int num1,int num2){
        int result=num1/num2;
        return result;
    }

    public static void showOp(int result){
        System.out.println("La suma es:" + result);

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduzca numero entero");
        int num1=scanner.nextInt();
        System.out.println("Introduzca otro numero entero");
        int num2=scanner.nextInt();
        scanner.close();
        showOp(add(num1,num2));
        showOp(subtraction(num1, num2));
        showOp(multiply(num1, num2));
        showOp(division(num1, num2));
        
    }
   
    
}

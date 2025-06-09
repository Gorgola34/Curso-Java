package Funciones;
import java.util.*;
public class Calculator {

public static int sum(int num1,int num2){
    int result=num1+num2;
    System.out.println("La suma es:" +result);
    return result;

}
public static int subtraction (int num1,int num2){
    int result=num1-num2;
    System.out.println("La resta es:" + result);
    return result;
    
}
public static int multiplication(int num1,int num2){
    int result=num1*num2;
    System.out.println("La multiplicacion es:" + result);
    return result;
}
public static int division(int num1,int num2){
    int result=num1/num2;
    System.out.println("La division es:" + result);
    return result;
    
}
public static int getInt(String message){
    Scanner scanner=new Scanner(System.in);
     System.out.println("Dime un numero entero");
    int num=scanner.nextInt();
    System.out.println("Dime otro numero entero");
     //scanner.close();
    return num;
}
public static void show(int result){
    System.out.println("El resultado es:" + result);

}
public static void main(String[] args) {

     int num1=getInt("Dime un numero entero");
     int num2=getInt("Dime otro numero entero");
    sum(num1,num2);
    subtraction(num1, num2);
    multiplication(num1, num2);
    division(num1,num2);
    show(sum(num1,num2));
    show(subtraction(num1, num2));
    show(multiplication(num1, num2));
    show(division(num1,num2));
   
}

}













  







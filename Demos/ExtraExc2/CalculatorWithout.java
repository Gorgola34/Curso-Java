package Demos.ExtraExc2;
import java.util.*;
public class CalculatorWithout {

    public static int pow(int a){
        int result=1;
        for(int i=1;i<=3;i++){
            result*=a;
        }
        return result;
    }

    public static int factorial(int a){
        int result=1;
        for(int i=1;i<=a;i++){
            result*=i;
        }
        return result;
    
}
public static void main(String[] args) {
    System.out.println(pow(5));
    System.out.println(factorial(5));
}

}

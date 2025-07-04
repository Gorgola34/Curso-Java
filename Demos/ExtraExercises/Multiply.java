package Demos.ExtraExercises;
import java.util.*;
public class Multiply {

    public static int scannerby(){
        Scanner scanner= new Scanner(System.in);
        int a=scanner.nextInt();
        return a;

    }
    public static int scannerby2(){
        Scanner scanner= new Scanner(System.in);
        int b=scanner.nextInt();
        return b;
    
}

    public int multiply(int a,int b){
        int result=a*b;
        return result;
    }

    public static void main(String[] args) {
        int a=scannerby();
        int b=scannerby2();
        Multiply m= new Multiply();
        System.out.println(m.multiply(a,b));
    }


}

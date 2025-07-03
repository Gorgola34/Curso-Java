package Demos.ExtraExercises;
import java.util.*;
public class Calcu {

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
    public static int scannerby3(){
        Scanner scanner= new Scanner(System.in);
        int num=scanner.nextInt();
        return num;
    }
    public static int sum(int a,int b){
        int sum=a+b;
        return sum;

    }
    public static int multiply(int a,int b){
        int multiply=a*b;
        return multiply;
    }

    public static void main(String[] args) {
        int a=scannerby();
        int b=scannerby2();
        int num=scannerby3();
        switch(num){
            case 1:
            System.out.println(sum(a,b));
            break;
            case 2:
            System.out.println(multiply(a, b));
            break;
            default:
            System.out.println("No mas");

        }
    
    }
    
}

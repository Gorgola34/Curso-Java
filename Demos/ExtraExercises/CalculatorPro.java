package Demos.ExtraExercises;
import java.util.*;
public class CalculatorPro {

    public static int scannerbY(){
        Scanner scanner= new Scanner(System.in);
        int a=scanner.nextInt();
        return a;
    }
    public static int scannerby(){
        Scanner scanner= new Scanner(System.in);
        int b=scanner.nextInt();
        return b;
    }
    public static int scanner2(){
        Scanner scanner= new Scanner(System.in);
        int num=scanner.nextInt();
        return num;
    }
    public int add(int a,int b){
        int result=a+b;
        return result;
    }
    public int multiply(int a,int b){
        int result=a*b;
        return result;
    }
    public int pow(int a){
        int result=1;
        for(int i=1;i<=3;i++){
            result*=a;
        }
        return result;
    }
    public int factorial(int a){
        int result=1;
        for(int i=1;i<=a;i++){
            result*=i;
        }
        return result;
    }
    public void menu(int num, int a, int b){
        switch(num){
            case 1:
            System.out.println(add(a,b));
            break;
            case 2:
            System.out.println(multiply(a, b));
            break;
            case 3:
            System.out.println(pow(a));
            break;
            case 4:
            System.out.println(factorial(a));
            break;
            default:
            System.out.println("FIN");
        }
    }
    public static void main(String[] args) {
        CalculatorPro c= new CalculatorPro();
        int a=scannerbY();
        int b=scannerby();
        int num=scanner2();
        c.menu(num,a,b);
        
        
    }
    
}

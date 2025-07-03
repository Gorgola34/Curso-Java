package Demos.OOP;
import java.util.*;
public class CalculatorPOO {

    public static double scannerby(){
        Scanner scanner= new Scanner(System.in);
        double a=scanner.nextInt();
        return a;
    }

    public static double scannerBy(){
        Scanner scanner= new Scanner(System.in);
        double b=scanner.nextInt();
        return b;
    }

    public static int scannerSwitch(){
        Scanner scanner= new Scanner(System.in);
        int num=scanner.nextInt();
        return num;
    }

    public double sum(double a, double b){
        double result=a+b;
        return result;
    }

    public double multiply(double a, double b){
        double result=a*b;
        return result;
    }

    public void menu(int num, double a,double b){
        switch(num){
            case 1:
            System.out.println(sum(a, b));
            break;
            case 2:
            System.out.println(multiply(a, b));
            break;
            default:
            System.out.println("Fin de calculadora");
        }
    }

    public static void main(String[] args) {

        CalculatorPOO calc= new CalculatorPOO();
        double a=scannerby();
        double b=scannerBy();
        int num=scannerSwitch();
        calc.menu(num,a,b);

   


    

        
    }
    
}

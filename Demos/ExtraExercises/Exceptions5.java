package Demos.ExtraExercises;
import java.util.*;
public class Exceptions5 {

    public static double scannerby(){
        Scanner scanner= new Scanner(System.in);
        double a=scanner.nextInt();
        return a;
    }
    public static double scannerBy2(){
        Scanner scanner=new Scanner(System.in);
        double b=scanner.nextInt();
        return b;
    }
    public static int divide(int a,int b){
        int result=0;
        try{
            result=a/b;
            if(b<0&&a<0){
                throw new IllegalArgumentException();
            }
        }catch (ArithmeticException e){
            System.out.println("No se divide entre 0");

        }catch(IllegalArgumentException e){
            System.out.println("No numeros negativos");

        }finally{
            System.out.println("Operacion iniciada");
        }
        return result;
    }   
    
    public static void main(String[] args) {
        int a=(int) scannerby();
        int b=(int) scannerBy2();
        divide(a, b);
    }
    
}

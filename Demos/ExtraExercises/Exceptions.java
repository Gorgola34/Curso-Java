package Demos.ExtraExercises;
import java.util.*;
public class Exceptions {

    public static int scannerby(){
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        return n;
    }
    public static int scannerby2(){
        Scanner scanner= new Scanner(System.in);
        int n2=scanner.nextInt();
        return n2;
    }
    public static void main(String[] args) {
        int n=scannerby();
        int n2=scannerby2();
        try{
            int result=n/n2;
            System.out.println(result);
        }catch(ArithmeticException exception){
            System.out.println("Error, no se puede dividir entre 0");

        }

        }
    }
    


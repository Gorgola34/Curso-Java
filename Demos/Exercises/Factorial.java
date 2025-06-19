package Demos.Exercises;
import java.util.Scanner;

public class Factorial {

    public static int scannerby(){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        return n;
    }

    public static int factorial(int n){
        int factor=1;
        for(int i=factor;i<=n;i++){
            factor*=i;

        }
        return factor;
    }

    static long recursive(long number){
        if(number==1){
            return number;
        }
        Long result= number *recursive(-1);
            return result;
        
    }
    public static void main(String[] args) {

        int n=scannerby();
        System.out.println(factorial(n));
        
        
    }
}

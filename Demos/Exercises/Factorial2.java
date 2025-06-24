package Demos.Exercises;
import java.util.*;
public class Factorial2 {

    public static int scannerbY(){
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.close();
        return n;

    }

    public static int factorial(int n){
        int factor=1;
        for(int i=factor;i<=n;i++){
            factor*=i;
        }
        return factor;
    }
    
    public static void main(String[] args) {
        int n=scannerbY();
        System.out.println(factorial(n));
        
    }
}

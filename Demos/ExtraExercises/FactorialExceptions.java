package Demos.ExtraExercises;
import java.util.*;
public class FactorialExceptions {

    public static int scannerBy(){
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        return n;
    }
    public static int calculateFactorial(int n){
        int factor=1;
        for(int i=factor;i<=n;i++){
            factor*=i;
        }
        return factor;
    }

    public static void tryCatch(int n){
        try {
            if(n<0){
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("No valen numeros negativos");
        }
    }
    public static void main(String[] args) {
        int n=scannerBy();
        System.out.println(calculateFactorial(n));
        tryCatch(n);
    }

    
}

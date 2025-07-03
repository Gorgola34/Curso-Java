package Demos.ExtraExercises;
import java.util.*;
public class Fact {

    private static int scannerby(){
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        return n;
    }

    private int factorial(int n){
        int factor=1;
        for(int i=factor;i<=n;i++){
            factor*=i;

        }
        return factor;
    }

    private void tryCatch(int n){
        try {
            if(n<0){
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("No valores negativos");
        } finally{
            System.out.println("Programa iniciado");
        }
    }

    public static void main(String[] args) {
        int n=scannerby();
        Fact f1= new Fact();
        f1.tryCatch(n);
        System.out.println(f1.factorial(n));
        
    }
    
}

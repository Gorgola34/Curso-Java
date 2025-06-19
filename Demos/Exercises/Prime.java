package Demos.Exercises;
import java.util.*;
public class Prime {

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static ArrayList<Integer> Primes(int n){
        ArrayList<Integer>x = new ArrayList<Integer>();
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
            System.out.println(i);
        }
        
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(13));
        ArrayList<Integer> x =Primes(13);

    }
    
}

package IterationFor;
import java.util.Scanner;
import java.util.ArrayList;
public class ListPrimes {

    public static int scannerBy(){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.close();
        return n;
    }

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

    public static ArrayList<Integer> calculatePrimes(int n){
        ArrayList<Integer> x= new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                x.add(i);
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int n=scannerBy();
        System.out.println(isPrime(n));
        ArrayList<Integer> x= calculatePrimes(n);
        for(int primes:x){
            System.out.println(primes);
        }
        
    }
        
    }
    


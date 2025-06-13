package IterationFor;

import java.util.*;

public class PrimeList {


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
    public static int scannerBy(){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Introduce el número para ver si es Primo o no");
    int n=scanner.nextInt();
    scanner.close();
    return n;

}
    private static void calculatePrimes(int n){
        for(int i=2; i<n;i++){
            if(isPrime(i)){
                System.out.println(i + " ");
                
                
            }

        }
        
    }

public static void main(String[] args) {
    int n=scannerBy();
    calculatePrimes(n);
}





}

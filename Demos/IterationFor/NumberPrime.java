package Demos.IterationFor;
import java.util.Scanner;
public class NumberPrime {

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
    String message=("Introduce el número para ver si es Primo o no");
    System.out.println(message);
    int n=scanner.nextInt();
    scanner.close();
    return n;

}

public static void main(String[] args) {

    int n=scannerBy();
    System.out.println(isPrime(n));
}





}

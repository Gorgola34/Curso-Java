package Exercises;
import java.util.*;
public class SumNumbers {

    public static int scannerBy(){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.close();
        return n;
    }

    public static int sum(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;

        }
        return sum;
    }

    public static void show(int sum){
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int n=scannerBy();
        show(sum(n));
        
    }

   



    
}

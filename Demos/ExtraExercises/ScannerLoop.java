package Demos.ExtraExercises;
import java.util.*;
public class ScannerLoop {

    public static int scannerby(){
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        return n;
    }
    public static int scannerBy(){
        Scanner scanner= new Scanner(System.in);
        int n2=scanner.nextInt();
        return n2;
    }

    public static void loop(int n,int n2){
        for(int i=n;i<=n2;i+=2){
            System.out.println(i);
        }

    }
    public static void main(String[] args) {
        int n=scannerby();
        int n2=scannerBy();
        loop(n,n2);
    }


    
}

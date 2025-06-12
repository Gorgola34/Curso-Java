package Operators2;
import java.util.Scanner;
public class IsEven {

    public static boolean IsPar(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static int scannerBy(){
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.close();
        return n;

    }


    public static void main(String[] args) {
        int n=scannerBy();
        System.out.println(IsPar(n));
        
    }
    
}

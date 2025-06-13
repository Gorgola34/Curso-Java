package Operators2;
import java.util.Scanner;
public class Fibonacci {

    public static int scannerBy(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce los terminos que va a tener la secuencia");
        int limit=scanner.nextInt();
        scanner.close();
        return limit;
    }
    public static void main(String[] args) {
        int limit=scannerBy();
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=limit;i++){
            int suma=a+b;
            a=b;
            b=suma;
            System.out.println(b);
        
        }
       
    }
    

}
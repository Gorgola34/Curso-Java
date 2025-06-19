package Demos.MasIteraciones;
import java.util.Scanner;
public class FibonacciWhile {


    public static final int max=20;


    public static int scannerBy(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce el número de terminos deseado, máximo: " + max + " " + "términos" );
        int numberTerms=scanner.nextInt();
        scanner.close();
        return numberTerms;
    }


    public static void fibonacciSequence(int numberTerms){
        int a =0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        while(b<=numberTerms){
            int suma=a+b;
            // if(suma>numberTerms){
            //     break;
            // }
            a=b;
            b=suma;
            System.out.println(a);
        }
        }
    public static void main(String[] args) {
        int numberTerms=scannerBy();
        fibonacciSequence(numberTerms);
       
        
        
    }
    
}
    


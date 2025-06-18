package MasIteraciones;
import java.util.Scanner;
public class Fibonacci {

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
        for(int i=1;i<=numberTerms-2;i++){
            int suma=a+b;
            a=b; //Actualizar a b, para que prosiga la secuencia,
            b=suma; // la secuencia será la suma 
            System.out.println(suma);
        }
    }
    
    public static void main(String[] args) {
        int number=scannerBy();
        fibonacciSequence(number);
       
        
        
    }
    
}

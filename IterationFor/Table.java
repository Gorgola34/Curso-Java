package IterationFor;
import java.util.Scanner;
public class Table {

    public static final int LIMIT=10;

    public static int scannerBy(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Elije que número de tabla quieres del 1 al 10");
        System.out.println("Escribe 0 si quieres todas las tablas");
        int n=scanner.nextInt();
        scanner.close();
        return n;
    }
    public static void showMultiply(int n){
       for(int i=0;i<=LIMIT;i++){
            System.out.printf( "%s x %s = %s\n", n,i,n*i);
        }
    }

    public static void showAllTables(){
        for(int i=0;i<=LIMIT;i++){
                showMultiply(i);
    }
    }

    public static void main(String[] args) {
        int n=scannerBy();
        if(n!=0){
            showMultiply(n);
        }else{
            showAllTables();
        }
    }
    
}

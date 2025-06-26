package Demos.ExtraExercises;
import java.util.Scanner;
public class Exponent {

    public static int scannerBy(){
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.close();
        return n;
    }
    public static void exponencial(int n){
        for(int i=0;i<=10;i++){
            System.out.printf("%s ^ %s\n",n,i);
        }
    }
    public static void main(String[] args) {
        int n=scannerBy();
        exponencial(n);

        
    }


    
}

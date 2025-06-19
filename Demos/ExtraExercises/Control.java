package Demos.ExtraExercises;
import java.util.Scanner;
public class Control {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
    int n=scanner.nextInt();

    if(n%2==0){
        System.out.println("par");
    }else{
        System.out.println("impar");
        
    }
    if(n>0){
        System.out.println("positivo");
    }else if(n<0){
        System.out.println("negativo");
    }else{
        System.out.println("cero");
        
    }

    scanner.close();
    

    }

    


}


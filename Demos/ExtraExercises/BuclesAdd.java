package Demos.ExtraExercises;
import java.util.*;
public class BuclesAdd {

    public static int scanner1(){
        Scanner scanner= new Scanner(System.in);
        int number=scanner.nextInt();
        return number;
    }
    public static int scanner2(){
        Scanner scanner= new Scanner(System.in);
        int number2=scanner.nextInt();
        return number2;
    }
    public static void bucleNum(int number, int number2){
        for(int i=number; i<= number2;i++){
            System.out.println(i + 100);
        }
    }
    public static void main(String[] args) {
        int number=scanner1();
        int number2=scanner2();
        bucleNum(number, number2);

    }
    
}

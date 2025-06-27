package Demos.ExtraExercises;
import java.util.*;
public class EvenBucle {

    public static int scannerby(){
        Scanner scanner= new Scanner(System.in);
        int num=scanner.nextInt();
        return num;

    }
    public static void even(int num){
        for(int i=0;i<=num;i++){
            System.out.println(i);
            if(i%2==0){
                System.out.println("Par");
            }else{
                System.out.println("Impar");
        }
    }
    
}
    public static void main(String[] args) {
        int num=scannerby();
        even(num);
        
    
}

}

package Demos.ExtraExercises;
import java.util.Scanner;
public class While {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        boolean sentinel= true;
        while(sentinel){
            int n=scanner.nextInt();
           
            if(n>0){
                System.out.println("positivo");
            }else{
                System.out.println("negativo");

            }
            if(n==0){
                sentinel=false;
            }
            
            


        }


        
    }
    
}

package Demos.ExtraExercises;
import java.util.*;
public class Pyramid {

    public static int scannerby(){
        Scanner scanner= new Scanner(System.in);
        int h=scanner.nextInt();
        scanner.close();
        return h;
    }

    public static void pyramid(int h){
        for(int i=1;i<h;i++){
            for(int j=0;j<h-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int h=scannerby();
        pyramid(h);
    }
    
}

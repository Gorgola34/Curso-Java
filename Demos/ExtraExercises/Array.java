package Demos.ExtraExercises;
import java.util.Scanner;
public class Array {


    public static void main(String[] args) {
        int [] x=new int[10];
        Scanner scanner= new Scanner(System.in);
        x[0]=scanner.nextInt();
        x[1]=scanner.nextInt();
        x[2]=scanner.nextInt();
        x[3]=scanner.nextInt();
        x[4]=scanner.nextInt();
        x[5]=scanner.nextInt();
        x[6]=scanner.nextInt();
        x[7]=scanner.nextInt();
        x[8]=scanner.nextInt();
        x[9]=scanner.nextInt();


        for(int row:x){
            System.out.println(" valor"+ row);
        }

        }
    }
    


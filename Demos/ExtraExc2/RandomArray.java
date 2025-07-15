package Demos.ExtraExc2;
import java.util.*;
public class RandomArray {

    public static int randomby(){
        Random random= new Random();
        int n=random.nextInt(41);
        return n;
    }

    public static void main(String[] args) {
        int [] x= new int [4];
    
        x [0]=randomby();
        x [1]=randomby();
        x [2]=randomby();
        x [3]=randomby();
         for(int i:x){
            System.out.println(i);

        }
    }

}


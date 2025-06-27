package Demos.Operators2;
import java.util.*;
public class Die {

    public static void randomdie(){
        Random random= new Random();
        for(int i=1;i<=3;i++){
            int n=random.nextInt(7);
            System.out.println(n);
        }

    }
    public static void main(String[] args) {
        randomdie();
        
    }
    
}

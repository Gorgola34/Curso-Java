package Operators2;
import java.util.Random;

public class RandomNumber {

    public static int randomNumber(){
        Random random= new Random();
        int n=random.nextInt(10);
        return n;
    }

    public static void showRandom(int n){
        System.out.println("El número es: " + n);

    }
    public static void main(String[] args) {
        showRandom((randomNumber()));
        
    }
    
}

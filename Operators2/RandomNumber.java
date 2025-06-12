package Operators2;
import java.util.Scanner;
import java.util.Random;
public class RandomNumber {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Adivina el numero:" );
        int number=scanner.nextInt();
        Random random= new Random();
        int SecretNumber= random.nextInt(11);
        scanner.close();
        System.out.println(SecretNumber);
       if(SecretNumber==number){
        System.out.println("Adivinaste el número secreto ");
       }else{
        System.out.println("No has adivinado el número secreto, el número es: "+ SecretNumber);
       }
       


        
    }


    
}

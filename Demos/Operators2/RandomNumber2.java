package Demos.Operators2;
import java.util.Scanner;
import java.util.Random;
public class RandomNumber2 {

    public static int randomNumber(){
        Random random=new Random();
        int secretNumber=random.nextInt(10);
        return secretNumber;
    }

    public static int scannerBy(){
        Scanner scanner= new Scanner(System.in);
        int number=scanner.nextInt();
        scanner.close();
        return number;

    }

    public static void main(String[] args) {
        int number=scannerBy();
        int secretNumber=randomNumber();
        if(secretNumber==number){
            System.out.println("Adivinaste el número");
        }else{
            System.out.println("No has adivinado el número, era: " + secretNumber);
        }

        
    }


    
}

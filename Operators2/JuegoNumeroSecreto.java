package Operators2;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Random;
public class JuegoNumeroSecreto {

    public static int numberRandom(){
        Random random = new Random();
        int secretNumber=random.nextInt(31);
        return secretNumber;
    }
    
    public static void main(String[] args) {
        HashSet<Integer> save= new HashSet<Integer>();
        int secretNumber=numberRandom();
        int intentoMin=1;
        int intentoMax=4;
        
        System.out.println("Introduce numero entre el 0 y 30");
         Scanner scanner=new Scanner(System.in);
        for(int i=intentoMin; i<=intentoMax;i++){
       
        int number=scanner.nextInt();
        
            if(save.contains(number)){
                System.out.println("No vale el intento, prueba con otro numero no repetido");
                i--;
            }
            save.add(number);
            if(number<secretNumber){
                System.out.println("Subelo, te quedan intentos: " + (intentoMax-i));
            }else if(number>secretNumber){
                System.out.println("Bajalo, te quedan intentos:" + (intentoMax-i));
            }else{
                System.out.println("Enhorabuena acertaste");
                break;
            }
        }
        scanner.close();
        System.out.println("GAME OVER");
        System.out.println(secretNumber);

        
    }

    
    
}


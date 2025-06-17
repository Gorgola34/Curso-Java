package Operators2;
import java.util.*;

public class SecretNumberGame {

     
    public static int scannerBy(){
        
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        return n;
    }

    public static int RandomNumber(){
        Random random= new Random();
        int ns=random.nextInt(41);
        return ns;

    }

    public static void main(String[] args) {
        int ns=RandomNumber();
        int intento=1;
        int intentomax=4;
        HashSet<Integer> save= new HashSet<>();
        System.out.println("Introduce numero del 0 al 40");
        for(int i=intento;i<=intentomax;i++){
            int n=scannerBy();
            if(save.contains(n)){
                System.out.println("No vale el intento");
                i--;
            }
            save.add(n);

            if(n<ns){
                System.out.println("Subelo" + (intentomax-i));
            }else if(n>ns){
                System.out.println("Bajamelo" + (intentomax-i));
            }else{
                System.out.println("Has ganado");
            }

        }
        System.out.println(ns);
        System.out.println("GAME OVER");

    }


   
}

package Demos.Exercises;
import java.util.*;
public class Game {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Random random= new Random();
        String[] game={"Piedra","Papel","Tijeras"};
        System.out.println("Piedra=0, Papel=1.Tijeras=2");
        int user=scanner.nextInt();
        int computer=random.nextInt(3);
        System.out.println("Tu elegiste: " + game[user]);
        System.out.println("La computadora eligió: " + game[computer]);

        if(user==computer){
            System.out.println("Empate");
        }else if
        ((user==0&&computer==2)||
        (user==1&&computer==0)||
        (user==2&&computer==1)){
            System.out.println("Ganaste");

        }else{
            System.out.println("Perdiste");
        }
         scanner.close();
         
        }


       
            

        }


        


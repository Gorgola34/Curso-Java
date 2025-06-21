package Demos.Exercises;
import java.util.*;
public class Game {

    public static void main(String[] args) {
        boolean want=true;
        Scanner scanner= new Scanner(System.in);
        Random random = new Random();

        while(want){
            String [] options={"Piedra", "Papel", "Tijeras"};
            System.out.println("0=Piedra, 1=Papel, 2= Tijeras");
            int option=scanner.nextInt();
            scanner.nextLine();
            int computer=random.nextInt(3);
            System.out.println("Elegiste " + options[option]);
            System.out.println("La computadora eligió " + options[computer]);

            if(option==computer){
                System.out.println("Empate");
            }else if
            ((option==0&&computer==2)||
            (option==1&&computer==0)||
            (option==2&&computer==1)){

            }else{
                System.out.println("Ganaste");
            }

            System.out.println("¿Quieres continuar?");
            String answer=scanner.nextLine();
            if(answer.equals("n")||(answer.equals("no"))){
                want=false;
            }
            }
            System.out.println("Gracias por jugar");
        }
    }
    


package Demos.Exercises;
import java.util.*;
public class Game {

    public static int scannerBy(){
        Scanner scanner= new Scanner(System.in);
        int option=scanner.nextInt();
        return option;
    }
    public static int random(){
        Random random= new Random();
        int computer=random.nextInt(3);
        return computer;
    }
    public static String scanner(){
         Scanner scanner2= new Scanner(System.in);
        String answer=scanner2.nextLine();
        return answer;
    }
       
    public static void main(String[] args) {

        boolean want=true;
        while(want){
            String[] options ={"Piedra","Papel","Tijeras"};
            System.out.println("0=Piedra,1=Papel,2=Tijeras");
            int option=scannerBy();
            int computer=random();
            System.out.println("Elegiste:  " + options[option]);
            System.out.println("La computadora eligió: " + options[computer]);

            if(option==computer){
                System.out.println("Empate");
            }else if
            ((option==0&&computer==2)||
            option==1&&computer==0||
            option==2&&computer==1){
                System.out.println("Ganaste");

            }else{
                System.out.println("Perdiste");
            }
            System.out.println("¿Quieres seguir jugando?");
            String answer=scanner();
            if(answer.equals("no")||
            answer.equals("n")){
                want=false;
            }
        
        }
        System.out.println("Gracias por jugar");
    
    }
    
}
package Demos.ExtraExercises;
import java.util.*;
public class Exceptions3 {

    public static String scannerby(){
        Scanner scanner= new Scanner(System.in);
        String age=scanner.nextLine();
        return age;
    }
    public static void main(String[] args) {
        
        try{
            String age=scannerby();
        int n=Integer.parseInt(age);
            if(n<0){
                throw new IllegalArgumentException("La edad no negativa");
            }
        }catch(NumberFormatException e){
            System.out.println("Error no valen letras");
        }catch(IllegalArgumentException e){
            System.out.println("No valen negativos");
        }finally{
            System.out.println("Programa iniciado");
        }

        }

        }
    

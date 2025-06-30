package Demos.ExtraExercises;
import java.util.*;
public class Exceptions4 {

    public static String scannerby(){
        Scanner scanner= new Scanner(System.in);
        String age=scanner.nextLine();
        scanner.close();
        return age;
    }

    public static void tryCatch(String age){
        
        try {
            int n=Integer.parseInt(age);
            if(n<0){
                throw new IllegalArgumentException();
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Lo siento chiquitin, solo número");
        }catch(IllegalArgumentException e){
            System.out.println("Lo siento bebe, no vale negativos");
        }finally{
            System.out.println("Programa iniciado");
        }

    }
    public static void main(String[] args) {
        String age=scannerby();
        tryCatch(age);
    }
    
}

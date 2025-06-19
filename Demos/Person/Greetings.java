package Demos.Person;
import java.util.*;
public class Greetings {

    public static void main(String[] args) {
       
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduzca nombre: ");
        String name=scanner.nextLine();
        System.out.println("Introduzca edad ");
        double age=scanner.nextInt();
        System.out.println("Hola "+ name);
        System.out.println("Tienes "+ age+ " Años");
        scanner.close();
    }
    
}

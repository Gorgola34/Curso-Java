package Demos.Person;
import java.util.*;
public class Person2 {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        System.out.println("Introduce nombre: ");
        String name=scanner.nextLine();
        System.out.println("Introduce edad: ");
        int age=scanner.nextInt();
        System.out.println("Introduce altura: ");
        
        System.out.println("Hola, te llamas: " + name);
        System.out.println("Tu edad es: "+ age);
    
        scanner.close();




        
    }
    
}

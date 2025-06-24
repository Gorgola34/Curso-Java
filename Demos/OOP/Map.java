package Demos.OOP;
import java.util.Scanner;
public class Map {

    public static void main(String[] args) {

        Coordinates c= new Coordinates(0, 0, 0);
        Coordinates c1= new Coordinates(12.4, 45.6, 89.0);
        Scanner scanner= new Scanner(System.in);
        System.out.println("Coordenadas:");
        int x=scanner.nextInt();
        int y= scanner.nextInt();
        int z=scanner.nextInt();
        Coordinates c2= new Coordinates(x, y, z);
        c2.show();

        
    }

    
}

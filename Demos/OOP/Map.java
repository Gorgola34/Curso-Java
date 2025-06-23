package Demos.OOP;
import java.util.*;
public class Map {

    public static void main(String[] args) {
        Coordinates c1= new Coordinates(0, 0, 0);
        Coordinates c2= new Coordinates(12,45,67);
        Scanner scanner= new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int z=scanner.nextInt() ;
        Coordinates c3= new Coordinates(x, y, z);
        c3.showCoord();

    }
    
}

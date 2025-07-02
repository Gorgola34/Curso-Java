package Demos.OOP;
import java.util.*;
public class Map {

    public static void main(String[] args) {

        Coord c1= new Coord(0, 0, 0);
        Coord c2=new Coord(120, 45, 60);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce x");
        int x=scanner.nextInt();
        System.out.println("Introduce y");
        int y=scanner.nextInt();
        System.out.println("Introduce z");
        int z=scanner.nextInt();
        Coord c3= new Coord(x, y, z);
        c1.show();
        c2.show();
        c3.show();
        
    }
    
}

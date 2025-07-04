package Demos.OOP;
import java.util.*;
public class Map2 {

    public static void main(String[] args) {
        
        
        Scanner scanner= new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int z=scanner.nextInt();
        Coordinates2 c1= new Coordinates2(x,y,z);
        Coordinates2 c2= new Coordinates2(x,y,z);
        Coordinates2 c3= new Coordinates2(x, y, z);
        c1.show(0,0,0);
         c2.show(120,45,24);
         c3.show(x, y, z);
       


    }
    
}

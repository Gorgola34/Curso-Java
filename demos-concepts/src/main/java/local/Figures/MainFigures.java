package local.Figures;
import java.util.*;
public class MainFigures {

    public static void main(String[] args) {
        // Circle c= new Circle(12);
        // Triangle t= new Triangle(3,5);
        // Rectangle r= new Rectangle(4,2);
        // System.out.println(c.calculateArea());
        // System.out.println(t.calculateArea());
        // System.out.println(r.calculateArea());

        ArrayList<Area> a= new ArrayList<>();
        a.add(new Circle(12));
        a.add(new Rectangle(3,4));
        a.add(new Triangle(2,5));

        double totalArea=0;

        for(Area row:a){
           double total=row.calculateArea();
             totalArea+=total;
            System.out.println(row.calculateArea());
            System.out.println(totalArea);
            
        }
    
        


    }

}

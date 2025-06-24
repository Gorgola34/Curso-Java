package Demos.OOP;
public class Coordinates {

    double x;
    double y;
    double z;

    public Coordinates(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;

    }

    public void show(){
        System.out.println("""
                x:   %s
                y:   %s
                z:   %s
                """.formatted(x,y,z));
    }
}

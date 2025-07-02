package Demos.OOP;
public class Coord {

    int x;
    int y;
    int z;

    public Coord(int x,int y,int z){
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

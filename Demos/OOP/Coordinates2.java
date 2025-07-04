package Demos.OOP;
public class Coordinates2 {

    int x;
    int y;
    int z;

    public Coordinates2(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;

    }
    public void show(int x,int y,int z){
        System.out.println("""
                x:    %s
                y:    %s
                z:    %s
                """.formatted(x,y,z));
    }


    
}

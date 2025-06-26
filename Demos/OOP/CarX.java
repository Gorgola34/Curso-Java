package Demos.OOP;
public class CarX {

    public static int num=0;

    int id;
    String brand;
    char model;
    int speed;

    public CarX(String brand, char model,int speed){
        num++;
        this.id=num;
        this.brand=brand;
        this.speed=speed;

    }
    public static void acelerate(){
        System.out.println("Soy un coche y acelero");
    }
    public static void stop(){
        System.out.println("Soy un coche y freno");
    }
    
}

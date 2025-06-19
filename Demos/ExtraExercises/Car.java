package Demos.ExtraExercises;

public class Car {

    String brand;
    String model;
    int speed;

    public Car(String brand, String model,int speed){
        this.brand=brand;
        this.model=model;
        this.speed=speed;

        
    }
    public void acelerate(int speed){
        speed+=20;
        System.out.println("la velocidad es: " + speed);
    }
    public void stop(int speed){
           speed-=20;
           System.out.println("la velocidad es " + speed);
    }
    
}


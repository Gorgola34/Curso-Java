package Demos.ExtraExercises;

public class CarMain {

    public static void main(String[] args) {
        Car c1= new Car("renault", "deportivo", 20);
        Car c2= new Car("ford", "familar", 0);
        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.speed);
        c1.acelerate(30);
        c1.stop(30);
        
        
    }
    
}

package Demos.OOP;

public class MainCar {

    public static void main(String[] args) {
        
        Car c1=new Car(4,"Rojo",4,"Ford",true,'F');
        Car c2=new Car(2,"Azul",2,"Toyota",false,'S');
        Car c3=new Car(2,"Amarillo",2,"Renault",true,'D');
        c1.ShowInfo();
        System.out.println("--------");
        c2.ShowInfo();
        System.out.println("-----------");
        c3.ShowInfo();
    }
    
}

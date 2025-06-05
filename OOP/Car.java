package OOP;

public class Car {
    int seats;
    String color;
    int carDoors;
    String brand;
    boolean isAuto;
    char type;

    public Car(int seats, String color, int carDoors,String brand,boolean isAuto,char type){
        this.brand=brand;
        this.carDoors=carDoors;
        this.seats=seats;
        this.color=color;
        this.isAuto=isAuto;
        this.type=type;


    }
    public void ShowInfo(){
        System.out.println("Brand:"+brand);
        System.out.println("Color:"+color);
        System.out.println("Type:"+type);
        System.out.println("CarDoors:"+carDoors);
        System.out.println("¿Es Automatico?:"+isAuto);
        System.out.println("Seats:"+seats);
        
    }
   
    }
    
    


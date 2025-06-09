package Cars;

public class Car2 {
    public static int numCar=0;

    int id;
    int seats;
    String color;
    int carDoors;
    String brand;
    boolean isAuto;
    char type;

    public Car2 (int id,int seats,String color,int carDoors,String brand,boolean isAuto,char tyype){
        this.id=numCar;
        this.seats=seats;
        this.color=color;
        this.brand=brand;
        this.carDoors=carDoors;
        this.isAuto=isAuto;
        this.type=type;
        numCar=numCar+1;


    }
    public void show (){

        System.out.println("Id:"+ id);
        System.out.println("Seats:"+ seats);
        System.out.println("Color:" + color);
        System.out.println("Brand:" + brand);
        System.out.println("carDoors:" + carDoors);
        System.out.println("¿Es automatico:" + isAuto);
        System.out.println("Type:" +type);

    }


    
}

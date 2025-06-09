package Cars;

public class Car2 {
    public static int numCars=0;

    int id;
    int seats;
    String color;
    int carDoors;
    String brand;
    boolean isAuto;
    char type;

    public Car2(){
        this.brand=brand;
        this.carDoors=carDoors;
        this.seats=seats;
        this.color=color;
        this.isAuto=isAuto;
        this.type=type;
        numCars=numCars +1;
        this.id=numCars;
    }
    public static void showCar(int id,String brand, String color,String type, String carDoors,boolean isAuto,int seats){
        System.out.println("Id:" + numCars);
        System.out.println("Brand:"+brand);
        System.out.println("Color:"+color);
        System.out.println("Type:"+type);
        System.out.println("CarDoors:"+carDoors);
        System.out.println("¿Es Automatico?:"+isAuto);
        System.out.println("Seats:"+seats);

        }
    
}

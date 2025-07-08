package Demos.ExtraExc2;
import java.util.*;

public class Car {

    public static int num=0;
    public static ArrayList<Car> x= new ArrayList<>();

    int id;
    String brand;
    String color;
    Type type;
    boolean isRent;

    public Car(String brand, String color, Type type, boolean isRent){
        num++;
        this.id=num;
        this.brand=brand;
        this.color=color;
        this.type=type;
        this.isRent=isRent;

        x.add(this);
    }
    public static void seekBrand(){
        Scanner scanner= new Scanner(System.in);
        String seek=scanner.nextLine();
        for(Car c:x){
            if(c.brand.equalsIgnoreCase(seek)){
                System.out.println(c.color);

            }
        }
    }
    public static boolean Rent(){
        for(Car c:x){
            if(!c.isRent){
                c.isRent=true;
                return true;
            }
        }
        return false;
    }
    public static boolean returnCar(){
        for(Car c:x){
            if(c.isRent){
                c.isRent=false;
                return true;
            }
        }
        return false;
    }
    public static void show(){
        for(Car c:x){
            String m=c.isRent?"Si":"No";
            System.out.println("""
                    Id       %s
                    Brand    %s
                    Color    %s
                    Type     %s
                    Alquiler:  %s
                    """.formatted(c.id,c.brand,c.color,c.type,m));
        }
    }  
}

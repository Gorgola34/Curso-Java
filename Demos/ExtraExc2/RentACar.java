package Demos.ExtraExc2;

public class RentACar {

    public static void main(String[] args) {
        Car c1= new Car("toyota", "Rojo", Type.Deportivo, false);
        Car c2= new Car("Renault","Azul",Type.Familiar,true);

        Car.seekBrand();
        System.out.println(Car.Rent());
        System.out.println(Car.returnCar());
        Car.show();
    }
    
}

package Cars;


public class MainCar2 {

    public static void main(String[] args) {
       Car2 c1=new Car2(0, 4, "Rojo", 4, "Toyota", false, 'D');
       Car2 c2=new Car2(0,4,"Amarillo",4,"Ford",true,'F');
       Car2 c3= new Car2(0,4,"Blanco",4,"Ford",true,'d');
       c1.showCar();
       System.out.println("---------");
       c2.showCar();
       System.out.println("---------");
       c3.showCar();

        
    
    }
    
}

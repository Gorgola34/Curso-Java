package Shapes;

public class Shape {
    //Declaración
    //Sobrecarga de métodos/funciones

    public static double calculateArea(double l){
        double area=l*l;
        return area;
    }
    public static double calculateArea(double base, double height){
        double area=base*height;
        return area;
    }
    //Invocarla,llamarla, ejecutarla
    public static void show(double area){
        System.out.println("El área es:" + area);
    }

    public static void main(String[] args) {
        show(calculateArea(4));
        show(calculateArea(8));
        show((calculateArea(16)));
        System.out.println(calculateArea(5));
        show((calculateArea(2, 5)));
        
    }

    
    
}

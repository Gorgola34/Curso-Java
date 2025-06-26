package OOP;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {

    Square sq= new Square(10);
    Square sq10 = new Square(70);
    System.out.println(sq);
    System.out.println(sq10);
    System.out.println(sq.clone());
    System.out.println(sq10.clone());
    String type="Cuadrado";
    System.out.println(sq.toString());
    System.out.println(sq.equals(type));
    System.out.println(sq.toString());
    
        
    }

    
    
}

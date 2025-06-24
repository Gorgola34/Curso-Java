import OOP.Square;

public class Functions {

    public static void foo(Square sqFoo){
        Square newSq=new Square(sqFoo);
        newSq.side*=2;

    }

    public static void main(String[] args) {

        Square sq1= new Square(10);
        foo(sq1);
        System.out.println(sq1);
        
    }

}

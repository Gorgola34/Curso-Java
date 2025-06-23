package Pet;

public class App {

    public static void main(String[] args) {
        Dog d1= new Dog("Rosdol",3);
        Cat c1= new Cat("Mau",5);
        System.out.println(d1.name);
        System.out.println(d1.color);
        System.out.println("-------------");
        System.out.println(c1.color);
        d1.sleep();
        d1.eat();
        c1.eat();

    }

}

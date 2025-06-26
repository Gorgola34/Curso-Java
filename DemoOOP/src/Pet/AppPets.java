package Pet;

public class AppPets {

    public static void playDog(){
        Dog d1= new Dog("Chidori", 1);
        System.out.println(d1 instanceof Pet);
        System.out.println(d1 instanceof Object);
        System.out.println(d1 instanceof Dog);
        
        System.out.println(d1.name);
        System.out.println(d1.age);
        System.out.println(d1.color);
        
        d1.sound();
        d1.eat();
        d1.sleeping();
        d1.smile();
    }

    public static void playCat(){
        Cat c1= new Cat("Silvestre",1);
        System.out.println(c1.name);
        System.out.println(c1.age);
        System.out.println(c1.color);
         c1.sound();
         c1.eat();
         c1.sleeping();
         c1.smile();
    }

    public static void main(String[] args) {
        playCat();
        System.out.println("---------");
        playDog();
        
    }

}

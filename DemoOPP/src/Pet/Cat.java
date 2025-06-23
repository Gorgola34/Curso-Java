package Pet;

public class Cat extends Pet implements eat {

    String color;

    public Cat(String name,int age){
        super(name, age);
        color="Naranja";
    }

    @Override
    public void eat() {
       System.out.println("Como como un gato");
    }

}

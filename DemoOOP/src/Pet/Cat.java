package Pet;

public class Cat extends Pet implements Eating, Sleep, Sound {

    String color;

    public Cat(String name,int age){
        super(name, age);
        color="Naranja";
    }

    @Override
    public void eat() {
       System.out.println("Como como un gato");
    }

    @Override
    public void sleeping() {
        System.out.println("Soy un gato y duermo mucho");
    }

    @Override
    public void sound() {
        System.out.println("miauuu miauuuuuuu");

}

}

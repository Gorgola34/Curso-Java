package Pet;

public class Dog extends Pet implements eat {

    String color;

    public Dog (String name,int age) {
        super(name, age);
        color="Rojo";
    }

    protected void sleep(){
        System.out.println("Estoy durmiendo como un perro");
    }

    @Override
    public void eat() {
       System.out.println("Como como un perro");
    }
   

}

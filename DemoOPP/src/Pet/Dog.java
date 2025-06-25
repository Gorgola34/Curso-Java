package Pet;

public class Dog extends Pet implements Eating, Sleep,Sound {

    String color;

    public Dog (String name, int age) {
        super(name,age);
      
        color="Rojo";
    }


    @Override
    public void eat() {
       System.out.println("Como como un perro");
    }


    @Override
    public void sleeping() {
        System.out.println("Hola duermo como un perro");
    }


    @Override
    public void sound() {
        System.out.println("guau guau");
    
   
}

}


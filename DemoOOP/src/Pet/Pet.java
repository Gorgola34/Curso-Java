package Pet;

public abstract class Pet {

    String name;
    int age;

    public Pet(String name, int age){
       
        this.name=name;
        this.age=age;

    }

    public Pet(String name){
        this.name=name;
        this.age=0;
    }

    public void smile(){
        System.out.println("Yo sonrio");

    }
    

}

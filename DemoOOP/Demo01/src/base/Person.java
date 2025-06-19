package base;

public class Person {

    String name;
    int age;


    public Person(String name, int age){
        this.name=name;
        this.age=age;


    }
    public void greetings(){
        System.out.printf("Hola soy %s y tengo %s años",name,age);
    }

}

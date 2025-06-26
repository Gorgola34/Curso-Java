package Person;

public class Person {

    public static int instances=0;

    private String name;
    private int age;

    public static void counter(){
        instances++;
    }


    public Person(String name, int age){
        this.name=name;
        this.age=age;
        counter();


    }
    public void greetings(){
        System.out.printf("Hola soy %s y tengo %s años",name,age);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;

    }

    public int getAge(){
        return age;
    }
    public void birthyear(int age){
        
        if(age<this.age){
            return;
        } this.age=age;

    }

}

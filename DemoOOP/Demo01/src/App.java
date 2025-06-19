import base.Person;

public class App {
    public static void main(String[] args) {

        Person person1 = new Person("Salva",22);
        Person person2= new Person("Alex",34);
        Person person3= new Person("María",18);
        person1.birthyear(40);
        person1.greetings();
        System.out.println();
        person2.greetings();
        System.out.println();
        person3.greetings();
        

    }
}

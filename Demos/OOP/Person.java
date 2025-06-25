package Demos.OOP;
public class Person {

    public static int num=0;
    private int id;
    private String name;
    private int age;

    public Person(String name,int age){
        num++;
        this.id=num;
        this.name=name;
        this.age=age;

    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    
}

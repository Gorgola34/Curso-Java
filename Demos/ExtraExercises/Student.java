package Demos.ExtraExercises;

public class Student {

    String name;
    int age;
    double calification;

    public Student(String name, int age, double calification){
        this.name=name;
        this.age=age;
        this.calification=calification;


    }
    public boolean isPass(){
        if(calification>=5){
            return true;
        }else{
            return false;
        }

    }
    public void show(){
        System.out.printf("Estudiante: %s que tiene %s años, su nota %s ",name,age,calification);
    }
    
}

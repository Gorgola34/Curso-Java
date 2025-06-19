package Demos.ExtraExercises;
import java.util.*;
public class StudentsMain {

    public static void main(String[] args) {
        Student s1=new Student("pepe",23,4.5);
        Student s2=new Student("manu",34,9.6);

       ArrayList<Student> x= new ArrayList<Student>();
       x.add(new Student("salva", 20, 7.8));
       x.add(new Student("manu",34,3.6));

       for(Student student:x){
        student.show();
       }
    }
    
}

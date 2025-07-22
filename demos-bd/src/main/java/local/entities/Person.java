package local.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="person")
public class Person {
    @Id()
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;

    private String name;

    private String surname;

    private String email;

    public Person(){
        //JPA default constructor
    }
    public Person(String name,String surname,String email){
        this.name=name;
        this.surname=surname;
        this.email=email;
    }
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email + "]";
    }


}

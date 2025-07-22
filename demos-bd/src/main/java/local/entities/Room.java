package local.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "room")
public class Room {
    @Id()
    private int id;

    private String name;

    private int capacity;

    public Room(){
        //JPA default constructor
    }

    public Room(int id, String name, int capacity){
        this.id=id;
        this.name=name;
        this.capacity=capacity;
    }

    @Override
    public String toString() {
        return "Room [id=" + id + ", name=" + name + ", capacity=" + capacity + "]";
    }

}

package local.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="record")
public class Record {
    @Id()
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String content;

    public Record(){
        //JPA default constructor
    }

    public Record(String content){
        this.content=content;
    }

    @Override
    public String toString() {
        return "Record [id=" + id + ", content=" + content + "]";
    }


}

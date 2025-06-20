package Game;

import java.util.ArrayList;
import java.util.UUID;

public class Character{


    private static ArrayList<Character> characterList=new ArrayList<>();

    public static void showCharacter(){
        for(Character character:characterList){
            System.out.println(character.name);
        }
    }


    private UUID id;
    private String name;
    private Species specie;
    private double hp;
    private int strenght;
    private Role role;
    private  boolean isZombie;

    public Character(String name, Species specie, double hp, int strenght, Role roll, boolean isZombie){
        
       
        this.id=UUID.randomUUID();
        this.name=name;
        this.specie=specie;
        this.hp=hp;
        this.strenght=strenght;
        this.role=roll;
        this.isZombie=isZombie;

        characterList.add(this);
        

    }

    public void showInfo(){
        String messageZombie= isZombie? "Es un zombie":"No es un zombie";
        System.out.println("""
            Id:       %s
            Name:     %s
            Specie:   %s
            Hp:       %s
            Strenght: %s
            Roll:     %s
            ¿Es zombie?: %s
                
                """.formatted(id,name,specie, hp, strenght, role, messageZombie));
    }
    public void setName(String name2){
        name=name2;
    }




}

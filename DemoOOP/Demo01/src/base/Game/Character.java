package base.Game;

public class Character {

    private String name;
    private char specie;
    private double hp;
    private int strenght;
    private String roll;
    private  boolean isZombie;

    public Character(String name, char specie, double hp, int strenght, String roll, boolean isZombie){
        this.name=name;
        this.specie=specie;
        this.hp=hp;
        this.strenght=strenght;
        this.roll=roll;
        this.isZombie=isZombie;

    }

    public void showInfo(){
        System.out.println("""
            Name:     %s
            Specie:    %s
            Hp:       %s
            Strenght:  %s
            Roll:      %s
            ¿Es zombie?: %s
                
                """.formatted(name,specie, hp, strenght, roll, isZombie));
    }




}

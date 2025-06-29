package Demos.Poke.Pikachu;
public abstract class Pokemon {

   private int id;
   private String name;

    public Pokemon(int id, String name){
        this.id=id;
        this.name=name;

    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public static void attack(){
        System.out.println("Ataque rápido");
    }
    public static void quickle(){
        System.out.println("Placaje");
    }
    
}

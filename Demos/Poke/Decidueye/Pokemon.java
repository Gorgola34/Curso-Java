package Demos.Poke.Decidueye;
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

    public void picotazo(){
        System.out.println("Picotazo");
    }
    public void danzaPluma(){
        System.out.println("Danza pluma");
    }

}

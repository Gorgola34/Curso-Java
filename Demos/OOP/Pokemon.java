package Demos.OOP;
public abstract class Pokemon  {

   private int id;
   private String name;

    public Pokemon(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int dame_id(){
        return id;
    }
    public String dame_name(){
        return name;
    }
    public void  Placaje(){
        System.out.println("Placaje");
    }
    public void Hiperrayo(){
        System.out.println("Hiperrayo");
    }
    
}

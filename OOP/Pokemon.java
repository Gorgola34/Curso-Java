package OOP;
public abstract class Pokemon  {

   private int id;
   private String name;

    public Pokemon(){
        id=376;
        name="Metagross";
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

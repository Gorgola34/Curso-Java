package Pokemon;
public abstract class Pokemon {

    private int id;
    private String name;
    private String generation;
    

    public Pokemon(){

        id=146;
        name="Moltres de Galar";
        generation="Octava";
        

    }
    public String dame_name(){
        return name;

    }
    public String dame_gen(){
        return generation;
    }
    public void VeloSagrado (){
        System.out.println("Velo Sagrado");
    }
    public void PoderPasado(){
        System.out.println("Poder Pasado");
    }
    public int dame_id(){
        return id;
    }
    

    
}

package data.Generics;

public class Dragonite extends Pokemon implements Dragon,Volador {

    private String type;
    private String type2;
    private String category;
    private String hability;

    public Dragonite(int id, String name){
        super(id, name);

        type="Volador";
        type2="Dragón";
        category="Dragón";
        hability="Fuerza Mental";
    }
    public String getType(){
        return type;
    }
    public String getType2(){
        return type2;
    }
    public String getCategory(){
        return category;
    }
    public String getHability(){
        return hability;
    }
    public void setHability(String h2){
        hability=h2;
    }
    @Override
    public void Vendaval() {
        System.out.println("Vendaval");
    }
    @Override
    public void enfado() {
        System.out.println("Enfado");
    }
    @Override
    public void danzaDragon() {
       System.out.println("Danza Dragón");
    }
    @Override
    public void hiperrayo() {
       System.out.println("Hiperrayo");
    }


}

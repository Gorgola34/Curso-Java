package Demos.Poke.Decidueye;
public class Decidueye extends Pokemon implements IFantasma,Iplanta {

    private String type;
    private String type2;
    private String category;
    private String hability;

    public Decidueye(int id, String name){
        super(id, name);
        type="Planta";
        type2="Fantasma";
        category="Pluma flecha";
        hability="Espesura";
        
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
    public void setHability(String hability2){
        hability=hability2;
    }
    @Override
    public void hojaAguda() {
        System.out.println("Hoja Aguda");
    }
    @Override
    public void puntadaSombria() {
         System.out.println("Puntada Sombria");
    }
    

}

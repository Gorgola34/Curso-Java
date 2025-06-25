package Demos.Poke.Lucario;

public class Lucario extends Pokemon implements TipoAcero,TipoLucha {

     private String type1;
     private String type2;
     private String category;
     private String hability;

    public Lucario(int id, String name){
        super(id, name);
        type1="Acero";
        type2="Lucha";
        category="Aura";
        hability="Impasible";


    }
    public String getType1(){
        return type1;
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
    public void esferaAural() {
        System.out.println("Esfera Aural");
    }
    @Override
    public void puñoMeteoro() {
        System.out.println("Puño meteoro");
    }

}

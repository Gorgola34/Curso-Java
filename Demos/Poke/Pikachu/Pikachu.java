package Demos.Poke.Pikachu;

public class Pikachu extends Pokemon implements Ielectrico {

   private String type;
   private String hability;
   private String category;

    public Pikachu(int id,String name){
        super(id,name);
        type="Eléctrico";
        hability="Electricidad estática";
        category="Ratón";
    }
    public String getType(){
        return type;
    }
    public String getHability(){
        return hability;
    }
    public String getCategory(){
        return category;
    }
    public void setHability(String hability2){
        hability=hability2;

    }
    @Override
    public void placajeElectrico() {
        System.out.println("Placaje Eléctrico");
    }
    @Override
    public void bolaVoltio() {
       System.out.println("Bola Voltio");
    }
    }
    


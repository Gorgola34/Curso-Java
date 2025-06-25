package Demos.Poke.Metagross;

public class Metagross extends Pokemon implements PsiquicoTipo,Acero {

    private String type;
    private String type2;
    private String hability;
    private String category;


    public Metagross(int id, String name){
        super(id,name);
        
        type="Acero";
        type2="Psíquico";
        hability="Cuerpo puro";
        category="Pata hierro";
    }
    public String dame_type(){
        return type;
    }
    public String dame_type2(){
    return type2;
    }
    public String dame_hability(){
        return hability;
    }
    public void cambio_hability(String h2){
        hability=h2;
    }
    @Override
    public void puñoMeteoro() {
        System.out.println("Puño Meteoro");
        
    }
    @Override
    public void Psiquico() {
        System.out.println("Psiquico");
    }
    public String getCategory(){
        return category;
    }
    
    }
    


    


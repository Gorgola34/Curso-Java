package OOP;

public class Metagross extends Pokemon implements PsiquicoTipo,Acero {

    private String type;
    private String type2;
    private String hability;


    public Metagross(){
        type="Acero";
        type2="Psíquico";
        hability="Cuerpo puro";
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
    
    }
    


    


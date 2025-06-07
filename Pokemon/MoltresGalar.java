package Pokemon;
public class MoltresGalar extends Pokemon implements TipoSiniestro,TipoVolador {

    private String category;
    private String type1;
    private String type2;
    private String hability;

    public MoltresGalar(){

        category="Malignidad";
        type1="Siniestro";
        type2="Volador";
        hability="Cólera";
    }
    public String dame_category(){
        return category;
    }
    public String dame_type1(){
        return type1;

    }
    public String dame_type2(){
        return type2;
    }
    public String dame_hability(){
        return hability;
    }
    public void cambio_tipo(String type3){
        type1=type3;
    }
    @Override
    public void AtaqueAereo() {
        System.out.println("AtaqueAereo");
        
    }
    @Override
    public void Legado() {
        System.out.println("Legado");
    }
}

package Pokemon;
public class MainMoltresGalar {

    public static void main(String[] args) {

        MoltresGalar m=new MoltresGalar();
        System.out.println("Id:"+m.dame_id());
        System.out.println("Name:"+ m.dame_name());
        System.out.println("Generation:"+m.dame_gen());
        System.out.println("Category:"+ m.dame_category());
        System.out.println("Type1:"+ m.dame_type1());
        System.out.println("Type2:"+m.dame_type2());
        System.out.println("Hability:"+m.dame_hability());
        System.out.println();
        System.out.println("Ataques:");
        m.PoderPasado();
        m.Legado();
        m.VeloSagrado();
        m.AtaqueAereo();


        
        
    }
    
}

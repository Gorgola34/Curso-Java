package Demos.OOP;
public class Pokedex {

    public static void main(String[] args) {
        Metagross p1= new Metagross();
        System.out.println(p1.dame_id());
        System.out.println(p1.dame_name());
        System.out.println(p1.dame_type());
        System.out.println(p1.dame_type2());
        System.out.println(p1.dame_hability());
        System.out.println("\nAtaques:\n");
        p1.Placaje();
        p1.Hiperrayo();
        p1.Psiquico();
        p1.puñoMeteoro();


        

    }
    
}

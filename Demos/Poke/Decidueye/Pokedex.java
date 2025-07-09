package Demos.Poke.Decidueye;
public class Pokedex {

    public static void main(String[] args) {
        Decidueye p= new Decidueye(724, "Decidueye");
        System.out.println(p.getId());
        System.out.println(p.getName());
        System.out.println(p.getType());
        System.out.println(p.getType2());
        System.out.println(p.getCategory());
        p.setHability("Remoto");
        System.out.println(p.getHability());
        System.out.println("\nAtaques\n");
        p.danzaPluma();
        p.picotazo();
        p.hojaAguda();
        p.puntadaSombria();
        

    }

}

package Demos.Poke.Lucario;

public class Pokedex {

    public static void main(String[] args) {
        
        Lucario l= new Lucario(448,"Lucario");
        System.out.println(l.getId());
        System.out.println(l.getName());
        System.out.println(l.getType1());
        System.out.println(l.getType2());
    
        System.out.println(l.getHability());
        System.out.println(l.getCategory());
        System.out.println("\nAtaques\n");
        l.danzaEspada();
        l.esferaAural();
        l.puñoMeteoro();
        l.velocidadExtrema();


    }

}

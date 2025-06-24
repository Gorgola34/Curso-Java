package Demos.Poke.Lucario;

public class Pokedex {

    public static void main(String[] args) {
        
        Lucario l= new Lucario(448,"Lucario");
        System.out.println(l.id);
        System.out.println(l.name);
        System.out.println(l.type1);
        System.out.println(l.type2);
    
        System.out.println(l.hability);
        System.out.println(l.category);
        System.out.println("\nAtaques\n");
        l.danzaEspada();
        l.esferaAural();
        l.puñoMeteoro();
        l.velocidadExtrema();


    }

}

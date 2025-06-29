package Demos.Poke.Pikachu;

public class Pokedex {

    public static void main(String[] args) {
        
        Pikachu p= new Pikachu(25, "Pikachu");
        System.out.println(p.getId());
        System.out.println(p.getName());
        System.out.println(p.getType());
       // p.setHability("PIKA PIKA");
        System.out.println(p.getHability());
        System.out.println(p.getCategory());
        System.out.println("\nAtaques:\n");
        p.attack();
        p.quickle();
        p.bolaVoltio();
        p.placajeElectrico();
        

    }
    
}

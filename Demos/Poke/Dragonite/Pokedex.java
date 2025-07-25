package data.Generics;

public class Pokedex {

    public static void main(String[] args) {
         Dragonite d= new Dragonite(149,"Dragonite");

         System.out.println("Id:" + d.getId());
         System.out.println("Name:" + d.getName());
         System.out.println("Type:" + d.getType());
         System.out.println("Type:" + d.getType2());
         System.out.println("Category:" + d.getCategory());
         d.setHability("Multiescamas");
         System.out.println("Hability:" + d.getHability());
         System.out.println("\nAtaques\n");
         d.Vendaval();
         d.danzaDragon();
         d.enfado();
         d.hiperrayo();
         
        
    }

   
    


}

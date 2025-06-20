package Game;

public class MainCharacter {

    public static void main(String[] args) {
        Character c1= new Character("Miira",Species.ELFO,200.5,300,Role.MAGO,false);
        Character c2= new Character("Ganon",Species.ORCO,3000.6,800,Role.GUERRERO,true);
        c1.setName("Sheikaa");
        c1.showInfo();
        System.out.println();
        c2.showInfo();
        Character.showCharacter();
        
        
       
       
       
    }

}

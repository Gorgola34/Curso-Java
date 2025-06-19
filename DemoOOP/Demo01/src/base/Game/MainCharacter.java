package base.Game;

public class MainCharacter {

    public static void main(String[] args) {
        Character c1= new Character("Mira",'O',200.5,300,"Wizard",false);
        Character c2= new Character("Ganon",'G',3000.6,800,"Warrior",true);

       c1.showInfo();
       System.out.println();
       c2.showInfo();
    }

}

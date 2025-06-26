package Game;

public class MainCharacter {


public class App {


    static void prepareGame() {
        Character char1 = new Character("Pepe", Species.ELFO, 100, 50, Role.MAGO, false);
        char1.showCharacter();
        Character char2 = new Character("Pepe", Species.ORCO, 120, 500, Role.PEON, false);
        char2.showCharacter();
        
        char1.renameInvalidCharacters("Elfo Pepe");

        Character.showList();
        char2.renameInvalidCharacters("Orco Pepe");
        char2.showCharacter();
        Character.showList();
    }

    public static void main(String[] args) {

        // playWithPersons();
        prepareGame();

    }
}

}

package local.Cards;

public enum Suits {

    HEARTS("Corazones"),
    SPADES("Espadas"),
    DIAMONDS("Diamantes"),
    CLUBS("Tréboles");

    String label;
    
     private Suits (String label){
        this.label=label;
    }

}

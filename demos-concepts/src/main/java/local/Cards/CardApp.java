package local.Cards;
import java.util.*;
public class CardApp {

     List<String> deck= new LinkedList<>();

     void cardsApp(){
        populateDeck();
        Collections.shuffle(deck);
        System.out.println(deck);
        System.out.println(deck.size());
     }

     private void populateDeck(){
        for(Suits suit:Suits.values()){
            System.out.println(suit.label);
            for(int i=1;i<=10;i++){
                deck.add(i +"de" + suit.label);
            }
            deck.add("J de " + suit.label);
            deck.add("Q de" + suit.label);
            deck.add("K de" + suit.label);
        }

     }
     private void makeHand(int n){
       List<String> hand= deck.subList(0, n);
       System.out.println(hand);

     }

    public static void main(String[] args) {
        CardApp cards = new CardApp();
        cards.cardsApp();
        cards.makeHand(5);



    }
    
}

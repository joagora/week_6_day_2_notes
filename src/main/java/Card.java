import java.util.ArrayList;

public class Card {
    private SuitType suit;
    private NumberType number;
    public Card(SuitType suit, NumberType number){
        this.suit = suit;
        this.number = number;
    }

    public SuitType getSuit(){
        return this.suit;
    }
    //this is a method like self in ruby. Static makes it the self method
    public static ArrayList<Card> getDeck(){
        ArrayList<Card> deck = new ArrayList<>();
        //in enums, there is a method that can return all the values
        SuitType[] allSuits = SuitType.values();
        NumberType[] allNumbers = NumberType.values();
        for (NumberType number: allNumbers) {
            for (SuitType suit: SuitType.values()){
                Card newCard = new Card(suit, number);
                 deck.add(newCard);
                }
            }

        return deck;
    }

}

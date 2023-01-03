import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

// For any class created:
// 1. Define class
// 2. Define instance variables
// 3. Create constructor
// 4. Create get/set methods
// 5. Create custom methods (optional)

public class DeckofCards {
    // static = don't have to instantiate
    private static ArrayList<Card> deck;

    /**
     * 1 argument constructor that takes in a collection of card objects
     * @param deck
     */

    // Constructors: 1) Exact same name as class, 2) Don't have a return type
   public DeckofCards(ArrayList<Card> deck) {
       this.deck = deck;
   }

    /**
     * 0 argument constructor
     */

//    public DeckofCards() {
//        List<String> suits = Card.getValidSuits();
//        List<String> faceNames = Card.getValidFaceNames();
//        deck = new ArrayList<>();
//        for (String suit:suits) {
//            for (String faceName:faceNames) {
//                // Calling the constructor
//                deck.add(new Card(faceName, suit));
//                System.out.println(new Card(faceName, suit));
//            }
//        }
//    }

    public DeckofCards() {
        List<String> suits = Card.getValidSuits();
        Hashtable<Integer, String> faceNameHash = Card.getOrderedFaceNames();
        deck = new ArrayList<>();
        for (String suit:suits) {
            for (int i = 2; i <= 14; i++) {
                // Calling the constructor
                deck.add(new Card(faceNameHash.get(i), suit));
                System.out.println(new Card(faceNameHash.get(i), suit));
            }
        }
    }

//    public static void PrintDeck() {
//        for (Card card:deck) {
//            if
//        }
//    }






}
